

public class WorkPark {
    static char[][] map;
    static int[] start = new int[2];

    public static void main(String[] args) {
        solution(new String[]{"OSO","OOO","OXO","OOO"}, new String[]{"E 2","S 3","W 1"});
    }

    public static int[] solution(String[] park, String[] routes) {
        makeMap(park);

        int[] answer = new int[2];

        int x = start[1];
        int y = start[0];
        int height = park.length;
        int width = park[0].length();

        for(int i=0;i<routes.length;i++){
            String[] temp = routes[i].split(" ");
            String direction = temp[0];        //방향
            int distance =  Integer.parseInt(temp[1]);  //거리
            int currX = x;
            int currY = y;

            if(direction.equals("E")){ //동
                boolean flag = true;
                for(int j=1;j<=distance;j++){
                    currX++;
                    if(currX >= width){	//범위를 벗어났나
                        flag = false;
                        break;
                    }
                    // 장애물이 있나
                    else if(park[currY].charAt(currX) =='X'){
                        flag = false;
                        break;
                    }

                }
                if (flag) {
                    x = currX;
                }
            }
            else if(direction.equals("W")){    //서
                boolean flag = true;
                for(int j=1;j<=distance;j++){
                    currX--;
                    if(currX < 0){
                        flag = false;
                        break;
                    }
                    else if(park[currY].charAt(currX) =='X'){
                        flag = false;
                        break;
                    }

                }
                if (flag) {
                    x = currX;
                }
            }
            else if(direction.equals("S")){    //남
                boolean flag = true;
                for(int j=1;j<=distance;j++){
                    currY++;
                    if(currY >= height){
                        flag = false;
                        break;
                    }
                    else if(park[currY].charAt(currX) =='X'){
                        flag = false;
                        break;
                    }

                }
                if (flag) {
                    y = currY;
                }
            }
            else if(direction.equals("N")){    //북
                boolean flag = true;
                for(int j=1;j<=distance;j++){
                    currY--;
                    if(currY < 0){
                        flag = false;
                        break;
                    }
                    else if(park[currY].charAt(currX) =='X'){
                        flag = false;
                        break;
                    }

                }
                if (flag) {
                    y = currY;
                }
            }

        }

        answer[0] = y;
        answer[1] = x;

        return answer;

    }

    public static void makeMap(String[] park) {
        map = new char[park.length][park[0].length()];

        for (int i = 0; i < park.length; i++) {
            for (int j = 0; j < park[0].length(); j++) {
                map[i][j] = park[i].charAt(j);
                if (park[i].charAt(j) == 'S') {
                    start[0] = i;
                    start[1] = j;
                }
            }
        }
    }
}

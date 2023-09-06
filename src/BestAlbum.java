import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

public class BestAlbum {

    static class Music {
        String genre;
        int play;
        int index;

        public Music(String genre, int play, int index) {
            this.genre = genre;
            this.play = play;
            this.index = index;
        }
    }


    static Map<String, Integer> genresMap = new HashMap<>();
    static ArrayList<String> genres_ordered;
    static int[]answer;

    public static void main(String[] args) {
        solution(new String[]{"classic","pop", "classic", "classic", "pop"}, new int[]{500, 600, 150, 800, 2500});
    }

    public static int[] solution(String[] genres, int[] plays) {
        // 장르별로 가장 많이 재생된 노래 두개씩 모아 베스트 앨범 출시
        // 1. 속한 노래가 많이 재생된 장르를 먼저 수록
        // 2. 장르 내에서 많이 재생된 노래를 먼저 수록
        // 3. 장르 내에서 재생 횟수가 같은 노래 중에서는 고유번호가 낮은 노래를 먼저 수록

        makeGenresMap(genres, plays);

        ArrayList<String> sortGenres = sortGenres();
        selectMusic(genres, plays);

        return answer;
    }

    public static void makeGenresMap(String[] genres, int[] plays) {
        for (int i = 0; i < genres.length; i++) {
            genresMap.put(genres[i], genresMap.getOrDefault(genres[i], 0) + plays[i]);
        }
    }

    public static ArrayList<String> sortGenres() {
        genres_ordered = new ArrayList<>();

        while(genresMap.size()!=0){
            int max = -1;
            String max_key = "";
            for(String key : genresMap.keySet()){
                int tmp_cnt = genresMap.get(key);
                if(tmp_cnt>max){
                    max = tmp_cnt;
                    max_key = key;
                }
            }
            genres_ordered.add(max_key);
            genresMap.remove(max_key);
        }

        return genres_ordered;
    }

    public static void selectMusic(String[] genres,int[] plays) {
        ArrayList<Music> result = new ArrayList<>();
        for(String gern : genres_ordered){
            ArrayList<Music> list = new ArrayList<>();
            for(int i=0; i<genres.length; i++){
                if(genres[i].equals(gern)){
                    list.add(new Music(gern, plays[i], i));
                }
            }
            Collections.sort(list, (o1, o2) -> o2.play - o1.play);
            result.add(list.get(0));
            if(list.size()!=1){
                result.add(list.get(1));
            }
        }

        answer = new int[result.size()];
        for(int i=0; i<result.size(); i++){
            answer[i] = result.get(i).index;
        }
    }

}

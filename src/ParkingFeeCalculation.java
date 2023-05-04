import java.text.SimpleDateFormat;
import java.util.HashMap;
import java.util.Map;

public class ParkingFeeCalculation {
    public static void main(String[] args) {
        solution(new int[]{180, 5000, 10, 600},
                new String[]{"05:34 5961 IN", "06:00 0000 IN", "06:34 0000 OUT", "07:59 5961 OUT", "07:59 0148 IN",
                        "18:59 0000 IN", "19:09 0148 OUT", "22:59 5961 IN", "23:00 5961 OUT"});
    }

    public static int[] solution(int[] fees, String[] records) {
        int[] answer = {};

        Map<String, String> map = new HashMap<>();
        Map<String, Integer> pay = new HashMap<>();

        for (String record : records) {
            String time = record.split(" ")[0];
            String num = record.split(" ")[1];
            String inAndOut = record.split(" ")[2];

            if (inAndOut.equals("IN")) {
                map.put(num,time);
            }

            if (inAndOut.equals("OUT")) {
                String inTime = map.get(num);
                System.out.println("num = " + num);
                System.out.println("inTime = " + inTime);
                System.out.println("outTime = " + time);
                map.remove(num);
            }
        }

        System.out.println("map = " + map);

        return answer;
    }
}


//    SimpleDateFormat simpleDateFormat = new SimpleDateFormat("HH:mm");
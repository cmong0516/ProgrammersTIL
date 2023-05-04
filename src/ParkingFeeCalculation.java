import java.text.SimpleDateFormat;
import java.util.Arrays;
import java.util.Date;
import java.util.HashMap;
import java.util.Map;

public class ParkingFeeCalculation {
    public static void main(String[] args) {
        solution(new int[]{180, 5000, 10, 600},
                new String[]{"05:34 5961 IN", "06:34 5961 OUT", "07:34 5961 IN", "08:34 5961 OUT", "09:34 5961 IN", "10:34 5961 OUT", "11:34 5961 IN", "12:34 5961 OUT"});
    }

    public static int[] solution(int[] fees, String[] records){

        Map<String, String> inTimeMap = new HashMap<>();
        Map<String, Integer> takeTimeMap = new HashMap<>();

        for (String record : records) {
            String time = record.split(" ")[0];
            String num = record.split(" ")[1];
            String inAndOut = record.split(" ")[2];

            if (inAndOut.equals("IN")) {
                inTimeMap.put(num,time);
            }

            if (inAndOut.equals("OUT")) {
                String inTime = inTimeMap.get(num);
                System.out.println("num = " + num);
                System.out.println("inTime = " + inTime);
                System.out.println("outTime = " + time);
                SimpleDateFormat simpleDateFormat = new SimpleDateFormat("HH:mm");

                try {
                    Date inTimeDate = simpleDateFormat.parse(inTime);
                    Date outTime = simpleDateFormat.parse(time);

                    long l = (outTime.getTime() - inTimeDate.getTime())/1000/60;
                    System.out.println("l = " + l);

                    takeTimeMap.put(num,takeTimeMap.getOrDefault(num,0) + (int)l);

                } catch (Exception e) {
                    e.printStackTrace();
                }

                inTimeMap.remove(num);
            }
        }

        for (String num : inTimeMap.keySet()) {
            SimpleDateFormat simpleDateFormat = new SimpleDateFormat("HH:mm");
            String closeTime = "23:59";

            String inTime = inTimeMap.get(num);

            try {
                Date inTimeDate = simpleDateFormat.parse(inTime);
                Date closeTimeDate = simpleDateFormat.parse(closeTime);

                long l = (closeTimeDate.getTime() - inTimeDate.getTime()) / 1000 / 60;

                takeTimeMap.put(num, (int) (takeTimeMap.getOrDefault(num,0) + l));
            } catch (Exception e) {
                e.printStackTrace();
            }
        }

        System.out.println("inTimeMap = " + inTimeMap);
        System.out.println("takeTimeMap = " + takeTimeMap);

        return pay(takeTimeMap,fees);
    }

    public static int[] pay(Map<String, Integer> takeTimeMap,int[]fees) {


        int[] answer = new int[takeTimeMap.size()];
        Object[] objects = takeTimeMap.keySet().toArray();
        Arrays.sort(objects);

        int i = 0;

        for (Object object : objects) {
            Integer takeTime = takeTimeMap.get(object);
            System.out.println("takeTime = " + takeTime);
            System.out.println("fees[0] = " + fees[0]);

            if (takeTime > fees[0]) {
                answer[i] = fees[1] + (int) Math.ceil((takeTime - fees[0]) / (double)fees[2]) * fees[3];
            } else {
                answer[i] = fees[1];
            }

            i++;
        }

        System.out.println("answer = " + Arrays.toString(answer));

        return answer;
    }
}
// 1 3 4 7 8 10
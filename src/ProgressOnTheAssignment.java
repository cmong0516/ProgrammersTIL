import java.text.ParseException;
import java.time.Duration;
import java.time.LocalTime;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Stack;

public class ProgressOnTheAssignment {
    public static void main(String[] args) throws ParseException {
        String[][] plans = {{"science", "12:40", "50"}, {"music", "12:20", "40"}, {"history", "14:00", "30"}, {"computer", "12:30", "100"}};
        solution(plans);
    }

    public static String[] solution(String[][] plans) throws ParseException {
        List<String> finish = new ArrayList<>();
        Arrays.sort(plans, ((o1, o2) -> o1[1].compareTo(o2[1])));

        for (String[] plan : plans) {
            System.out.println("plan = " + Arrays.toString(plan));
        }

        // 과제를 시작함

        // 다음 과제 시작시간까지 과제를 한다.
        // 과제를 완료했다면 기존에 못한 과제를 한다.
        // 과제를 완료하지 못했다면 우선 시작해야할 과제를 먼저 한다.

        Stack<String> list = new Stack<>();
        int index = 0;
        int nextIndex = 1;

        while (plans.length != nextIndex) {
            //{과목},{시작시간},{소요시간}
            String[] now = plans[index];
            // 과목이름
            String subject = now[0];
            // 시작시간 {시,분}
            String[] splitSubjectStartTime = now[1].split(":");
            // 소요시간
            int takeTime = Integer.parseInt(now[2]);
            // 시작시간 LocalTime
            LocalTime startTime = LocalTime.of(Integer.parseInt(splitSubjectStartTime[0]),
                    Integer.parseInt(splitSubjectStartTime[1]));
            // 소요시간 Duration
            Duration duration = Duration.ofMinutes(takeTime);
            // 완료예정시간
            LocalTime endTime = startTime.plus(duration);

            String[] next = plans[nextIndex];
            String nextSubject = next[0];
            String[] splitNextSubjectStartTime = next[1].split(":");

            LocalTime nextSubjectStartTime = LocalTime.of(Integer.parseInt(splitNextSubjectStartTime[0]),
                    Integer.parseInt(splitNextSubjectStartTime[1]));

            if (endTime.isAfter(nextSubjectStartTime)) {
                list.add(subject);
            } else {
                finish.add(subject);
            }

            index++;
            nextIndex++;

        }

        finish.add(plans[plans.length-1][0]);

        while (!list.isEmpty()) {
            String peek = list.pop();
            finish.add(peek);
        }


        return finish.toArray(new String[0]);
    }
}

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

public class FileNameSort {
    public static void main(String[] args) {
        solution(new String[]{"F-5 Freedom Fighter", "B-50 Superfortress", "A-10 Thunderbolt II", "F-14 Tomcat"});
    }

    public static String[] solution(String[] files) {
        String[] answer = new String[files.length];

        List<MyFile> myFileList = new ArrayList<>();

        for (String file : files) {
            myFileList.add(new MyFile(file));
        }

        System.out.println("myFileList = " + myFileList);

        myFileList.sort(new Comparator<MyFile>() {
            @Override
            public int compare(MyFile o1, MyFile o2) {
                if (!o1.getHead().equalsIgnoreCase(o2.getHead())) {
                    return o1.getHead().compareToIgnoreCase(o2.getHead());
                }
                return Integer.compare(Integer.parseInt(o1.getNumber()), Integer.parseInt(o2.getNumber()));
            }
        });

        int index = 0;

        for (MyFile myFile : myFileList) {
            answer[index] = myFile.getHead() + myFile.getNumber() + myFile.getTail();
            index++;
        }

        System.out.println("answer = " + Arrays.toString(answer));

        return answer;
    }

    static class MyFile {
        private String head;
        private String number;
        private String tail;

        public MyFile(String fileName) {
            int i = 0;

            StringBuilder headStringBuilder = new StringBuilder();
            StringBuilder numberStringBuilder = new StringBuilder();

            System.out.println("fileName = " + fileName);

            while (!Character.isDigit(fileName.charAt(i))) {
                headStringBuilder.append(fileName.charAt(i));
                i++;
            }

            this.head = String.valueOf(headStringBuilder);

            System.out.println("head = " + head);

            System.out.println("i = " + i);

            while (i < fileName.length()) {
                if (Character.isDigit(fileName.charAt(i))) {
                    numberStringBuilder.append(fileName.charAt(i));
                } else {
                    break;
                }

                i++;
            }

            System.out.println("i = " + i);

            this.number = String.valueOf(numberStringBuilder);
            this.tail = fileName.substring(i, fileName.length());

            System.out.println("number = " + number);
            System.out.println("tail = " + tail);
        }

        public String getHead() {
            return head;
        }

        public String getNumber() {
            return number;
        }

        public String getTail() {
            return tail;
        }
    }
}

// 3 4 5 12 13 14 15 19 20
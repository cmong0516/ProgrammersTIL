import java.util.Arrays;
import java.util.Comparator;

public class PhoneNumberList {
    public static void main(String[] args) {
        boolean solution = solution(new String[]{"119", "97674223", "1195524421"});

        System.out.println("solution = " + solution);
    }

    public static boolean solution(String[] phone_book) {

//        Arrays.sort(phone_book, new Comparator<String>() {
//            @Override
//            public int compare(String o1, String o2) {
//                return o1.length()-o2.length();
//            }
//        });

        Arrays.sort(phone_book);

        System.out.println("phone_book = " + Arrays.toString(phone_book));

        for (int i = 1; i < phone_book.length; i++) {
            if (phone_book[i].startsWith(phone_book[i - 1])) {
                return false;
            }
        }

        return true;

//        for (int i = 0; i < phone_book.length-1; i++) {
//            System.out.println("phone_book[i] = " + phone_book[i]);
//            for (int j = i+1; j < phone_book.length; j++) {
//                System.out.println("phone_book[j] = " + phone_book[j]);
//                if (phone_book[j].startsWith(phone_book[i])) {
//                    return false;
//                }
//            }
//        }

//        return true;
    }
}

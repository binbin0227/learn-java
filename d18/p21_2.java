import java.util.regex.Pattern;

public class p21_2 {
    public static int parseInt(String str) {
        String regex = "[1-9]\\d{0,9}";
        if (!str.matches(regex)) {
            System.out.println("error");
            return 0;
        }
        int result = 0;
        for (int i = 0; i < str.length(); i++) {
            int temp = str.charAt(i) - '0';
            result = result * 10 + temp;
        }
        return result;
    }
}

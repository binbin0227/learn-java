package p11;

import java.util.Scanner;

public class id {
    public static void main(String[] args) {
        String regex1 = "[1-9]\\d{5}(18|19|20)\\d{2}(0[1-9]|1[0-2])(0[1-9]|[12][0-9]|3[01])\\d{3}[\\dXx]";
        Scanner sc = new Scanner(System.in);
        String text = sc.next();
        System.out.println(text.matches(regex1));
    }
}

package p11;

import java.util.Scanner;

public class username {
    public static void main(String[] args) {
        String regex1 = "\\w{4,16}";
        Scanner sc = new Scanner(System.in);
        String text = sc.next();
        System.out.println(text.matches(regex1));
    }
}

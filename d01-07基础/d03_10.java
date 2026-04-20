import java.util.Scanner;
public class d03_10 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println(" 输入第一个整数:");
        int a = sc.nextInt();
        System.out.println(" 输入第二个整数:");
        int b = sc.nextInt();
        boolean result = a == 6 | b == 6 || (a + b) % 6 == 0;
        System.out.println(" 结果为:" + result);
    }    
}

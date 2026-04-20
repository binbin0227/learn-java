import java.util.Scanner;
public class d03_11 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println(" 输入第一个整数:");
        int a = sc.nextInt();
        System.out.println(" 输入第二个整数:");
        int b = sc.nextInt();
        String result = a == b ? "相同" : "不同";
        System.out.println(result);
    }
}
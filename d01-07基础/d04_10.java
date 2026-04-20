import java.util.Scanner;

public class d04_10 {
    public static void main(String[] args) {
        System.out.println("输入数字:");
        Scanner sc = new Scanner(System.in);
        int number1 = sc.nextInt();
        int temp = number1;
        int number2 = 0;
        while (number1 != 0){
            int ge = number1 % 10;
            number1 = number1 / 10;
            number2 = number2 * 10 + ge;
        }
        System.out.println(temp == number2);
    }
}

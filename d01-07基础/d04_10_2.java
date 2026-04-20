import java.util.Scanner;

public class d04_10_2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("被除数：");
        int a = sc.nextInt();
        System.out.println("除数：");
        int b = sc.nextInt();
        int count = 0;
        while (a > b){
            a = a - b;
            count++;
        }
        System.out.println("商是" + count + "，" + "余数是" + a);
    }
}

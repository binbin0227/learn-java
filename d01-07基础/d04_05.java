import java.util.Scanner;

public class d04_05 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("输入星期数：");
        int date = sc.nextInt();
        switch (date) {
            case 1:
                System.out.println("跑步");
                break;
            case 2:
                System.out.println("游泳");
                break;
            case 3:
                System.out.println("慢走");
            default:
                break;
        }
    }
    
}

import java.util.Scanner;

public class d05_04 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int x = sc.nextInt();
        int i = 2;
        while (i < x){
            if (x % i == 0){
                System.out.println("合数");
                break;
            }
            i++;
        }
        if (i == x){
            System.out.println("质数");
        }
    }
}

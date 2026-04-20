import java.util.Scanner;

public class d05_03 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int x = sc.nextInt();
        for (int i = 1; i <= x; i++){
            if (i * i <= x){
                continue;
            }
            System.out.println("x的平方根为" + (i - 1));
            break;
        }
    }
}

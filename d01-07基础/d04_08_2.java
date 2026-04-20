import java.util.Scanner;

public class d04_08_2 {
    public static void main(String[] args) {
        int result = 0;
        Scanner sc = new Scanner(System.in);
        System.out.println("范围左侧：");
        int a = sc.nextInt();
        System.out.println("范围右侧：");
        int b = sc.nextInt();
        for (int i = a; i <= b; i++){
            if (i % 3 == 0 & i % 5 == 0){
                result = result + 1;
            }
        }
        System.out.println(a + "至" + b + "范围内有" + result + "个数能同时被3，5整除");
    }
}

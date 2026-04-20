import java.util.Scanner;

public class d07_05 {
    public static void main(String[] args) {
        int[] raw = new int[6];
        Scanner sc = new Scanner(System.in);
        for (int i = 0; i < raw.length; i++){
            raw[i] = sc.nextInt();
        }
        int max = raw[0];
        int min = raw[0];
        for (int i = 1; i < raw.length; i++) {
            if (raw[i] > max){
                max = raw[i];
            }
            if (raw[i] < min){
                min = raw[i];
            }
        }
        int sum = 0;
        for (int i = 0; i < raw.length; i++) {
            sum += raw[i];
        }
        int result = (sum - max - min) / 4;
        System.out.println(result);
    }
}

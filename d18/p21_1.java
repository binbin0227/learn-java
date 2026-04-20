import java.util.ArrayList;
import java.util.Scanner;

public class p21_1 {
    public static void main(String[] args) {
        ArrayList<Integer> arr = new ArrayList<>();
        Scanner sc = new Scanner(System.in);
        int sum = 0;
        while (true) {
            String numStr=sc.nextLine();
            int num =Integer.parseInt(numStr);
            arr.add(num);
            sum+=num;
            if (sum > 200) {
                break;
            }
        }
    }
}

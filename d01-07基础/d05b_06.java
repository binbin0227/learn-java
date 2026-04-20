import java.util.Random;

public class d05b_06 {
    public static void main(String[] args) {
        int[] arr = new int[10];
        Random r = new Random();
        for (int i = 0; i < arr.length; i++) {
            arr[i] = r.nextInt(100) + 1;
        }
        int sum = 0;
        int i = 0;
        while (i < arr.length) {
            sum = sum + arr[i];
            i++;
        }
        System.out.println("平均数：" + (sum / arr.length));
        int result = 0;
        for (int j = 0; j < arr.length; j++) {
            if (arr[j] < sum / arr.length){
                result = result + 1;
            }
        }
        System.out.println("有" + result + "个数比" + (sum / arr.length) + "小");
    }
}

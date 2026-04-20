import java.util.Random;

public class d05b_08 {
    public static void main(String[] args) {
        int[] arr = new int[]{1,2,3,4,5};
        Random r = new Random();
        for (int i = 0; i < arr.length; i++) {
            int ram = r.nextInt(arr.length);
            int temp = arr[i];
            arr[i] = arr[ram];
            arr[ram] = temp;
        }
        for (int j = 0; j < arr.length; j++) {
            System.out.println(arr[j]);
        }
    }
}

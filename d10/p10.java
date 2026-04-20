import java.util.Scanner;

public class p10 {
    public static void main(String[] args) {
        int[] arr = {1, 2, 3};
        System.out.println(ToString(arr));
    }

    public static String ToString(int[] arr) {
        StringBuilder sb = new StringBuilder().append("[");
        for (int i = 0; i < arr.length; i++) {
            sb.append(arr[i]);
            if (i != arr.length - 1) {
                sb.append(", ");
            } else {
                sb.append("]");
            }
        }
        return sb.toString();
    }
}

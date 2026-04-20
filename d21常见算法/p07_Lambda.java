import java.util.Arrays;
import java.util.Comparator;

public class p07_Lambda {
    public static void main(String[] args) {
        String[] arr = new String[]{"哈基萍", "是", "一只", "纯种凑企鹅"};
        Arrays.sort(arr, (o1, o2) -> o1.length() - o2.length());
        System.out.println(Arrays.toString(arr));
    }
}

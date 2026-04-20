import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;

public class d26p06 {
    /*定义一个集合，并添加一些整数1，2,3,4，5,6,7,8,9,10过滤奇数，只留下偶数。
    并将结果保存起来*/
    public static void main(String[] args) {
        ArrayList<Integer> arr = new ArrayList<>();
        Collections.addAll(arr,1,2,3,4,5,6,7,8,9,10);
        List<Integer> result = arr.stream().filter(num -> num % 2 == 0).collect(Collectors.toList());
        System.out.println(result);
    }
}

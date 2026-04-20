import java.util.ArrayList;
import java.util.Collections;
import java.util.Random;
import java.util.Scanner;

public class d25p23 {
/*    班级里有N个学生
    要求:
    被点到的学生不会再被点到。
    但是如果班级中所有的学生都点完了，需要重新开启第二轮点名。*/
    public static void main(String[] args) {
        Random r = new Random();
        ArrayList<String> stuArr = new ArrayList<>();
        Collections.addAll(stuArr, "张三", "李四", "王五", "赵六","小红", "小丽", "小美", "小兰");
        ArrayList<String> temp = new ArrayList<>(stuArr.size());
        Scanner sc = new Scanner(System.in);
        while (true) {
            System.out.println("新一轮开始了");
            temp.addAll(stuArr);
            while (!temp.isEmpty()){
                sc.nextLine();
                int index = r.nextInt(temp.size());
                System.out.println(temp.remove(index));
            }
        }
    }
}

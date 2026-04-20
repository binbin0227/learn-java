import java.util.ArrayList;
import java.util.Collections;
import java.util.Random;

public class d25p22 {
    public static final Random r = new Random();
    public static void main(String[] args) {
        /*班级里有N个学生
        要求:
        70%的概率随机到男生
        30%的概率随机到女生*/
        ArrayList<String> boyList = new ArrayList<>();
        Collections.addAll(boyList, "张三", "李四", "王五", "赵六", "陈七");
        ArrayList<String> girlList = new ArrayList<>();
        Collections.addAll(girlList, "小红", "小美", "小丽", "小花", "小兰");
        double seed = r.nextDouble();
        if(seed<=0.7){
            System.out.println(getName(boyList));
        }else {
            System.out.println(getName(girlList));
        }
    }
    public static <T> T getName(ArrayList<T>arr){
        int index = r.nextInt(arr.size());
        return arr.get(index);
    }
}

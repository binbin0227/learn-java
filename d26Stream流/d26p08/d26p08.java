package d26p08;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.function.Function;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class d26p08 {
    /*    现在有两个ArrayList集合，
        第一个集合中:存储6名男演员的名字和年龄。第二个集合中:存储6名女演员的名字和年龄。姓名和年龄中间用逗号隔开。比如:张三,23要求完成如下的操作:
                1，男演员只要名字为3个字的前两人
    2，女演员只要姓杨的，并且不要第一个
                A
    3，把过滤后的男演员姓名和女演员姓名合并到一起
    4，将上一步的演员信息封装成Actor对象。
                5，将所有的演员对象都保存到List集合中。
        备注:演员类Actor，属性有:name，age*/
    public static void main(String[] args) {
        ArrayList<String> manList = new ArrayList<>();
        Collections.addAll(manList, "蔡徐坤,25", "李易峰,35", "刘德华,61", "吴京,49", "周杰伦,44", "沈腾,43");
        ArrayList<String> womanList = new ArrayList<>();
        Collections.addAll(womanList, "杨幂,37", "杨颖,34", "林志玲,48", "杨紫,31", "迪丽热巴,31", "杨超越,25");
        Stream<String> stream1 = manList.stream()
                .filter(name -> name.length() == 3)
                .limit(2);
        Stream<String> stream2 = womanList.stream()
                .filter(name -> name.startsWith("杨"))
                .skip(1);
        Stream<String> stream3 = Stream.concat(stream1, stream2);
        List<Actor> result = stream3
                .map(s -> {
                    String name = s.split(",")[0];
                    int age = Integer.parseInt(s.split(",")[1]);
                    return new Actor(name, age);
                })
                .collect(Collectors.toList());
        System.out.println(result);
    }
}

import java.util.Arrays;
import java.util.Comparator;

public class d21_test1 {
    /*    定义数组并存储一些女朋友对象，利用Arrays中的sort方法进行排序
    要求1:属性有姓名、年龄、身高。
    要求2:按照年龄的大小进行排序，年龄一样，按照身高排序，身高一样按照姓名的字母进行排序。
    (姓名中不要有中文或特殊字符，会涉及到后面的知识)*/
    public static void main(String[] args) {
        GirlFriend gf1 = new GirlFriend("zyp", 20, 153);
        GirlFriend gf2 = new GirlFriend("couqiee", 20, 100);
        GirlFriend gf3 = new GirlFriend("hjp", 20, 100);
        GirlFriend[] arr = new GirlFriend[]{gf1, gf2, gf3};
        Arrays.sort(arr, (o1, o2) -> {
            if (o1.getAge() != o2.getAge()) return o1.getAge() - o2.getAge();
            if (o1.getHeight() != o2.getHeight()) return o1.getHeight() - o2.getHeight();
            return o1.getName().charAt(0) - o2.getName().charAt(0);
        });
        System.out.println(Arrays.toString(arr));
    }
}

class GirlFriend {
    private String name;
    private int age;
    private int height;

    public GirlFriend() {
    }

    public GirlFriend(String name, int age, int height) {
        this.name = name;
        this.age = age;
        this.height = height;
    }

    /**
     * 获取
     *
     * @return name
     */
    public String getName() {
        return name;
    }

    /**
     * 设置
     *
     * @param name
     */
    public void setName(String name) {
        this.name = name;
    }

    /**
     * 获取
     *
     * @return age
     */
    public int getAge() {
        return age;
    }

    /**
     * 设置
     *
     * @param age
     */
    public void setAge(int age) {
        this.age = age;
    }

    /**
     * 获取
     *
     * @return height
     */
    public int getHeight() {
        return height;
    }

    /**
     * 设置
     *
     * @param height
     */
    public void setHeight(int height) {
        this.height = height;
    }

    public String toString() {
        return "GirlFriend{name = " + name + ", age = " + age + ", height = " + height + "}";
    }
}
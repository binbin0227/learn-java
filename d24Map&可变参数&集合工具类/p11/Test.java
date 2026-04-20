package p11;

import java.util.Comparator;
import java.util.TreeMap;

public class Test {
    public static void main(String[] args) {
        Student s1 = new Student("zhangsan", 10);
        Student s2 = new Student("zhangsan", 9);
        Student s3 = new Student("lisi", 15);
        Student s4 = new Student("zhangsan", 10);
        TreeMap<Student, String> tm = new TreeMap<>((Student o1, Student o2) ->
                o1.getAge() == o2.getAge() ? o1.getName().compareTo(o2.getName()) : o1.getAge() - o2.getAge());
        tm.put(s1,"gd");
        tm.put(s2,"gd");
        tm.put(s3,"fz");
        tm.put(s4,"gd");
        System.out.println(tm);

    }
}

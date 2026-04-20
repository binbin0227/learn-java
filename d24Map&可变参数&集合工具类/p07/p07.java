package p07;
import java.util.HashMap;
import java.util.Objects;

class p07 {
    public static void main(String[] args) {
        Student s1 = new Student("张三", 20);
        Student s2 = new Student("李四", 22);
        Student s3 = new Student("张三", 20);
        HashMap<Student, String> hm = new HashMap<>();
        hm.put(s1, "汉");
        hm.put(s2, "回");
        hm.put(s3, "汉");
        hm.forEach((Student student, String s) -> System.out.println(student.getName() + "：" + s));
    }
}

class Student {
    private String name;
    private int age;

    public Student() {
    }

    public Student(String name, int age) {
        this.name = name;
        this.age = age;
    }

    @Override
    public boolean equals(Object o) {
        if (o == null || getClass() != o.getClass()) return false;
        Student student = (Student) o;
        return age == student.age && Objects.equals(name, student.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, age);
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }
}

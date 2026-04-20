package p15_2;

import java.util.Comparator;

public class Student implements Comparable<Student> {
    private String name;
    private int age;
    private int chi;
    private int math;
    private int eng;

    public Student() {
    }

    public Student(String name, int age, int chi, int math, int eng) {
        this.name = name;
        this.age = age;
        this.chi = chi;
        this.math = math;
        this.eng = eng;
    }

    @Override
    public int compareTo(Student o) {
        int sum1 = this.getChi() + this.getMath() + this.getEng();
        int sum2 = o.getChi() + o.getMath() + o.getEng();
        int i = sum1 - sum2;
        i = i == 0 ? this.getChi() - o.getChi() : i;
        i = i == 0 ? this.getMath() - o.getMath() : i;
        i = i == 0 ? this.getEng() - o.getEng() : i;
        i = i == 0 ? this.getAge() - o.getAge() : i;
        i = i == 0 ? this.compareTo(o) : i;
        return i;
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
     * @return chi
     */
    public int getChi() {
        return chi;
    }

    /**
     * 设置
     *
     * @param chi
     */
    public void setChi(int chi) {
        this.chi = chi;
    }

    /**
     * 获取
     *
     * @return math
     */
    public int getMath() {
        return math;
    }

    /**
     * 设置
     *
     * @param math
     */
    public void setMath(int math) {
        this.math = math;
    }

    /**
     * 获取
     *
     * @return eng
     */
    public int getEng() {
        return eng;
    }

    /**
     * 设置
     *
     * @param eng
     */
    public void setEng(int eng) {
        this.eng = eng;
    }

    public String toString() {
        return "Student{name = " + name + ", age = " + age + ", chi = " + chi + ", math = " + math + ", eng = " + eng + "}";
    }
}
package p4;

import java.util.Scanner;

public class Test {
    public static void main(String[] args) {
        Student[] arr = new Student[3];
        Student s1 = new Student(001, "Tom", 11);
        Student s2 = new Student(002, "Jack", 12);
        Student s3 = new Student(003, "哈基萍", 1000000);
        arr[0] = s1;
        arr[1] = s2;
        arr[2] = s3;
        //1
        Student[] newArr = new Student[4];
        newArr[0] = arr[0];
        newArr[1] = arr[1];
        newArr[2] = arr[2];
        Scanner sc = new Scanner(System.in);
        Student add = new Student();
        boolean flag = false;
        while (!flag) {
            int newId = sc.nextInt();
            for (int i = 0; i < arr.length; i++) {
                if (newId == arr[i].getId()) {
                    flag = true;
                    break;
                }
            }
            if (flag == true) {
                System.out.println("学号已存在，重新输入：");
                continue;
            }
            String newName = sc.next();
            int newAge = sc.nextInt();
            Student s4 = new Student(newId,newName,newAge);
            newArr[3] = s4;
        }
        //2
        for (int i = 0; i < newArr.length; i++) {
            newArr[i].getId();
            newArr[i].getName();
            newArr[i].getAge();
        }
        //3
        int delId = sc.nextInt();
        for (int i = 0; i < newArr.length; i++) {
            if (delId == newArr[i].getId()) {
                newArr[i] = null;
                break;
            }
            if (i == newArr.length - 1) {
                System.out.println("删除失败");
            }
        }
        //4
        for (int i = 0; i < arr.length; i++) {
            if (newArr[i].getId() == 002) {
                newArr[i].setId(newArr[i].getId() + 1);
            }
        }
    }
}

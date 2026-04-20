package StudentSystem;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class StudentSystem {
    public static void main(String[] args) {
        //初始化
        ArrayList<Student> list = new ArrayList<>();
        Scanner sc = new Scanner(System.in);
        //运行
        while (true) {
            System.out.println("欢迎来到学生管理系统");
            System.out.println("请选择操作：1登录 2注册 3忘记密码");
            String choose = sc.next();
            switch (choose) {
                case ("1") -> Login(list);
                case ("2") -> Register(list);
                case ("3") -> Forget(list);
            }
        }
    }

    public static void Login(ArrayList<Student> list) {
        Scanner sc = new Scanner(System.in);
        //用户名
        System.out.println("输入用户名：");
        String inputUsername = sc.next();
        int userIndex = -1;
        for (int i = 0; i < list.size(); i++) {
            if (inputUsername.equals(list.get(i).getUsername())) {
                userIndex = i;
            }
        }
        if (userIndex == -1) {
            System.out.println("未注册");
            return;
        }
        //密码
        for (int i = 0; i < 3; i++) {
            System.out.println("输入密码：");
            String inputPassword = sc.next();
            if (inputPassword.equals(list.get(userIndex).getPassword())) {
                System.out.println("登录成功");
                break;
            } else {
                System.out.println("密码错误，重新输入：");
            }
        }
    }

    public static void Register(ArrayList<Student> list) {
        System.out.println("开始注册");
        Scanner sc = new Scanner(System.in);
        //用户名
        String regUsername;
        while (true) {
            System.out.println("输入用户名：");
            regUsername = sc.next();
            boolean regUsernameFlag = true;
            for (int i = 0; i < list.size(); i++) {
                if (regUsername.equals(list.get(i).getUsername())) {
                    regUsernameFlag = false;
                    break;
                }
            }
            if (regUsername.length() > 15 || regUsername.length() < 3) {
                regUsernameFlag = false;
            }
            int count = 0;
            for (int i = 0; i < regUsername.length(); i++) {
                if (regUsername.charAt(i) >= 48 && regUsername.charAt(i) <= 57) {
                    continue;
                } else if ((regUsername.charAt(i) >= 65 & regUsername.charAt(i) <= 90) || (regUsername.charAt(i) >= 97 & regUsername.charAt(i) <= 122)) {
                    count++;
                } else {
                    regUsernameFlag = false;
                }
            }
            if (regUsernameFlag) {
                break;
            } else {
                System.out.println("用户名不合法，重新输入。");
            }
        }
        //密码
        String regPassword;
        while (true) {
            System.out.println("输入密码：");
            regPassword = sc.next();
            System.out.println("再次输入密码：");
            String regPassword2 = sc.next();
            if (regPassword.equals(regPassword2)) {
                break;
            } else {
                System.out.println("两次输入的密码不一致，重新输入。");
            }
        }
        //身份证
        String regId;
        while (true) {
            System.out.println("输入身份证：");
            regId = sc.next();
            boolean regIdFlag = true;
            if (regId.length() != 18) {
                regIdFlag = false;
            } else if (!(regId.charAt(17) >= '0' && regId.charAt(17) <= '9' || regId.charAt(17) == 'X' || regId.charAt(17) == 'x')) {
                regIdFlag = false;
            }
            if (regIdFlag) {
                break;
            } else {
                System.out.println("身份证不合法，重新输入。");
            }
        }
        //手机号
        String regTel;
        while (true) {
            System.out.println("输入手机号：");
            regTel = sc.next();
            boolean regTelFlag = true;
            if (regTel.length() != 11 || regTel.charAt(0) == '0') {
                regTelFlag = false;
            }
            for (int i = 0; i < regTel.length(); i++) {
                if (regTel.charAt(i) < 48 || regTel.charAt(i) > 57) {
                    regTelFlag = false;
                    break;
                }
            }
            if (regTelFlag) {
                Student newStudent = new Student(regUsername, regPassword, regId, regTel);
                list.add(newStudent);
                break;
            } else {
                System.out.println("手机号不合法，重新输入。");
            }
        }
    }

    public static void Forget(ArrayList<Student> list) {
        int userIndex = -1;
        Scanner sc = new Scanner(System.in);
        System.out.println("输入身份证：");
        String findId = sc.next();
        for (int i = 0; i < list.size(); i++) {
            if(findId.equals(list.get(i).getId())){
                userIndex = i;
            }
        }
        if (userIndex == -1){
            System.out.println("未注册");
            return;
        }
        System.out.println("输入手机号：");
        String findTel = sc.next();
        if(!findTel.equals(list.get(userIndex).getPhone())){
            System.out.println("账号信息不匹配");
            return;
        }
        System.out.println("输入新密码：");
        list.get(userIndex).setPassword(sc.next());
    }
}

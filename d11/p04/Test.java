package p04;

import java.util.ArrayList;

public class Test {
    public static void main(String[] args) {
        ArrayList<User> list = new ArrayList<>();
        list.add(new User(001, "Tom", "qwert"));
        list.add(new User(002, "Amy", "asdfg"));
        list.add(new User(003, "Jack", "zxcvb"));
        System.out.println(Find(004,list));
    }
    public static String Find(int id,ArrayList<User> list){
        for (int i = 0; i < list.size(); i++) {
            if (id == list.get(i).getId()){
                return list.get(i).getUsername()+" "+list.get(i).getPassword();
            }
        }
        return "未找到";
    }
}

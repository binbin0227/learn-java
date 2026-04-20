package p08;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Random;
import java.util.Set;

public class p08 {
    public static void main(String[] args) {
        String[] arr = {"A", "B", "C", "D"};
        Random r = new Random();
        ArrayList<String>list=new ArrayList<>();
        for (int i = 0; i < 80; i++) {
            list.add(arr[r.nextInt(arr.length)]);
        }
        System.out.println(list);
        HashMap<String, Integer> hm = new HashMap<>();
        for (String name :list) {
            if(hm.containsKey(name)){
                Integer count = hm.get(name);
                count++;
                hm.put(name,count);
            } else {
                hm.put(name,1);
            }
        }
        System.out.println(hm);
    }
}

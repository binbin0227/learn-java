package p12;

import java.util.TreeMap;
import java.util.function.BiConsumer;

public class p12 {
    public static void main(String[] args) {
        String str = "aababcabcdabcde";
        TreeMap<Character, Integer> tm = new TreeMap<>();
        for (int i = 0; i < str.length(); i++) {
            char j = str.charAt(i);
            if (tm.containsKey(j)) {
                Integer count = tm.get(j);
                count++;
                tm.put(j, count);
            } else {
                tm.put(j, 1);
            }
        }
        tm.forEach((Character character, Integer integer) -> {
            System.out.print(character + " (" + integer + ") ");
        });
    }
}

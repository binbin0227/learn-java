package p03;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;
import java.util.function.Consumer;

public class p03 {
    public static void main(String[] args) {
        Map<String, Integer> m = new HashMap<>();
        m.put("Java", 1995);
        m.put("Python", 1991);
        m.put("Go", 2009);
        m.put("Rust", 2010);
        Set<String> keys = m.keySet();

        //增强for
        for (String key : keys) {
            System.out.println(key+":"+m.get(key));
        }
        System.out.println("___________________________");
        //迭代器
        Iterator<String> it = keys.iterator();
        while (it.hasNext()){
            String key = it.next();
            System.out.println(key+":"+m.get(key));
        }
        System.out.println("___________________________");
        //lambda
        keys.forEach(new Consumer<String>() {
            @Override
            public void accept(String key) {
                System.out.println(key+":"+m.get(key));
            }
        });
    }
}

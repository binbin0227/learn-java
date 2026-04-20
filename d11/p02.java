import java.util.ArrayList;

public class p02 {
    public static void main(String[] args) {
        ArrayList<String> list = new ArrayList<>();
        list.add("qwe");
        list.add("asd");
        list.add("zxc");
        for (int i = 0; i < list.size(); i++) {
            System.out.println(list.get(i));
        }
    }
}

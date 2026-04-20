public class d04_09 {
    public static void main(String[] args) {
        double i = 0.1;
        double high = 8844430.0;
        int result = 0;
        while (i < high) {
            result = result + 1;
            i = i * 2;
        }
        System.out.println(result);
    }
}

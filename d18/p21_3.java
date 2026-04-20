public class p21_3 {
    public static void main(String[] args) {
        System.out.println(toBinaryString(121));
    }
    public static String toBinaryString(int num) {
        if (num==0) return "0";
        StringBuilder temp = new StringBuilder();
        while (num!=0) {
            temp.append(num % 2);
            num /= 2;
        }
        return temp.reverse().toString();
    }
}

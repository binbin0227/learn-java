public class p14 {
    public static void main(String[] args) {
        String A = "abcde";
        String B = "cdeab";
        boolean flag = false;
        for (int i = 0; i < A.length() - 1; i++) {
            A = Move(A);
            if (A.equals(B)) {
                flag = true;
                break;
            }
        }
        System.out.println(flag);
    }

    public static String Move(String str) {
        StringBuilder sb = new StringBuilder(str.substring(1)).append(str.charAt(0));
        return sb.toString();
    }
}

public class d07_06 {
    public static void main(String[] args) {
        lock(1,2,3,4);
    }

    public static void lock(int a, int b, int c, int d) {
        int[] raw = new int[]{a, b, c, d};
        for (int i = 0; i < raw.length; i++) {
            raw[i] = (raw[i] + 5) % 10;
        }
        for (int i = 0; i < raw.length / 2; i++) {
            int temp = raw[i];
            raw[i] = raw[raw.length - i -1];
            raw[raw.length - i -1] = temp;
        }
        for (int i = 0; i < raw.length; i++) {
            System.out.print(raw[i]);
        }
        System.out.println();
        return;
    }
}

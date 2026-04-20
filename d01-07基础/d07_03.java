import java.util.Random;

public class d07_03 {
    public static void main(String[] args) {
        char[] chs = new char[52];
        Random r = new Random();
        for (int i = 0; i < chs.length; i++) {
            if (i<= 25){
                chs[i] = (char)(97 + i);
            } else{
                chs[i] = (char)(65 + i - 26);
            }
        }
        for (int i = 1; i <= 4; i++){
            int sj = r.nextInt(52);
            System.out.print(chs[sj]);
        }
        int num = r.nextInt(10);
        System.out.println(num);
    }
}

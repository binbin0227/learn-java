import java.util.Random;

public class d07_07 {
    public static void main(String[] args) {
        int[] arr = new int[]{2,4,6,8,10};
        int[] newArr = new int[arr.length];
        //开始抽奖
        Random r = new Random();
        for (int i = 0; i < arr.length;){
            int sjIndex = r.nextInt(5);
            if (!contains(arr[sjIndex], newArr)){
                newArr[i] = arr[sjIndex];
                i++;
            }
        }
        //展示结果
        for (int i = 0; i < newArr.length; i++) {
            System.out.println("抽出" + newArr[i]);
        }
    }
    public static boolean contains(int i,int[] newArr){
        for (int j = 0; j < newArr.length; j++) {
            if (i == newArr[j]){
                return true;
            }
        }
        return false;
    }
}

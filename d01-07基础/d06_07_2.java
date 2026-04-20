public class d06_07_2 {
    public static void main(String[] args) {
        int[] arr = new int[]{1,2,3,4,5};
        System.out.println(max(arr));
    }
    public static int max(int[] arr) {
        int result = arr[0];
        for (int i = 1; i < arr.length; i++) {
            if (result < arr[i]){
                result = arr[i];
            }
        }
        return result;
    }
}

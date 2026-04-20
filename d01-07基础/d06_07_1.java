public class d06_07_1 {
    public static void main(String[] args) {
        int[] arr = new int[]{1,2,3,4,5};
        bl(arr);
    }
    public static void bl(int[] arr) {
        System.out.print("[");
        for (int i = 0; i < arr.length; i++) {
            if (i != arr.length - 1){
                System.out.print(arr[i] + ",");
            } else{
                System.out.print(arr[i]);
            }
        }
        System.out.println("]");
    }
}

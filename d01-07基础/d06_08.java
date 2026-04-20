public class d06_08 {
    public static void main(String[] args) {
        int[] arr = new int[]{1,2,3,4,5,6,7,8,9};
        bl(copyOfRange(arr, 3, 7));
    }
    public static int[] copyOfRange(int[] arr, int from, int to){
        int[] newArr = new int[to - from];
        for (int i = from; i < to; i++) {
            newArr[i - from] = arr[i];
        }
        return newArr;
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

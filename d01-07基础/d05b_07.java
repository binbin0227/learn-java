public class d05b_07 {
    public static void main(String[] args) {
        int[] arr = new int[]{1,2,3,4,5};
        int[] arr2 = new int[arr.length];
      for (int k = 0; k < arr2.length; k++) {
        arr2[k] = arr[k];
      }
        for (int i = 0; i < arr.length; i++) {
            arr[i] = arr2[arr.length - 1 - i];
        }
        for (int j = 0; j < arr.length; j++) {
            System.out.println(arr[j]);
        }
    }
}

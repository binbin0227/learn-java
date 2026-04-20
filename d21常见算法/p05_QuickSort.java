public class p05_QuickSort {
    public static void main(String[] args) {
        int[] arr = new int[]{6, 3, 1, 2, 5, 4, 9, 7, 10, 8};
        quickSort(arr, 0, arr.length - 1);
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
    }

    public static void quickSort(int[] arr, int i, int j) {
        if(i>j){
            return;
        }
        int base = arr[i];
        int startIndex = i;
        int endIndex = j;
        while (startIndex != endIndex) {
            while (endIndex > startIndex && arr[endIndex] >= base) endIndex--;
            while (endIndex > startIndex && arr[startIndex] <= base) startIndex++;
            if (endIndex > startIndex) {
                int temp = arr[startIndex];
                arr[startIndex] = arr[endIndex];
                arr[endIndex] = temp;
            }
        }
        int temp = arr[startIndex];
        arr[startIndex] = arr[i];
        arr[i] = temp;
        quickSort(arr, i, startIndex-1);
        quickSort(arr, startIndex+1, j);
    }
}

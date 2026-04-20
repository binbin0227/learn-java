public class p07 {
    public static void main(String[] args) {
        int[] arr = new int[]{1,2,3};
        System.out.println(ToString(arr));
    }

    public static String ToString(int[] arr) {
        if (arr == null) {
            return "";
        }
        if (arr.length == 0) {
            return "[]";
        }
        String result = "[";
        for (int i = 0; i < arr.length; i++) {
            if (i!=arr.length-1){
                result += arr[i]+",";
            }else {
                result += arr[i];
            }

        }
        result += "]";
        return result;
    }
}

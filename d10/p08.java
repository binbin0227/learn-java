public class p08 {
    public static void main(String[] args) {
        System.out.println(toCn(132));
    }

    public static String toCn(int num) {
        if (num > 9999999 || num < 0) {
            return "数字不合法";
        }
        int[] arr = new int[7];
        for (int i = arr.length - 1; i > 0; i--) {
            arr[i] = num % 10;
            num /= 10;
        }
        char[] newArr = new char[7];
        for (int i = 0; i < newArr.length; i++) {
            switch (arr[i]) {
                case 1 -> newArr[i] = '一';
                case 2 -> newArr[i] = '二';
                case 3 -> newArr[i] = '三';
                case 4 -> newArr[i] = '四';
                case 5 -> newArr[i] = '五';
                case 6 -> newArr[i] = '六';
                case 7 -> newArr[i] = '七';
                case 8 -> newArr[i] = '八';
                case 9 -> newArr[i] = '九';
                case 0 -> newArr[i] = '零';
            }
        }
        String result = "" + newArr[0] + "百" + newArr[1] + "十" + newArr[2] + "万" + newArr[3] + "千" + newArr[4] + "百" + newArr[5] + "十" + newArr[6] + "元";
        return result;
    }
}

import java.util.ArrayList;

public class p01_BasicSearchIndex {
    //需求:定义一个方法利用基本查找，查询某个元素在数组中的索引
    //要求:需要考虑数组中元素有重复的可能性
    public static void main(String[] args) {
        int[] arr=new int[]{1,2,1};
        System.out.println(basicSearchIndex(arr,1));
    }
    public static ArrayList<Integer> basicSearchIndex(int[] arr,int num){
        ArrayList<Integer> result =new ArrayList<>();
        for (int i = 0; i < arr.length; i++) {
            if (num==arr[i]){
                result.add(i);
            }
        }
        return result;
    }
}

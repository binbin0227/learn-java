public class p04_Factorial {
    public static void main(String[] args) {
        System.out.println(getFactorial(10));
    }
    public static int getFactorial(int num){
        if(num==1)return 1;
        else return num*getFactorial(num-1);
    }
}

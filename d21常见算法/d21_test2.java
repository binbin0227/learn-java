public class d21_test2 {
    /*有一个很有名的数学逻辑题叫做不死神兔问题，有一对兔子，从出生后第三个月起每个月都生
    一对兔子，小兔子长到第三个月后每个月又生一对兔子，假如兔子都不死，问第十二个月的兔子对数为多少?*/
    public static void main(String[] args) {
        System.out.println(totalNumber(1,12));
    }
    public static int totalNumber(int num, int month){
        if(month==1||month==2)return num;
        return totalNumber(num,month-1)+totalNumber(num,month-2);
    }
}

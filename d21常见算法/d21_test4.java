public class d21_test4 {
    public static void main(String[] args) {
        /*可爱的小明特别喜欢爬楼梯，他有的时候一次爬一个台阶，有的时候一次爬两个台阶。
        如果这个楼梯有20个台阶，小明一共有多少种爬法呢?*/
        System.out.println(steps(20));
    }

    public static int steps(int stair) {
        if (stair == 1) return 1;
        if (stair == 2) return 2;
        return steps(stair - 1) + steps(stair - 2);
    }
}

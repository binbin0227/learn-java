package d31_p26;

public class Test {
    public static void main(String[] args) {
        Box b1 = new Box();
        Box b2 = new Box();
        Thread t1 = new Thread(b1);
        Thread t2 = new Thread(b2);
        t1.setName("抽奖箱1");
        t2.setName("抽奖箱2");
        t1.start();
        t2.start();
    }
}

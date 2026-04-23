package d31_p24_2;

import java.util.Random;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

public class User extends Thread {
    private final String username;
    public static double restMoney = 100.0;
    public static int chance = 3;
    static Lock l = new ReentrantLock();
    Random r = new Random();

    public User(String username) {
        this.username = username;
    }

    @Override
    public void run() {
        l.lock();
        double redPocket;
        try {
            if (chance > 1) {
                redPocket = r.nextDouble() * restMoney;
                restMoney -= redPocket;
                chance--;
                System.out.println(username + "抢到了" + redPocket);
            } else if (chance == 1) {
                redPocket = restMoney;
                chance = 0;
                System.out.println(username + "抢到了" + redPocket);
            } else {
                System.out.println(username + "没抢到");
            }
        } finally {
            l.unlock();
        }

    }
}

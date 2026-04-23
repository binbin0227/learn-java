package d31_p25;

import java.util.ArrayList;
import java.util.Collections;
import java.util.concurrent.ThreadLocalRandom;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

public class Box implements Runnable {
    public static ArrayList<Integer> pool = new ArrayList<>();
    static {
        Collections.addAll(pool,10, 5, 20, 50, 100, 200, 500, 800, 2, 80, 300, 700);
    }
    static Lock l = new ReentrantLock();


    @Override
    public void run() {
        while (true) {
            l.lock();
            try {
                if(!pool.isEmpty()){
                    int index = ThreadLocalRandom.current().nextInt(pool.size());
                    int prize = pool.remove(index);
                    System.out.println(Thread.currentThread().getName()+"抽到了"+prize);
                }else {
                    break;
                }
            } finally {
                l.unlock();
            }
        }
    }
}

package d31_p24_1;


import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

public class TicketWindow extends Thread {
    public static int ticket = 1000;
    static Lock lock = new ReentrantLock();

    @Override
    public void run() {
        while (true) {
            lock.lock();
            try {
                if (ticket == 0) {
                    break;
                } else {
                    ticket--;
                    System.out.println(Thread.currentThread().getName() + "：出票成功，余量：" + ticket);
                }
            } finally {
                lock.unlock();
            }
        }
    }
}

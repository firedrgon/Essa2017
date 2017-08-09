package c020;

import java.util.concurrent.TimeUnit;

/**
 * Created by Yuanping on 2017/7/26.
 */
public class ReentrankLock1 {
    synchronized void m1() {
        for (int i = 0; i < 10; i++) {
            try {
                TimeUnit.SECONDS.sleep(1);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            System.out.println(i);
        }
    }

    synchronized void m2() {
        System.out.println("m2.......");
    }

    public static void main(String[] args) {
        ReentrankLock1 lock1 = new ReentrankLock1();
        new Thread(()->lock1.m1()).start();

        try {
            TimeUnit.SECONDS.sleep(1);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        new Thread(lock1::m2).start();
    }
}

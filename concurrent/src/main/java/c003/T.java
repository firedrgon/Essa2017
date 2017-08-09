package c003;

/**
 * Created by Yuanping on 2017/7/15.
 */
public class T {
    private int count = 10;

    public void m2() {
        synchronized (this) {
            count --;
            System.out.println(Thread.currentThread().getName() + "count:" + count);
        }
    }

    public synchronized void m() {
        count --;
        System.out.println(Thread.currentThread().getName() + "count:" + count);
    }
}

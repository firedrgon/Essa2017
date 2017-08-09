package c002;

/**
 * Created by Yuanping on 2017/7/15.
 */
public class T {
    private int count = 10;

    public void m() {
        synchronized (this) {
            count --;
            System.out.println(Thread.currentThread().getName() + "count:" + count);
        }
    }
}

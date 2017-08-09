package c004;

/**
 * Created by Yuanping on 2017/7/15.
 */
public class T {
    private static int count = 10;

    public synchronized static void m() { //这里等同于synchronized(yxxy.c_004.T.class)
        count --;
        System.out.println(Thread.currentThread().getName() + "count:" + count);
    }

    public static void m2() {
        synchronized (T.class) {
            count--;
            System.out.println(Thread.currentThread().getName() + "count:" + count);
        }
    }
}

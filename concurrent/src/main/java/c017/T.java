package c017;

import java.util.concurrent.TimeUnit;

/**
 * 锁定某对象o，如果o的属性发生改变，不影响锁的使用
 * 但是如果o变成另外一个对象，则锁定的对象发生改变
 * 应该避免将锁定对象的引用变成另外的对象
 * Created by Yuanping on 2017/7/16.
 */
public class T {
    Object o = new Object();

    public void m() {
        synchronized (o) {
            while (true) {
                try {
                    TimeUnit.SECONDS.sleep(1);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
                System.out.println(Thread.currentThread().getName());
            }
        }
    }

    public static void main(String[] args) {
        T t = new T();
        //启动第一个线程
        new Thread(t::m,"t1").start();

        try {
            TimeUnit.SECONDS.sleep(1);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        //启动第二个线程
        Thread thread = new Thread(t::m,"t2");
        //锁对象发生改变，所以t2线程得以执行，如果注释掉这句话，线程2将永远得不到执行的机会
        t.o = new Object();
        thread.start();
    }
}


















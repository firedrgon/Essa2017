package c013;

import java.util.ArrayList;
import java.util.List;

/**
 * synchronized可以保证可见性和原子性，volatile只能保证可见性
 * Created by Yuanping on 2017/7/16.
 */
public class T {
    private volatile int count = 0;

    /*synchronized*/ void m() {
        for (int i = 0; i < 1000; i++) count++;
    }

    public static void main(String[] args) {
        T t = new T();
        List<Thread> threads = new ArrayList<>();
        for (int i = 0; i < 10; i++) {
            threads.add(new Thread(t::m));
        }

        threads.forEach(o ->{
            o.start();;
        });

        threads.forEach((o) -> {
            try {
                o.join();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        });
        System.out.println(t.count);
    }
}

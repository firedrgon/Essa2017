package BasicProgram;

import org.apache.commons.collections.map.HashedMap;

import java.util.Collections;
import java.util.Map;
import java.util.Queue;
import java.util.concurrent.*;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.locks.Condition;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

/**
 * Created by Yuanping on 2017/9/2.
 */
public class AtoIntegerTest {
    public static void main(String[] args) {
        AtomicInteger ai = new AtomicInteger();
        ai.set(33);
        System.out.println(ai.get());
        System.out.println(ai.getAndDecrement());
        System.out.println(ai.get());

        Lock lock = new ReentrantLock();
        Condition condition = lock.newCondition();

        Map<Object, Object> objectObjectMap = Collections.synchronizedMap(new HashedMap());

        Queue<String> queues = new ConcurrentLinkedQueue<>();
        Queue<String> queues2 = new ConcurrentLinkedDeque<>();

        BlockingQueue<String> blockingQueue = new LinkedBlockingDeque<>();
        BlockingQueue<String> blockingQueue2 = new LinkedBlockingQueue<>();
        new ConcurrentSkipListMap<>();
        new CopyOnWriteArrayList<>();
        TransferQueue<Object> objects = new LinkedTransferQueue<>();
        new SynchronousQueue<>();

    }
}

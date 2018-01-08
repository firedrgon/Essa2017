package c026;

import java.util.concurrent.*;

/**
 * Created by Yuanping on 2017/9/3.
 */
public class ExecutorsTest {
    public static void main(String[] args) {
        ExecutorService service = Executors.newFixedThreadPool(5);

        service.execute(()->{
            System.out.println("hello world");
        });

        try {
            TimeUnit.SECONDS.sleep(5);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        service.shutdown();
        System.out.println(service.isShutdown());

        ExecutorsTest.futureTast1();

        Executors.newCachedThreadPool();
        Executors.newSingleThreadExecutor();
        Executors.newScheduledThreadPool(5);
    }

    private static void futureTast1() {
        FutureTask ft = new FutureTask(()->{
            System.out.println("future task");
            return "future task";
        });

        new Thread(ft).start();
        try {
            System.out.println(ft.get());
        } catch (InterruptedException e) {
            e.printStackTrace();
        } catch (ExecutionException e) {
            e.printStackTrace();
        }
    }
}

class CallableTest implements Callable {

    @Override
    public Object call() throws Exception {
        return null;
    }
}

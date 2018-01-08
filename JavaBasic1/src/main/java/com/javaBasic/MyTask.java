package com.javaBasic;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.*;

/**
 * Created by Yuanping on 2018/1/5.
 */
public class MyTask implements Callable<Integer> {
    private int upperBounds;

    public MyTask(int upperBounds) {
        this.upperBounds = upperBounds;
    }

    @Override
    public Integer call() throws Exception {
        int sum = 0;
        for(int i = 1; i <= upperBounds; i++) {
            sum += i;
        }
        return sum;
    }
}
class CallableTest{

    public static void main(String[] args) throws ExecutionException, InterruptedException {
        List<Future<Integer>> list = new ArrayList<>();
        ExecutorService executorService = Executors.newFixedThreadPool(10);
        for (int i = 0; i < 10; i++) {
            list.add(executorService.submit(new MyTask((int) (Math.random() * 100))));
        }

        int sum = 0;
        for (Future<Integer> future : list) {
            sum += future.get();
        }
        System.out.println(sum);
    }
}





















package c008;

import java.math.BigDecimal;
import java.util.concurrent.TimeUnit;

/**
 * Created by Yuanping on 2017/7/15.
 */
public class Account {
    String name;
    BigDecimal balance;

    public synchronized void set(String name, BigDecimal balance) {
        this.name = name;
        this.balance = balance;
    }

    public BigDecimal get() {
        return this.balance;
    }

    public static void main(String[] args) {
        Account account = new Account();
        new Thread(()->account.set("zhangsan",new BigDecimal("1000.00"))).start();

        try {
            TimeUnit.SECONDS.sleep(1);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        System.out.println(account.get());

        try {
            TimeUnit.SECONDS.sleep(2);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println(account.get());
    }
}

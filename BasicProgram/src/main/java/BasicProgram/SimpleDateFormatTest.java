package BasicProgram;

import java.text.SimpleDateFormat;
import java.util.Arrays;
import java.util.Date;
import java.util.Locale;

/**
 * Created by Yuanping on 2018/1/22.
 */
public class SimpleDateFormatTest {
    public static void main(String[] args) {
        String timestamp = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss.SSS Z",
                Locale.ENGLISH).format(new Date());
        System.out.println(timestamp);

        System.out.println(3*0.1 == 0.3);

        String[] str = {"helo", "word"};
        System.out.println(Arrays.toString(str));

        SimpleDateFormatTest test = new SimpleDateFormatTest();
        test.fun(1, 2);
        test.fun(3, 4f);
    }

    public void fun(int a, int b) {
        System.out.println("int");
    }

    public void fun(int a, float b) {
        System.out.println("float");
    }
}

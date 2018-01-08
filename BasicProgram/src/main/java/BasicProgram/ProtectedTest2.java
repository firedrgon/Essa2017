package BasicProgram;

import java.util.Calendar;

/**
 * Created by Yuanping on 2017/12/15.
 */
public class ProtectedTest2 {
    public static void main(String[] args) {
        ProtectedTest1 test1 = new ProtectedTest1();
        test1.testProtected();

        String str1 = "hello";
        String str2 = "world";

        System.out.println(str1.equals(str2));

        String a = "Programming";
        String b = new String("Programming");
        String c = "Program" + "ming";

        System.out.println(a == b);
        System.out.println(a == c);
        System.out.println(a.equals(b));
        System.out.println(a.equals(c));
        System.out.println(a.intern() == b.intern());

        Calendar calendar = Calendar.getInstance();
        int i = calendar.get(Calendar.HOUR);
        System.out.println(i);
    }
}

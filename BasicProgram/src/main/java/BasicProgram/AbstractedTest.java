package BasicProgram;

/**
 * Created by Yuanping on 2017/12/16.
 */
public abstract class AbstractedTest {
    public static final int a = 4;
    public static void test() {
        System.out.println("test");
    }
    public AbstractedTest() {
        StringBuffer he = new StringBuffer("hello");
        System.out.println(he.reverse());
    }

    public static void main(String[] args) {
        AbstractedTest.test();
    }
}

package BasicProgram;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.StringTokenizer;

/**
 * Created by Yuanping on 2018/1/28.
 */
public class TestGetClass extends Date {
    public static void main(String[] args) {
        new TestGetClass().getC();

        StringBuffer sb = new StringBuffer();
        sb.append("hello");

        List<String> list = new ArrayList<>();
        list.add(sb.toString());

        String data = "John,38,Red"+"+"+"Sally,42,Blue"+"+"+"Rudy,31,Yellow"+"+";
        StringTokenizer st = new StringTokenizer(data, ",+");
        //输出共有几个分隔符
        System.out.println("countTokens::"+st.countTokens());
        while(st.hasMoreTokens()){
            System.out.println(st.nextToken());
        }
    }

    public void getC() {
        System.out.println(super.getClass().getName());
    }
}

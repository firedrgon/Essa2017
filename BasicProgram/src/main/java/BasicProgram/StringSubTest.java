package BasicProgram;

/**
 * Created by Yuanping on 2018/2/5.
 */
public class StringSubTest {
    public static void main(String[] args) throws Exception{
        String str = "我a爱中华abc我爱传智def";
        int num = trimGBK(str.getBytes("GBK"),5);
        System.out.println(str.substring(0,num) );
    }

    public static int  trimGBK(byte[] buf,int n){
        int num = 0;
        boolean bChineseFirstHalf = false;
        for(int i=0;i<n;i++)
        {
            if(buf[i]<0 && !bChineseFirstHalf){
                bChineseFirstHalf = true;
            }else{
                num++;
                bChineseFirstHalf = false;
            }
        }
        return num;
    }
}

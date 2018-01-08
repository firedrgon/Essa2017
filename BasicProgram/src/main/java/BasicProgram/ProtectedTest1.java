package BasicProgram;

/**
 * Created by Yuanping on 2017/12/15.
 */
public class ProtectedTest1 {
    protected void testProtected() {
        ok:
        for(int i=0;i<10;i++)    {
            for(int j=0;j<10;j++)  {
                System.out.println("i=" + i + ",j=" + j);
                if(j == 5) break ok;
            }
        }
        for(int i=0;i<4;i++){
            for(int j=0;j<5;j++){
                System.out.println("i="+i+"; j="+j);
                if(j==3){
                    i=4;
                    break;
                }
            }
        }
    }
}

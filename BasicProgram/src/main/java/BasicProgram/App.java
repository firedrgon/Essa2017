package BasicProgram;

import java.time.LocalDateTime;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        System.out.println( "Hello World!" );
        LocalDateTime now = LocalDateTime.now();

        String str = "1";

        Integer i = 1;
        System.out.println(str.equals(i));
    }
}

package BasicProgram;

/**
 * Created by Yuanping on 2017/12/17.
 */
class Annoyance extends Exception {}
class Sneeze extends Annoyance {}

class Human {

    public static void main(String[] args)
            throws Exception {
        try {
            try {
                throw new Sneeze();
            }
            catch ( Annoyance a ) {
                System.out.println("Caught Annoyance");
                throw a;
            }
        }
        catch ( Sneeze s ) {
            System.out.println("Caught Sneeze");
            return ;
        }
        finally {
            System.out.println("Hello World!");
        }
    }
}

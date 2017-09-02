package GroovyLearn

/**
 * Created by Yuanping on 2017/8/13.
 */
class GroovyTest3 {
    static void main(String[] args){
        try {
            def arr = new int[3];
            arr[5] = 5;
        }catch(ArrayIndexOutOfBoundsException ex) {
            println("Catching the Array out of Bounds exception");
        }catch(Exception ex) {
            println("Catching the exception");
        }

        println("Let's move on after the exception");
    }
}

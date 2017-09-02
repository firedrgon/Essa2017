package GroovyLearn

/**
 * Created by Yuanping on 2017/8/13.
 */
class GroovyTest1 {
    static main(args) {
        def rage = 5..10;
        println(rage);
        println(rage.get(3));

        methodName1(1,33);
    }

    def static methodName1(param1, parma2) {
        println("param1:" + param1);
        println("param2:" + parma2);
    }
}

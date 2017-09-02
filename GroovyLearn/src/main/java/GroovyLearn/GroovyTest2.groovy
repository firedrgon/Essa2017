package GroovyLearn

/**
 * Created by Yuanping on 2017/8/13.
 */
class GroovyTest2 {
    static main(args){
        def file = new File('E:/');
        println "File? ${file.isFile()}";
        println "Directory? ${file.isDirectory()}";

        println("=========================");
        def rootFiles = new File("test").listRoots();
        rootFiles.each {
            file1 -> println file1.absolutePath;
        }

        println("==================");
        new File("E:\\Workspaces").eachFile() {
            file2->println file2.getAbsolutePath()
        }

        println("==============");
        Integer x = 5,y = 10,z = 0;

        // The the values of 5,10 and 0 are boxed into Integer types
        // The values of x and y are unboxed and the addition is performed
        z = x+y;
        println(z);
    }
}

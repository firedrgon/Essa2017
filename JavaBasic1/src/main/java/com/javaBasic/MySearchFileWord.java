package com.javaBasic;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

/**
 * Created by Yuanping on 2018/1/7.
 */
public class MySearchFileWord {
    //工具类中的方法是静态方式访问的，因此将构造器私有不允许创建对象(绝对好习惯)
    private MySearchFileWord() {
        throw new AssertionError();
    }

    public static int countWordInFile(String filename, String word) throws IOException {
        int counter = 0;
        try (FileReader fr = new FileReader(filename)){
            try (BufferedReader br = new BufferedReader(fr)){
                String line = null;
                while ((line = br.readLine()) != null) {
                    int index = -1;
                    //返回String对象子字符串开始位置
                    while (line.length() >= word.length() && (line.indexOf(word)) >= 0) {
                        counter++;
                        line = line.substring(index + word.length());
                    }
                }
            }
        }
        return counter;
    }
}



































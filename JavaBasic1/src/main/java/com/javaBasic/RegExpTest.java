package com.javaBasic;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 * Created by Yuanping on 2018/1/7.
 */
public class RegExpTest {
    public static void main(String[] args) {
        String str = "北京市(朝阳区)(西城区)(海定区)";
        Pattern pattern = Pattern.compile(".*?(?=\\()");
        Matcher matcher = pattern.matcher(str);
        if (matcher.find()) {
            System.out.println(matcher.group());
        }
    }
}

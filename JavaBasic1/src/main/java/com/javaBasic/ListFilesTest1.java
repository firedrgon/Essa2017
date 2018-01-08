package com.javaBasic;

import java.io.File;
import java.io.IOException;
import java.nio.file.*;
import java.nio.file.attribute.BasicFileAttributes;

/**
 * Created by Yuanping on 2018/1/7.
 */
public class ListFilesTest1 {
    public static void main(String[] args) {
        File file = new File("E:\\BaiduYunDownload");
        for (File temp : file.listFiles()) {
            if (temp.isFile()) {
                System.out.println(temp.getName());
            }
        }

        ListFilesTest1.showDirectory(file);
    }

    public static void showDirectory(File file) {
        _walkDirectory(file, 0);
    }

    private static void _walkDirectory(File f, int level) {
        if (f.isDirectory()) {
            for (File file : f.listFiles()) {
                _walkDirectory(file, level + 1);
            }
        } else {
            for (int i = 0; i < level - 1; i++) {
                System.out.println("\t");
            }
            System.out.println(f.getName());
        }
    }

    /**
     * 使用NIO列出目录下的文件
     * @throws IOException
     */
    private static void listFilesNIO() throws IOException {
        Path initPath = Paths.get("E:\\BaiduYunDownload");
        Files.walkFileTree(initPath, new SimpleFileVisitor<Path>(){
            @Override
            public FileVisitResult visitFile(Path file, BasicFileAttributes attrs) throws IOException {
                System.out.println(file.getFileName().toString());
                return FileVisitResult.CONTINUE;
            }
        });
    }
}





















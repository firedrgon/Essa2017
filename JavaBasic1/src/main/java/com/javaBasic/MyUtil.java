package com.javaBasic;

import java.io.*;
import java.nio.ByteBuffer;
import java.nio.channels.FileChannel;

/**
 * 文件的拷贝
 * Created by Yuanping on 2018/1/6.
 */
public class MyUtil {
    private MyUtil() {
        throw new AssertionError();
    }

    /**
     * 使用Java7的TWR,使用TWR后，可以不用finally中释放外部资源，从而让代码更加优雅
     * @param source
     * @param target
     * @throws IOException
     */
    public static void fileCopy(String source, String target) throws IOException {
        try (InputStream in = new FileInputStream(source)){
            try (OutputStream out = new FileOutputStream(target)){
                byte[] buffer = new byte[4096];
                int bytesToRead;
                while ((bytesToRead = in.read(buffer)) != -1) {
                    out.write(buffer, 0, bytesToRead);
                }
            }
        }
    }

    /**
     * NIO
     * @param source
     * @param target
     * @throws IOException
     */
    public static void fileCopyNIO(String source, String target) throws IOException {
        try (FileInputStream in = new FileInputStream(source)) {
            try (FileOutputStream out = new FileOutputStream(target)){
                FileChannel inChannel = in.getChannel();
                FileChannel outChannel = out.getChannel();

                ByteBuffer buffer = ByteBuffer.allocate(4096);
                while (inChannel.read(buffer) != -1) {
                    buffer.flip();
                    outChannel.write(buffer);
                    buffer.clear();
                }
            }
        }
    }
}





























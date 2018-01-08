package com.javaBasic;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.net.Socket;
import java.util.Scanner;

/**
 * Created by Yuanping on 2018/1/7.
 */
public class EchoClient {
    public static void main(String[] args) throws IOException {
        Socket client = new Socket("localhost", 6789);
        Scanner sc = new Scanner(System.in);
        System.out.print("请输入内容: ");
        String msg = sc.nextLine();
        sc.close();
        PrintWriter pw = new PrintWriter(client.getOutputStream());
        pw.println(msg);
        pw.flush();
        BufferedReader br = new BufferedReader(new InputStreamReader(client.getInputStream()));
        System.out.println(br.readLine());
        client.close();
    }
}

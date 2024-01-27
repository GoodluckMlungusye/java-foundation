package com.inputOutputStream;

import java.io.*;

public class WriteFiles {
    public static void main(String[] args) throws IOException {

        FileOutputStream file = new FileOutputStream("sample.txt");
        InputStreamReader input = new InputStreamReader(System.in);
        BufferedReader bufferedReader = new BufferedReader(input);
        PrintWriter output = new PrintWriter(System.out,true);

        output.println("Enter your message:");
        String message = bufferedReader.readLine();

        byte[] messageData = message.getBytes();
        file.write(messageData);
        file.close();

    }
}

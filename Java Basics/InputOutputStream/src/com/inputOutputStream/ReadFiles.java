package com.inputOutputStream;

import java.io.*;

public class ReadFiles {

    public static void main(String[] args) throws IOException {

        FileInputStream file = new FileInputStream("sample.txt");

        int fileData = file.read();
        while(fileData != -1){
            System.out.print((char)fileData);
            fileData = file.read();

        }
        file.close();



    }
}

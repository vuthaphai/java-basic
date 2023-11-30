package com.vp.fileoutputstream;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStream;

public class FileDemo {
    public static void main(String[] args) {
        try {
            String text = "Vutha learning Java basic";
            OutputStream outputStream = new FileOutputStream("D:\\3-Projects\\data2.txt",true);
            outputStream.write(text.getBytes());
            outputStream.close();
            System.out.println("finished");
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}

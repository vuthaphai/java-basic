package com.vp.exeption;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class CheckExceptionDemo {
    public static void main(String[] args) {
        File file = new File("D:\\3-Projects\\heng-garment1.txt");
        try {
            Scanner scanner = new Scanner(file);
            while (scanner.hasNext()){
                System.out.println(scanner.nextLine());
            }
        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        }
    }
}

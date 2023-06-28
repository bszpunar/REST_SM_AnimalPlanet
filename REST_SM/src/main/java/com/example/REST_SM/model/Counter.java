package com.example.REST_SM.model;

import lombok.Getter;

import java.io.*;
import java.util.Scanner;

@Getter
public class Counter {
    public int counter;
    public static void plusOne(){
        File fileCounter = new File("src/main/resources/counter.txt");
        try {
            Scanner scanner = new Scanner(fileCounter);
            String line = "";
            line = scanner.nextLine();

            int tempInt = Integer.parseInt(line);
            tempInt++;

            FileWriter fileWriter = new FileWriter(fileCounter);
            fileWriter.write(""+tempInt);
            fileWriter.flush();

        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}

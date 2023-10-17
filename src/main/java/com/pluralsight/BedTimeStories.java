package com.pluralsight;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Scanner;

public class BedTimeStories {
    public static void main(String[] args) {
        int choice;
        Scanner scanner = new Scanner(System.in);
        System.out.println("(1)Goldilocks");
        System.out.println("(2)Hansel and Gretel");
        System.out.println("(3)Mary had a little Lamb");
        choice = scanner.nextInt();
        FileInputStream fis = null;

        if (choice == 1) {

            try {
                // Create the FileInputStream
                // Pick a specific file
                fis = new FileInputStream("src/main/resources/DataFiles/goldilocks.txt");
                // Create a Scanner for the file to read
                Scanner myScanner = new Scanner(fis);
                String input;

                // Read until no more data
                while (myScanner.hasNext()) {
                    input = myScanner.nextLine();
                    System.out.println(input);
                }
                // Always close your scanner!!!
                myScanner.close();
            } catch (FileNotFoundException e) {
                // Display stack trace if there was an error
                e.printStackTrace();
            }
        } else if (choice == 2) {
            try {

                fis = new FileInputStream("src/main/resources/DataFiles/hansel_and_gretel.txt");
                Scanner myScanner = new Scanner(fis);
                String input;

                while (myScanner.hasNext()) {
                    input = myScanner.nextLine();
                    System.out.println(input);
                }
                myScanner.close();
            } catch (FileNotFoundException e) {
                e.printStackTrace();
            }
        }
        else if(choice == 3){
        try {

            fis = new FileInputStream("src/main/resources/DataFiles/mary_had_a_little_lamb.txt");
            Scanner myScanner = new Scanner(fis);
            String input;

            while (myScanner.hasNext()) {
                input = myScanner.nextLine();
                System.out.println(input);
            }
            myScanner.close();
        } catch (FileNotFoundException e) {
            e.printStackTrace();
            }
        }
    }
}
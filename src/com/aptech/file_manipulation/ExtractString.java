package com.aptech.file_manipulation;

import java.io.*;
import java.util.InputMismatchException;
import java.util.Scanner;

public class ExtractString {
    public void extract(){
        try{
            FileReader fr = new FileReader(Utilities.File1);
            BufferedReader readbuffer = new BufferedReader(fr);
            //Reads each line of the bufferedReader Object
            Utilities.line = readbuffer.readLine();
            //Splits the file into words on occurence of space
            Utilities.words = Utilities.line.split("\\s+");
           
        }
        catch(FileNotFoundException e){
            System.out.println(e.getMessage());
        }
        catch(IOException e){
            System.out.println(e.getMessage());
        }
        
        try{
            //object of the scanner class
            Scanner objScanner = new Scanner(System.in);
            System.out.println("\nEnter position of word to extract from first file: ");
            //stores the position of word to extract
            int wordPosition= objScanner.nextInt();
            
            //conditional statement to get the word selected by useer
            if(wordPosition >=0 && wordPosition < Utilities.words.length){
                Utilities.selectedWord = Utilities.words[wordPosition];
                System.out.println("Word to extract is: " + Utilities.selectedWord);  
            }
            else {
                System.out.println("Invalid position.");
                System.out.println("Enter a value between 0 and " + (Utilities.words.length - 1));
                extract();
            }
        }
        //Catch Input Mismatch Exception if user enters non numeric value
        catch(InputMismatchException ex){
            System.out.println("Invalid position.");
            System.out.println("Only integers allowed");
            System.out.println("Enter a value between 0 and " + (Utilities.words.length - 1));
            extract();
        }
    }
}

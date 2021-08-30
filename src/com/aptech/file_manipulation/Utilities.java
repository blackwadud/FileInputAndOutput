package com.aptech.file_manipulation;

import java.io.*;

public class Utilities {
    // creates variables that will be used across the project
    static File File1 = new File("File1.txt");
    static File File2 = new File("File2.txt");
    static File File3 = new File("File3.txt");
    static String File3Data;
    static String File3Content;
    static File File4 = new File("File4.txt");
    static FileWriter input;
    static String line = "";
    static String[] words = null;
    static String selectedWord;
    static String filePath;
    
     public static void readUsingFileReader(File File1)      
     {
        try
        {
          //creates an object of the fileReader class
          FileReader fr = new FileReader(File1);
          //An ability to buffer the input and to support the mark and reset methods.
          BufferedReader br = new BufferedReader(fr);
          String readerLine;    

          while ((readerLine = br.readLine()) != null) {
              // process the line
              System.out.println(readerLine);
          }
          
          //closes the bufferedreader
          br.close();
          //closes the filereader
          fr.close();
        }
        catch(FileNotFoundException e){
            System.out.println(e.getMessage());
        }
        catch(IOException e){  
            System.out.println(e.getMessage());
        }
    }
}

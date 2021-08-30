package com.aptech.file_manipulation;

import java.io.*;

public class ReplaceWithThirdFile {
   public void writeToThirdFile(){
        try{
            //creates a new file
            boolean value = Utilities.File3.createNewFile();
            if(value){
                System.out.println("\nThird file created");
            }
            else{
                System.out.println("\nThird file exists");
            }
            
            //Data to be written to the file
            Utilities.File3Data = "Seeing, Universe, Going";
        
            //creates an object of the filewriter class
            Utilities.input = new FileWriter("File3.txt"); 
            //writes data to the file
            Utilities.input.write(Utilities.File3Data);
            //System.out.println("Data is written to the file");
            
            //closes the filewriter
            Utilities.input.close();
            
            //creates an object of the fileReader class
            FileReader fr3 = new FileReader(Utilities.File3);
            //creates an object of the BufferedReader 
            BufferedReader readbuffer3 = new BufferedReader(fr3);
            
            //Reads and stores the content of the file
            Utilities.File3Content = readbuffer3.readLine();
        }
        catch(IOException e){
            System.out.println(e.getMessage());
            e.getStackTrace();
        }
        //calls the filerder method to read the content of the file
        System.out.println("Content of third file");
        Utilities.readUsingFileReader(Utilities.File3);
    }
    
    public void replaceWord(){
        try{
            //replaces the extracted text with the third file
            System.out.println("\nExtracted word is replaced with content of third file");
            Utilities.line = Utilities.line.replace(Utilities.selectedWord, Utilities.File3Content);

            //Removing the original content of the first file 
            PrintWriter writer = new PrintWriter("File1.txt");
            writer.print("");
            writer.close();

            //Writes the new content to the first file
            FileOutputStream fos = new FileOutputStream("File1.txt", true);
            fos.write(Utilities.line.getBytes());
        }
        //Catches IOException
        catch(IOException e){
            System.out.println(e.getMessage());
            e.getStackTrace();
        }
    }
}

package com.aptech.file_manipulation;

import java.io.*;

public class CreateAndWrite {
    public void createFile(){
         try{
            //creates a new file 
            boolean value = Utilities.File1.createNewFile();
            if(value){
                System.out.println("First file created");
            }
            else{
                System.out.println("File already exists");
            }
        }
        catch(IOException e){
            System.out.println(e.getMessage());
            e.getStackTrace();
        }
    }
    
    public void writeToFile(){
        //Data to be written to the first file
        String Data = "When your brain gets forced to work in a particular manner you realise what's cerebrum's true capacity. We hardly understand 10% of it's overall functioning throughout our life. Not even imagining the power lying with rest 90%. Blunders or miracles. More peace treaties less World Wars. Greater technological developments less emphasis towards new methods promoting silent killing.";
        try{
            Utilities.input = new FileWriter("File1.txt"); 
            
            // writes data to the file
            Utilities.input.write(Data);
            //System.out.println("Data is written to the file");
            
            Utilities.input.close();
        }
        catch(IOException e){
            e.getMessage();
        }
        
        //Displays the content of the first file 
        System.out.println("Content of first file");
        Utilities.readUsingFileReader(Utilities.File1);
    }
}

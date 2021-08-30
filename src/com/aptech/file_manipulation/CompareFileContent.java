package com.aptech.file_manipulation;

import java.io.*;

public class CompareFileContent {	
    public void compare(){	
        try{
            // creates variables to read text from the input stream for the respective files
            BufferedReader reader1 = new BufferedReader(new FileReader("File1.txt"));
            BufferedReader reader2 = new BufferedReader(new FileReader("File2.txt"));
            
            // reads each line from the files and stores them
            String line1 = reader1.readLine();
            String line2 = reader2.readLine();
            
            // stores the condition of the equality of the files
            boolean areEqual = true;
            
            // keeps track of the lines in the files
            int lineNum = 1;
         
            // loops through the lines in the files and checks if the content are equal or not.
            while (line1 != null || line2 != null) {
                if(line1 == null || line2 == null) {
                    areEqual = false;
                    break;
                }
                else if(!line1.equalsIgnoreCase(line2)){
                    areEqual = false;
                    break;
                }

                line1 = reader1.readLine();
                line2 = reader2.readLine();
                lineNum++;
            }

            // conditional statement to print the appropriate message based on the value of the areEqual variable
            if(areEqual == true) {
                System.out.println("\nFile 1 and Filel 2 have the same content.");
                System.out.println("Content of File 1: " + line1);
                System.out.println("Content of File 2: " + line2);
            }
            else {
                System.out.println("\nFile 1 and Filel 2 have different content.");
                System.out.println("Content of File 1: " + line1);
                System.out.println("Content of File 2: " + line2);
            }

            // clean up code
            // closes the buffered readers
            reader1.close();
            reader2.close();
        }
        catch(IOException e){
            System.out.println(e.getMessage());
        }
    }
}

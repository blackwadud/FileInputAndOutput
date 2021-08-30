package com.aptech.file_manipulation;

import java.io.*;
import java.nio.file.*;

public class ConvertToBytes {
    public void convert(){
        
        Utilities.filePath = "File1.txt";
        try {
            //Convert file to bytes[]
            byte[] bytes = Files.readAllBytes(Paths.get(Utilities.filePath));

            //Save byte code to file4 
            FileOutputStream fos = new FileOutputStream(Utilities.File4);
            fos.write(bytes);
            Utilities.readUsingFileReader(Utilities.File4);

        }
        catch (IOException e) {
            System.out.println(e.getMessage());
        }
    }
}

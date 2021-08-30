package com.aptech.file_manipulation;

import java.io.*;

public class Reverse {
    public void reverse(){
        //Creates the fileinputstream and initializes it to null
        FileInputStream fis = null;
        
        //creates the randomaccessfile and initializes it to nill
        RandomAccessFile raf = null;
        
        // by default, let's use utf-8
        String characterEncoding = "utf-8";
        
        try{
            // input file
            fis = new FileInputStream(Utilities.File1);

            // a reader, because it respects character encoding etc
            Reader r = new InputStreamReader(fis,characterEncoding);

            
            // and a random access file of the same size as the input, so we can write in reverse order 
            raf = new RandomAccessFile(Utilities.File2, "rw");
            raf.setLength(Utilities.File1.length());

            // a buffer for the chars we want to read 
            char[] buff = new char[1];

            // keep track of the current position (we're going backwards, so we start at the end)
            long position = Utilities.File1.length(); 

            // Reader.read will return -1 when it reached the end.
            while((r.read(buff))>-1) {

                // turn the character into bytes according to the character encoding
                Character c = buff[0];
                String s = c+"";
                byte[] bBuff = s.getBytes(characterEncoding);

                // go to the proper position in the random access file
                position = position-bBuff.length;
                raf.seek(position);

                // write one or more bytes for the character
                raf.write(bBuff);
            }
        } 
        catch (IOException e) {
            System.out.println(e.getMessage());
        }
        finally {
            // clean up
            try {
                if(fis != null){
                    fis.close();
                }
                if(raf != null){
                    raf.close();
                }
            }
            catch (IOException e) {
                System.out.println(e.getMessage());
            }
        }
    }
}

package com.aptech.file_manipulation;

public class Main {
    public static void main(String[] args){
        //Entry point of the program
        startUp();
    }
    
    public static void startUp(){
        //Creating objects of the classes in the program
        CreateAndWrite objCreateAndWrite = new CreateAndWrite();
        Reverse objReverse = new Reverse();
        CompareFileContent objCompare = new CompareFileContent();
        ExtractString objExtractString = new ExtractString();
        ReplaceWithThirdFile objReplaceWithThirdFile = new ReplaceWithThirdFile();
        ConvertToBytes objConvert = new ConvertToBytes();
        
        //Calls the create method of the CreateAndWrite class
        objCreateAndWrite.createFile();
        
        //Calls the write method of the CreateAndWrite class
        objCreateAndWrite.writeToFile();
        
        //Calls the reverse method of the Reverse class
        objReverse.reverse();
        
        //Calls the compare method of the CompareFileContent class
        objCompare.compare();
        
        //Calls the extract method of the ExtractString class
        objExtractString.extract();
        
        //Calls the writeToThirdFile method of the ReplaceWithThirdFile class
        objReplaceWithThirdFile.writeToThirdFile();
        
        //Calls the replace method of the ReplaceWithThirdFile class
        objReplaceWithThirdFile.replaceWord();
        
        //Calls the convert method of the ConvertToBytes class
        objConvert.convert();
    }
}

package org.example.FileHandling;

import java.io.*;
import java.util.Scanner;


public class FileHandling {
    public static void main(String[] args)
    {

        //Create a file
        try {
            File file=new File("My file.txt");
            if(file.createNewFile()){
                System.out.println("New file created successfully. File name : "+file.getName());
            }
            else{
                System.out.println("File already exists.");
            }
        }
        catch(IOException e){
            System.out.println("An error occurred while creating a file.");
            e.printStackTrace();
        }

        //Writing to a file
        try {
            FileWriter fileWriter=new FileWriter("My file.txt",true);
            fileWriter.write("File handling refers to the method of storing data.");
            fileWriter.close();
            System.out.println("Written successfully");
        }
        catch (IOException e){
            System.out.println("An error occurred during writing to a file");
            e.printStackTrace();
        }


        //Reading from a file
        try {
            File file = new File("My file.txt");
            Scanner Reader = new Scanner(file);
            while (Reader.hasNextLine()) {
                String data = Reader.nextLine();
                System.out.println(data);
            }
            Reader.close();
        }
        catch (FileNotFoundException e) {
            System.out.println("An error has occurred.");
            e.printStackTrace();
        }
    }
}

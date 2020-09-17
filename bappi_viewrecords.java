import java.util.*;
import java.io.*;
import java.io.IOException;
import java.io.FileReader;
import java.util.Scanner;
import java.io.BufferedReader;

public class bappi_viewrecords{
    public static void main (String[] args) throws IOException{
    try {
        FileReader readFiles = new FileReader("C:\\Practice\\mycsvfile.csv");
        Scanner scanFiles = new Scanner(readFiles);
        while ( scanFiles.hasNextLine()){
            String records = scanFiles.nextLine();
            System.out.println(records);
        }
    }
    catch (Exception e){
    System.out.println(e);       
    }
  }    
}

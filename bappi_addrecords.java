import java.util.*;
import java.io.*;
import java.io.IOException;

public class bappi_addrecords{
    public static void main (String[] args){
        File myFile = new File("C:\\Practice\\mycsvfile.csv");
        try{
             writeToFile(myFile);
            System.out.println("created");
         }
        catch (Exception e){
            System.out.println(e);
        }
    }
     public static void writeToFile(File file) throws Exception{
         FileWriter fw = new FileWriter(file);
         BufferedWriter bw = new BufferedWriter(fw);    
         PrintWriter pw = new PrintWriter(bw);
         pw.println("Name, Course, Age");
         pw.println("Denzel Moin, Java, 19");
         pw.println("Habub Hind, React, 23");
         pw.flush();
         pw.close();
     }
}

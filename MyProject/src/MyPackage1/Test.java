package MyPackage1;

import java.util.*;  
import java.io.*;  
public class Test {  
public static void main(String[] args)throws Exception{  
    FileReader reader=new FileReader("C:\\Myscreenshot\\config.properties");  
      
    Properties p=new Properties();  
    p.load(reader);  
    System.out.println("done");    
}  
}  

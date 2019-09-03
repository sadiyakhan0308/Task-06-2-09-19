package com.wp.Task6;

import java.io.*;
//Merge Content using Input Stream
public class MergeContent {

public static void main(String[] args) throws IOException {
 FileInputStream fistream1 = new FileInputStream("E:\\C\\file3.txt"); 
   FileInputStream fistream2 = new FileInputStream("E:\\C\\file4.txt"); 

   SequenceInputStream sistream = new SequenceInputStream(fistream1, fistream2);  
   FileOutputStream fostream = new FileOutputStream("E:\\C\\file5.txt");   

   int temp;
   System.out.println("New file content is:");
   while( ( temp = sistream.read() ) != -1)
   {
     System.out.print( (char) temp );
     fostream.write(temp);
   }
   fostream.close();
   sistream.close();
   fistream1.close();
   fistream2.close();
  }

}

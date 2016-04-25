import java.io.*;
 public class ReadString{
 public static void main(String[] args)throws IOException{
 BufferedReader T=new BufferedReader(new InputStreamReader(System.in));
 System.out.println("Enter a line of text");
 String Message=T.readLine();
 System.out.println("You entered"+Message);
 }
 } 
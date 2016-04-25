import java.io.*;
public class ReadIntegers{
	public static void main(String[] args)throws IOException{
	BufferedReader h=new BufferedReader(new InputStreamReader(System.in));
	System.out.println("Enter 2 intergers on separate lines");
	int num1=Integer.parseInt(h.readLine());
	int num2=Integer.parseInt(h.readLine());
	System.out.println("Sum="+(num1+num2));
	} 
}
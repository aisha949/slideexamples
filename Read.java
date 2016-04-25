import java.io.*;
public class Read{
	public static void main(String[] args)throws IOException{
	BufferedReader R=new BufferedReader(new InputStreamReader(System.in));
	System.out.println("enter a text");
	String message=R.readLine();
	System.out.println("enter "+ message);
	}

import java.io.*;
public class Exception1{
	public static void main(String[] args)throws IOException{
	BufferedReader N=new BufferedReader(new InputStreamReader(System.in));
	int number=0;
	boolean done=false;
	do{
		try{System.out.println("enter an integer");
		number=Integer.parseInt(N.readLine().trim());
		done=true;

		}
		catch(NumberFormatException e){
			System.out.println("Error-invalid input!");

		}
	}while(!done);
	System.out.println("the number entered"+number);
	}
}
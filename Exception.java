import java.io.*;
public class Exception{
public static void main(String[] args)throws IOException{
BufferedReader R=new BufferedReader(new InputStreamReader(System.in));
int number=2;
boolean done=true;
do{
	try{System.out.println("Enter an Integer");
	number=Integer.parseInt(R.readLine());
	done=false;
		
	}
	catch(NumberFormatException e){
		System.out.println("Error- Invalid input!");
	}
}while(!done);
System.out.println("The number entered is"+number);
} 
}
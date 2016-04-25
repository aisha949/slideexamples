import java.io.*;
public class DayOfWeek1{
	public static void main(String[] args)throws IOException{
	BufferedReader F=new BufferedReader(new InputStreamReader(System.in));
	System.out.println("Enter a Number[1..7]");
	String input=F.readLine();
	int daynumber=Integer.parseInt(input);
	if(daynumber==1)
		System.out.println("Saturday");
	else if(daynumber==2)
		System.out.println("Sunday");
	else if(daynumber==3)
		System.out.println("Monday");
	else if(daynumber==4)
		System.out.println("Tuesday");
	else if(daynumber==5)
		System.out.println("Wednesday");
	else if(daynumber==6)
		System.out.println("Thursday");
	else if(daynumber==7)
		System.out.println("Friday");
	else 
		System.out.println("Wrong input");
	}
}
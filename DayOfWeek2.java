import java.io.*;
public class DayOfWeek2{
	public static void main(String[] args)throws IOException{
	BufferedReader P=new BufferedReader(new InputStreamReader(System.in));
	System.out.println("Enter a Number[1..7]");
	String input=P.readLine();
	int daynumber=Integer.parseInt(input);
	switch(daynumber){
		case 1:
			System.out.println("Saturday");
									break;
		case 2:
			System.out.println("Sunday");
									break;
		case 3:
			System.out.println("Monday");
									break;
		case 4:
			System.out.println("Tuesday");
									break;
		case 5:
			System.out.println("Wednesday");
									break;
		case 6:
			System.out.println("Thursday");
									break;
		case 7:
			System.out.println("Friday");
									break;
	     default:
	           System.out.println("Wrong input");
	       }
	}
}
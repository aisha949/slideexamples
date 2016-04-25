import java.io.*;
import java.util.StringTokenizer;
public class StringTokenizer{
public static void main(String[] args)throws IOException{
	BufferedReader D=new BufferedReader(new InputStreamReader(System.in));
	System.out.println("Enter grades in one line");
	String inputLine=D.readLine();
	String Tokenizer tokenizer=new StringTokenizer(inputLine);
	int count=t.countTokens();
	double sum=0;
	while(tokenizer.hasMoreTokens());
	sum +=Double.parseDouble(tokenizer.nextTokens());
	System.out.println("\nThe average="+sum/count);
}
}
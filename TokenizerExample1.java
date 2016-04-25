import java.io.*;
import java.until.StringTokenizer;
public class TokenizerExample1{
	public static void main(String[] args)throws IOException{
	BufferedReader T=new BufferedReader(new InputStreamReader(System.in));
	 System.out.print("Enter grades in one line");
	 String inputLine=T.readLine();
	 StringTokenizer tokenizer =new StringTokenizer(inputLine);
	 int count=tokenizer.countTokens();
	 double sum=0;
	 while(tokenizer.hasMoreTokens());
	 sum +=Double.parseDouble(tokenizer.nextToken());
	 System.out.println("\nThe average ="+sum / count);
	}
}
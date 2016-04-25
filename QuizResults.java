import java .io.*;
import java.util.StringTokenizer;
public class QuizResults{
	public static void main(String[] arg)throws IOException{
     BufferedReader R=new BufferedReader(new FileReader("grades.tnx"));
      StringTokenizer tokenizer;String inputLine,id;int count;double sum;
        System.out.println("ID# Number of Quizes  Average/n");
        while((inputLine= InputStream.readLine()) != null){
        	tokenizer= new StringTokenizer(inputLine);
        	id=tokenizer.nextToken();
        	count=tokenizer.countTokens();
        	sum=0.0;
        	while(tokenizer.hasMoreTokens())
        		sum+=Double.parseDouble(tokenizer.nextToken( ));
        		System.out.println(id+" "+count+" "+sum/count);  
        }
	}
}
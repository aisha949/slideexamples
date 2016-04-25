import java.io.*;
public class FileAppend{
public static void main(String[] args)throws IOException{
	String Message="java is a Platform independent";
	PrintWriter OutputStream=new PrintWriter(new FileWriter("datafile.txt",true));
	OutputStream.println(Message);
	OutputStream.close();

}
}
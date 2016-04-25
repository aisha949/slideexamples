import java.io.*;
public class FileCopy{
	public static void main(String[] args){
	int input;
	PrintWriter fout=null;
	BufferedReader fin=null;
	try{
		fin=new BufferedReader(new FileReader("myinput.txt"));
	}
	catch(FileNotFoundException e){
		System.out.println("Input not found");
		System.exit(1);
	}
	try{
		fout=new PrintWriter(new FileWriter("myoutfile.txt"));
	}
		catch(IOException e){
		System.out.println("Error opening output file");
		System.exit(1);
	}
	try{
		int count =0;
		while((input = fin.read()) != -1&& count<200){
			char ch=(char) input;
			if(ch!=' '){
				fout.print(ch);
				count++;
			}
		}
	}
	catch(IOException e){
		System.out.println("Error in reading the file myinput.txt");
	}
	try{
		fout.close();
		fin.close();
	}
	catch(IOException e){
		System.out.println("Error in closing a file");
	}
	System.out.println("file copied sucessfull");
	}
}
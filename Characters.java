import java.io.*;
public class Characters{
	public static void main(String[] args)throws IOException{
	BufferedReader P=new BufferedReader(new InputStreamReader(System.in));
	System.out.println("Enter a Characters");
	char ch=(P.readLine()).charAt(0);
	if(! Characters.IsLetter(ch))
		System.out.println(ch+"is not a letter");
	else{
		switch(ch){
			case 'a':case 'A':
			case 'e':case 'E':
			case 'i':case 'I':
			case 'o':case 'O':
			case 'u':case 'U':System.out.println(ch+"is a vowel");
								break;
			default:System.out.println(ch+"is a consonant");

		}
	  }
	 }
	}
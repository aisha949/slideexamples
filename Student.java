import java.io.*;
public class Student{
	String Name;
	int Age;
	String Course;
	int RegNo;
	public Student(String Name,int Age,String Course,int RegNo){
		this.Name=Name;
		this.Age=Age;
		this.Course=Course;
		this.RegNo=RegNo;
	}
	public String getName(){
		return Name;
	}
	public int getAge(){
		return  Age;
	}
	public  String getCourse(){
		return  Course;
	}
	public  int getRegNo(){
		return  RegNo;
	}
	public static void main(String[] args)throws IOException{
		BufferedReader R=new BufferedReader(new InputStreamReader(System.in));
		System.out.println("Enter Student+ Name");
		String Name=R.readLine();
		System.out.println("Enter Student+Age");
		int Age=Integer.parseInt(R.readLine());
		System.out.println("Enter Student+Course");
		String Course=R.readLine();
		System.out.println("Enter Student+RegNo");
		int RegNo=Integer.parseInt(R.readLine());
		Student S=new Student(Name,Age,Course,RegNo);
		S.getName();
		S.getAge();
		S.getCourse();
		S.getRegNo();
	}
}
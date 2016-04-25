public class Students{
	private int id;
	private String name;
	private double gpa;
	public Students(int id,String name,double gpa){
	this.id=id;
	this.name=name;
	this.gpa=gpa;
	}
	public String getname(){
	return name;
	}
	public int getid(){
	return id;
	}
	public double getgpa(){
	return gpa;
	}
}
 public class TestStudents{
 	public static void main(String[] args){
 		Students students=new Students(ada,1123,3.3);
 		System.out.println("name"+students.getname());
 		System.out.println("id"+students.getid());
 		System.out.println("gpa"+students.getgpa());
 	}
 }

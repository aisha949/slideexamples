public class Students2{

	private int id;
	private String name;
	private double gpa;
	public Students2(int id,String name,double gpa){
	this.id=id;
	this.name=name;
	this.gpa=gpa;
	}
	public Students2(int id,String name){
	this(id,name,0.0);
	}
	public String getName(){
	return name;
	}
	public int getID(){
	return id;
	}
	public double getGPA(){
	return gpa;
	}
	public void setGPA(double newGPA){
	gpa=newGPA;
	}
	public static void main(String[] args){
		System.out.println("Students");
	}
}
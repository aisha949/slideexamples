    class Customer{
	int id;
	String name;
	char gender;
	public Customer(int id,String name,char gender){
		this.id=id;
		this.name=name;
		this.gender=gender;
	
	}
	public int getid(){
		return id;
	}
	public String getname(){
		return name;
	}
	public char getgender(){
		return gender;
	}
	public String toString(){
		return "Customer Name\n"+name+"\nID\n"+id+"\nGender\n"+gender;
	}
} 
 	public class TestCustomer{
 		public static void main(String[] args){
 			Customer c=new Customer(232,"Zubaida",'f');
 			System.out.println(c);
 		}
 	}
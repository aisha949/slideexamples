public class Person{
	String name;
	String address;
	public Person(String name,String address){
		this.name=name;
		this.address=address;
	}
	public String getname(){
		return name;
	}
	public String getaddress(){
		return address;
	}
	public void setaddress(String newAddress){
		this.name=newAddress;
	}
	public String toString(){
		return "Person name\n"+name+"\n Address"+address;
	}

}
	 class Student extends Person{
	 	String program;
	 	int year;
	 	double fee;
	 	public Student(String name, String address, String program,int year,double fee){
	 		super(name,address);
	 		this.program=program;
	 		this.year=year;
	 		this.fee=fee;
	 	}
	 	public String getprogram(){
	 		return program;
	 	}
	 	public int getyear(){
	 		return year;
	 	}
	 	public double getfee(){
	 		return fee;
	 	}
	 	public void setprogram(String newProgram){
	 		this.program= newProgram;
	 	}
	 	public void setyear(int newYear){
	 		this.year=newYear;
	 	}
	 	public void setfee(double newFee){
	 		this.fee=newFee;
	 	}
	 	public String toString(){
	 		return "Student"+super.toString()+"\nProgram"+program+"\nYear"+year+"\nFee"+fee;
	 	}
	 	class Staff extends Person{
	 		String school;
	 		double pay;
	 		public Staff(String name,String address,String school,double pay){
	 			super(name,address);
	 			this.school=school;
	 			this.pay=pay;
	 		}
	 		public String getschool(){
	 			return school;
	 		}
	 		public double getpay(){
	 			return pay;
	 		}
	 		public void setschool(String newSchool){
	 			this.school=newSchool;
	 		}
	 		public void setpay(double newPay){
	 			this.pay=newPay;
	 		}
	 		public String toString(){
	 			return "Staff"+super.toString()+"\n School"+school+"\n Pay"+pay;

	 		}

	 	}
	 }
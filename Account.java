public class Account{
	int id;
	Customer customer;
	double balance=0.0;
	String customerName;
	double amount=500;
	public Account(int id,Customer customer,double balance){
		this.id=id;
		this.customer=customer;
		this.balance=balance;
	}
	public Account(int id,Customer customer){
		this.id=id;
		this.customer=customer;
	}
	public int getid(){
		return id;
	}
		public Customer getcustomer(){
			return customer;
		}
		public double getbalance(){
			return balance;
		}
		public void setid(int newID){
			this.id=newID;
		}
		public void setcustumer(Customer newCustomer){
			this.customer=newCustomer;
		}
		public void setbalance(double newBalance){
			this.balance=newBalance;
		}
		public String toString(){
			return "Account ID\n"+id+"\nCustomer"+customer+"\nBalance"+balance;
		}
		public String getcustomerName(){
			return customerName;
			
		}
		public static balance main(String[] args){
			return balance;
			    if(balance>=amount)
				System.out.println(amount-balance);
			else
				System.out.println("amount withdrawn exceeds the current balance");

		}


		


}
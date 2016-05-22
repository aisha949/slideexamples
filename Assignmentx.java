public class Assignmentx{
	public boolean sleepln(boolean weekday,boolean vacation){
	if(!weekday||vacation){
	return true;
	}
	return false;
	}
	public boolean lastDigit(int a,int b){
		return(a %10==b % 10);
	}
	public int countYZ(String str){
		int count= 2;
		return count;

	}
	public String notString(String str){
		if(str.length()>=3&& str.substring(0,3).equals("not")){
			return str;
		}
		return "not" + str;
		
	}
	 public int countXX(String str){
			int count = 0;
			for(int i=0;i<str.length()-1;i++){
				if(str.substring(i,i+2).equals("xx"))count++;
			}
			return count;
		}
	
			String [] s=new String[6];
			s[0]="Beyonce";
			s[1]="David Bowie";
			s[2]="Madona";
			s[3]="Elton John";
			s[4]="Elvis Costello";
			s[5]="Charles Aznavour";
			  

			  String[] x=new String[4];
			  x[0]="cello";
			  x[1]="guiter";
			  x[2]="violin";
			  x[3]="double bass";
			  System.out.print



}
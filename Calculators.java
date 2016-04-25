import java.io.*;
public class Calculators{
	public double add(double x,double y){
	double ans=x+y;
	return ans;
   }
   public double subtraction(double x,double y){
   	double ans=x-y;
   	return ans;
   }
   public double division(double x,double y){
   	double ans=x/y;
   	return ans;
   }
   public double multiplication(double x,double y){
   	double ans=x*y;
   	return ans;
   }
   public double areaOfCircle(double R){
   	double ans=Math.PI*Math.pow(R,2);
   	return ans;
   }
   public double simpleInterest(double P,double R,double T){
   	double ans=P*R*T/100;
   	return ans;
   }
   public double circumfrenceOfCircle(double R){
   	double ans=2*Math.PI*R;
      return ans;
   }
   public static void main(String[] args)throws IOException{
   	BufferedReader R=new BufferedReader(new InputStreamReader(System.in));
   	Calculators C=new Calculators();
   	
   	System.out.println("Maths");
    System.out.println("Enter a number[1...7]");
    System.out.println("1=addition");
    System.out.println("2=subtraction");
    System.out.println("3=division");
    System.out.println("4=multiplication");
    System.out.println("5=areaOfCircle");
    System.out.println("6=simpleInterest");
    System.out.println("7=circumfrenceOfCircle");

   	String input=R.readLine();
   	int cal=Integer.parseInt(input);
   	switch(cal){
   		case 1:
   			System.out.println("addition");
   			System.out.println("Enter 2 numbers to add");
   			double one= Double.parseDouble(R.readLine());
   			// System.out.println("the numbers are="+one);
   			double two=Double.parseDouble(R.readLine());
   			double ans=C.add(one,two);
   			System.out.println("the sum of "+one+" and "+two+" ="+ans);


   			break;
   		case 2:
   			System.out.println("subtraction");
   			System.out.println("Enter 2 numbers to subtract ");
   			double a=Double.parseDouble(R.readLine());
   			double b=Double.parseDouble(R.readLine());
   			double in=C.subtraction(a,b);
   			System.out.println("the subtraction of"+a+"and"+b+"="+in);
   			break;
   		case 3:
   			System.out.println("division");
   			System.out.println("Enter 2 numbers to divide");
   			double c=Double.parseDouble(R.readLine());
   			double d=Double.parseDouble(R.readLine());
   			double out=C.division(c,d);
   			System.out.println("the division of"+c+"and"+d+"="+out);
   			break;
   		case 4:
   			System.out.println("multiplication");
   			System.out.println("Enter 2 numbers to multiply");
   			double f=Double.parseDouble(R.readLine());
   			double e=Double.parseDouble(R.readLine());
   			double get=C.multiplication(f,e);
   			System.out.println("the multiplication of"+f+"and"+e+"="+get);
   			break;
   		case 5:
   			System.out.println("areaOfCircle");
   			System.out.println("Enter one number for areaOfCircle");
   			double g=Double.parseDouble(R.readLine());
   			double z=C.areaOfCircle(g);
   			System.out.println("areaOfCircle of radius "+g+" is = "+z);
   			break;
   		case 6:
   			System.out.println("simpleInterest");
   			System.out.println("Enter 3(PRT) numbers for simpleInterest");
   			double p=Double.parseDouble(R.readLine());
   			double r=Double.parseDouble(R.readLine());
   			double t=Double.parseDouble(R.readLine());
   			double x=C.simpleInterest(p,r,t);
   			System.out.println("simpleInterest of p:"+p+", r:"+r+", t:"+t+" is="+x);

   			break;
   		case 7:
   			System.out.println("circumfrenceOfCircle");
   			System.out.println("Enter one number for circumfrenceOfCircle");
   			double
   			break;
   		default:System.out.println("false");
   		//  D=C.add(2,7);
   		// System.out.println("the sum of 2,7="+D);
   		// D=C.subtraction(3,2);
   		// System.out.println("the subtraction of 3,2="+D);
   		// D=C.division(3,3);
   		// System.out.println("the division of 3,3"+D);
   		// D=C.multiplication(3,3);
   		// System.out.println("the multiplication of 3,3"+D);
   		// D=C.areaOfCircle(2);
   		// System.out.printlnln("the areaOfCircle of 2"+D);
   		// D=C.simpleInterest(4,3,3);
   		// System.out.println("the simpleInterest of 4,3,3"+D);
   		// D=C.circumfrenceOfCircle(6);
   		// System.out.println("the circumfrenceOfCircle of 6"+D);


   	}

   }
}
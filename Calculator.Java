public class Calculator{
	Public double AreaOfCircle(double R){
	double ans=Math.PI*Math.pow(r,2);
	return ans;
	}
	public double CircumfrenceOfCircle(Double R){
		double ans=Math.PI*2*R;
		return ans;
	}
	public static void main(String[] args){
		Calculator C=new Calculator();
		System.out.println("The Area="+C.AreaOfCircle(5));
		System.out.println("The Circumfrence="+C.CircumfrenceOfCircle(7));
	}
}
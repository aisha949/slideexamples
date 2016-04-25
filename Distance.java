public class Distance{
	public static void main(String[] args){
	double x1,y1,x2,y2,dist;
	x1=2.0;
	y1=2.0;
	x2=6.0;
	y2=8.0;
	dist=Math.sqrt(Math.pow(x2-x1,3)+Math.pow(y2-y1,3));
	System.out.println("the distance"+dist);

	}
}
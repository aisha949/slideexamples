public class Sun{
	public int radius;
	public int mass;
	public int luminousIntensity;
	public Sun(int radius,int mass,int luminousIntensity ){
		this.radius=radius;
		this.mass=mass;
		this.luminousIntensity=luminousIntensity;
	}
	public int getr(){
		return radius;
	}
	public int getm(){
		return mass;
	}
	public int getli(){
		return luminousIntensity;
	}
	 public void  setr(int newRadius){
	 	radius=newRadius;
	 }
	 public void setm(int newMass){
	 	mass=newMass;
	 }
	 public void setli(int newLI){
	 	luminousIntensity=newLI;
	 }
	 public double volume(){
	 	return Math.PI*Math.pow(radius,3 )*(4/3);
	 	
	 }
	 public static void main(String[] args){
	 Sun s=new Sun(8,6,3);
	 System.out.println("volume="+s.volume());
	 explode(s);

	 }
	 public  static void explode(Sun s){
	 	s.setr(s.getr()*5);
	 	int limit=s.getr()*s.getm();
	 	for(int i=0;i<limit;i++)
	 		System.out.println("Big Bang");
	 }

}
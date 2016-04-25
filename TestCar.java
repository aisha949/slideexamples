class Car{
	int intialOdoMeterReading;
	int finalOdoMeterReading;
	double litersUsed;
	public Car(int intialReading,int finalReading,double liters){
	this.intialOdoMeterReading=intialReading;
	this.finalOdoMeterReading=finalReading;
	this.litersUsed=liters;
	
	} 
	public Car(int finalReading,double liters){
		this.finalOdoMeterReading=finalReading;
		this.litersUsed=liters;

	}
	public double getKilometersPerLiter(){
		return(finalOdoMeterReading-intialOdoMeterReading)/litersUsed;
	}
	
}
public class TestCar{
		public static void main(String[] args){
			Car car1=new Car(67654345,2345,24);
			System.out.println("fuel comsumption for car1 is"+car1.getKilometersPerLiter()+"km/liter");
			Car car2=new Car(286389202,23);
			System.out.println("fuel comsumption for car2 is"+car2.getKilometersPerLiter()+"km/liter");
		}
	}
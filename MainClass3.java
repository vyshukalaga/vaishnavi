class Car
{
	public String brandName;
	public Car(String z)
	{
		brandName=z;
	}
	public void carInfo()
	{
		System.out.println("Car Brand is : "+ brandName);
	}
}
class MainClass3
{
	public static void main(String[] args) 
	{
		Car c1=new Car("Audi");
		Car c2=new Car("Lamborgani");
		Car c3=new Car("Ferrari");
		c1.carInfo();
		c2.carInfo();
		c3.carInfo();
	}
}

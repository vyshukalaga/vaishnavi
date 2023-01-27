class Circle_Constructor
{
	public double pi=3.14;
	public int radius;
	public Circle_Constructor(int r)
	{
		radius=r;
	}
	public void areaOfCircle()
	{
		double area_OfCircle=pi*radius*radius;
		System.out.println("Area of Circle with radius "+ radius + " is "+area_OfCircle );
	}
}
class MainClass4 
{
	public static void main(String[] args) 
	{
		Circle_Constructor c1=new Circle_Constructor(9);
		Circle_Constructor c2=new Circle_Constructor(27);
		Circle_Constructor c3=new Circle_Constructor(3);
		c1.areaOfCircle();
		c2.areaOfCircle();
		c3.areaOfCircle();
	}
}

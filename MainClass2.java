class ConstructorArgs
{
	public ConstructorArgs(int a)
	{
		int c=a+9;
		System.out.println(c);
	}
}
class  MainClass2
{
	public static void main(String[] args) 
	{
		ConstructorArgs obj1=new ConstructorArgs(12);
		ConstructorArgs obj2=new ConstructorArgs(15);
		ConstructorArgs obj3=new ConstructorArgs(27);
	}
}

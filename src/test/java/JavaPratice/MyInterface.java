package JavaPratice;

public interface MyInterface 
{
  //1. Properties (public static final)
	int x=20; //constant
	
   //2. Not having constructor methods
  //3. static method with bodies.
	public static void method1()
	{
		System.out.println("Hi Students,I am a static method");
	}
	 //4. non-static method with bodies.
	public default  void method2()
	{
			System.out.println("Hi Students,I am a non-static default method");
	}
	
	//5.non-static method with abstract methods without bodies
	
	public void method3();
	
}

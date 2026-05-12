package JavaPratice;

public class MyRunner2 {

	public static void main(String[] args) 
	{
		//calling properties from interface
		System.out.println(MyInterface.x);
		//Calling static method
		MyInterface.method1();
		
		//calling not static default method of using Inteface Object
		MyInterface obj =new MyInterface() {
			public void method3() 
			{
				System.out.println(" one");
			}
		};
		
	}

}

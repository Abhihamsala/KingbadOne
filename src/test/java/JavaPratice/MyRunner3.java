package JavaPratice;

public class MyRunner3 {

	public static void main(String[] args) 
	{
		//calling properties from interface
		System.out.println(MyInterface.x);
		//Calling static method
		MyInterface.method1();
		
		//calling not static default method of using Inteface Object
		MyInterface obj =() ->System.out.println("I got lambada BODY");
			
		obj.method2();
		obj.method3();
	}

}

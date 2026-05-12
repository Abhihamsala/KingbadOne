package JavaPratice;

public class MyRunner1 {

	public static void main(String[] args) 
	{
		//calling properties from interface
		System.out.println(MyInterface.x);
		//Calling static method
		MyInterface.method1();
		
		//calling not static default method
	
		MyInterface obj= new Myconcreteclass();
		
		obj.method2();
		obj.method3();
	}

}

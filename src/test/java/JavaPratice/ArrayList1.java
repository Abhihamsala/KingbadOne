package JavaPratice;

import java.util.Scanner;

public class ArrayList1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		Scanner sc= new Scanner(System.in);
		System.out.println("Enter the size of array:");
		int size1=sc.nextInt();
		int[] arr=new int[size1];
		for(int i=0;i<size1;i++)
		{
			
			arr[i]=sc.nextInt();
			
		}
		
		arr[size1]=sc.nextInt();  // add one or more ,we get java.lang.ArrayIndexOutOfBoundsException

	}

}

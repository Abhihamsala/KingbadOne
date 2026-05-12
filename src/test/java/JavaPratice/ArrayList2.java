package JavaPratice;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class ArrayList2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		Scanner sc= new Scanner(System.in);
		System.out.println("Enter the size of array:");
		int size1=sc.nextInt();
		List<Integer> list =new ArrayList<Integer>();
		for(int i=0;i<size1;i++)
		{
			
			list.add(sc.nextInt());		
		}
		
		list.add(sc.nextInt());	 // add one or more ,
		
	}

}

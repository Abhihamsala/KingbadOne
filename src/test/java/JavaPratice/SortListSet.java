package JavaPratice;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.Set;



public class SortListSet {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		List<Integer> l =new ArrayList<>();
	
		l.add(5);
		l.add(6);
		l.add(5);
		l.add(6);
		l.add(7);
		l.add(6);
		l.add(8);
		l.add(6);
		
		//Sort the list by default ascending order
		Collections.sort(l);
		//Print the sorted list
		System.out.println("Sorted List : " +l);
		//Find the minimum and maximum values
		int min=l.get(0);  //first value is min
		int max=l.get(l.size()-1);  //last value is max
		System.out.println("Min & Max  List : " +l);
		//find the second minimum values
		int secondmin=0;
			for (int i=1;i<l.size();i++)
			{
				if(min!=l.get(i))
				{
					secondmin=l.get(i);
					break;//Terminate loop
				}
			}
		
			//find the second maximum values
			int secondmax=0;
				for (int i=l.size()-2; i>=0;i--)
				{
					if(max!=l.get(i))
					{
						secondmax=l.get(i);
						break;//Terminate loop
					}
				}
	//Print Min,Max,second min and second max
	  
		System.out.println("\n Minimum Value:" +min);
		System.out.println("Maximum Value :" +max);
		System.out.println("Second Minimum Value:" +secondmin);
		System.out.println("Second Maximum Value :" +secondmax);
		
		
	}

}

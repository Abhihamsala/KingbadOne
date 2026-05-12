package JavaPratice;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.Set;



public class ListSet {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		List<String> l =new ArrayList<String>();
	
		l.add("apple");
		l.add("Orange");
		l.add("apple");//duplicate element
		l.add("bannana");
		l.add("apple");
		
		//using the for each loop
		System.out.println("List:");
		for(String fruit :l) {
		  System.out.println(fruit);
		}
		 System.out.print("  ");
		//using the for loop


		System.out.println("List:");
		for(int i=0;i<l.size();i++)
		{
			  System.out.println(l.get(i));
			}
		
		//Example of a set
		
		Set<String> set = new HashSet<>();
		set.add("apple");
		set.add("banana");
		set.add("oranga");
		set.add("apple");//duplicate element
		// using for each loop only
		System.out.println("\nSet:");
		for (String fruit :set)
		{
			System.out.println(fruit);
		}
	}

}

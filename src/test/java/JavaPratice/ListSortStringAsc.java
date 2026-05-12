package JavaPratice;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.Set;



public class ListSortStringAsc
{

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		List<String> l =new ArrayList<String>();
	
		l.add("apple");
		l.add("Orange");
		l.add("Don");
		l.add("ATT");
		l.add("Don");
		l.add("apple");//duplicate element
		l.add("bannana");
		l.add("Orange");
		l.add("Ban");
		l.add("Cat");
		l.add("Orange");
		l.add("bannana");
		l.add("apple");
		
		//Sort the list ascending
		Collections.sort(l);
		//Print the sorted list
		System.out.println("Sorted List : " +l);
		
	}
		
}

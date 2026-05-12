package JavaPratice;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Scanner;
import java.util.Set;

public class ArrayList3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		
		List<String> l =new ArrayList<>();
		l.add("ornga");	
		l.add("apple");	
		l.add("apple");		
		l.add("ornga");	
		l.add("Dog");
		l.add("Dog");
		//convert list to set
		Set<String> s=new HashSet<>(l);
		for(String f:s)
		{
			System.out.println(f);
		}
		
		
	}

}

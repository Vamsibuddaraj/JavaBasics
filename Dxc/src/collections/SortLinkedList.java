package collections;

import java.util.LinkedList;
import java.util.*;

public class SortLinkedList {


	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		LinkedList<String> names=new LinkedList<>();
		names.add("vamsi");
		names.add("krishnam");
		names.add("raju");
		System.out.println("Before Sorting");
		for(String name:names) {
			
			System.out.println(name);
		}
		Collections.sort(names);
		System.out.println("After Sorting");
		for(String name:names) {
			
			System.out.println(name);
		}
		

	}

}

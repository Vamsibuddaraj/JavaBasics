package collections;

import java.util.LinkedList;

public class LinkedListDemo1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		LinkedList<String> names=new LinkedList<String>();
		names.add("vamsi");
		names.add("raju");
		for(String name:names) {
			System.out.println(name);
		}
	}

}

package collections;

import java.util.LinkedList;

public class GetSetLinkedList {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		LinkedList<String> names=new LinkedList<>();
		names.add("vamsi");
		names.add("krishnam");
		names.add("raju");
		names.set(0, "buddaraju");
		for(String name:names) {
			System.out.println(name);
		}
		
	}

}

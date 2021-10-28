package generics.wildcard;

import java.util.ArrayList;

public class UnboundedWildcard {
	
	public static void display(ArrayList<?> lists) {
		for(Object o:lists) {
			System.out.println(o);
		}
	}
//	public static void display(ArrayList<Integer> list) {
//		
//	}


	
	
	public static void main(String[] args) {
		ArrayList<Integer> l1= new ArrayList<>();
		l1.add(1);
		l1.add(2);
		l1.add(3);
		ArrayList<String> l2= new ArrayList<>();
		l2.add("vamsi");
		l2.add("krishnam");
		l2.add("raju");
		System.out.println("Displaying Numbers: ");
		display(l1);
		System.out.println("Displaying Names: ");
		display(l2);
		
		
	}

}

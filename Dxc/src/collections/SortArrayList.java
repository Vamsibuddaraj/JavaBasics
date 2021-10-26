package collections;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class SortArrayList {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<String> names=new ArrayList<>();
		names.add("vamsi");
		names.add("krishnam");
		names.add("raju");
		Collections.sort(names);
		for(String name:names) {
			System.out.println(name);
		}
	}

}

package generics;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class Maps {

	public static void main(String[] args) {
		
		
		Map<Integer,String> map=new HashMap<>();
		map.put(1, "vamsi");
		map.put(2, "krishnam");
		map.put(0, "raju");
		
		Set<Map.Entry<Integer,String>> set=map.entrySet();
		

	}

}

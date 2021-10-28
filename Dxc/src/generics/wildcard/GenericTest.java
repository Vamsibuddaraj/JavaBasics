package generics.wildcard;

import java.util.ArrayList;
import java.util.List;

public class GenericTest {
	
	public static void draw(List<? extends Shape> lists) {
	
		for(Shape s:lists) {
			s.drawShapes();
		}
	}
	
	

	public static void main(String[] args) {
		List<Rectangle> list1=new ArrayList<>();
		list1.add(new Rectangle());
		List<Circle> list2=new ArrayList<>();
		list2.add(new Circle());
		list2.add(new Circle());
		
		
		draw(list1);
		draw(list2);
	}

}

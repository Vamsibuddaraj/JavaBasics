package generics;

public class DemoGenericMethod {
	
//	public static void printarray(int[] elements) {
//		for(int element : elements) {
//			System.out.println(element);
//			
//		}
//		
//	}
//	public static void main(String[] args) {
//		int[] intArray= {1,2,3,4,5};
//		char[] charArray= {'a','b','c','d'};
//		printarray(intArray);
//		printarray(charArray);//we can see the error here so to rectify this we use generics
//	}
	
	public static <E> void printArray(E[] elements) {
		for(E element:elements) {
			System.out.println(element);
		}
	}
	public static void main(String[] args) {
		Integer[] intArray= {1,2,3,4,5};
		Character[] charArray= {'a','b','c','d'};
		printArray(intArray);
		printArray(charArray);
	}

}

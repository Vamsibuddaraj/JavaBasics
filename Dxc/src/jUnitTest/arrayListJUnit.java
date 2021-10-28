package jUnitTest;

import java.util.ArrayList;
import java.util.Scanner;

import org.junit.Assert;
import org.junit.Test;

import junit.framework.TestCase;

public class arrayListJUnit extends TestCase {
	
	@Test
	public void testadd() {
		arrayList.add();
		arrayList.add();
		arrayList.add();
		arrayList.remove();
		assertEquals(4, arrayList.arraySize());
	}
	

}


class arrayList{
	public static Scanner scan=new Scanner(System.in);

	
	
	public static ArrayList<String> al=new ArrayList<>();
	
	public static void add() {
		al.add(scan.nextLine());
	}
	public static void remove() {
		int pos=al.indexOf(scan.nextLine());
		al.remove(pos);
	}
	public static int arraySize() {
		return al.size();
	}

}

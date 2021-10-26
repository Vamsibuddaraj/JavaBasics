package collections;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class StudentArrayList {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Student s1=new Student(2011,"vamsi",20);
		Student s2=new Student(2012,"praveena",21);
		Student s3=new Student(2013,"swagata",21);
		List<Student> student=new ArrayList<Student>();
		student.add(s1);
		student.add(s2);
		student.add(s3);
		Student st=new Student();
		
		for(Student st1:student) {
			
		    System.out.println(st1.rollno+" "+st1.name+" "+st1.age);         
		  }  
		
		
	}

}

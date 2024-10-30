//Default Values
import java.util.Scanner;

class Student
{
	int rno;
	String name;
	String course;
	boolean enroll;
	float no;
	double nos;	
}

public class studentDemo {
	public static void main (String a[])
	{
		Student stud = new Student();
		System.out.println(stud.rno); //0
		System.out.println(stud.name); //null
		System.out.println(stud.course); //null
		System.out.println(stud.enroll); //false
		System.out.println(stud.no); // 0.0
		System.out.println(stud.nos); // 0.0
	}
}
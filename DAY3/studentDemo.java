import java.util.Scanner;

class Student
{
	int rno;
	String name;
	String course;
		void enrollcourse(){
			System.out.println ("Student is enrolled in" + course);
		}
		
		void insertStudDetails (){
			Scanner input = new Scanner (System.in);
			System.out.println ("Enter Student R No.");
			rno = input.nextInt();

			System.out.println ("Enter Student Name");
			name = input.next();

			System.out.println ("Enter Course");
			course = input.next();
		}

		void displayStudDetails (){
			System.out.println ("Student R No. is: " + rno);
			System.out.println ("Student Name is: " + name);
			System.out.println ("Student Course is: " + course);
		}
}

public class studentDemo {
	public static void main (String a[])
	{
		Student stud = new Student();
		stud.insertStudDetails();
		stud.enrollcourse();
		stud.displayStudDetails();
	}
}
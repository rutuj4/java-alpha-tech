import java.util.Scanner;
class Student{
	static String collegeName = "Alpha Tech";
	String studId;
	String studName;

	static String displayCollegeName(){
		//return studName; Static memeber cannot access non-static variable but non-static member can access static variable.
		return collegeName;
	}

	void getStudDetails(){
		Scanner input = new Scanner(System.in);
		System.out.println("Enter student id");
		studId = input.next();
		System.out.println("Enter student name");
		studName = input.next();
	}

	void printStudDetails(){
		System.out.println("Student Details are as follows: ");
		System.out.println("Student Id: " + studId);
		System.out.println("Student Name:" + studName);
		System.out.println("College Name: " + collegeName);
	}
}



class StudentDemo{
	public static void main(String args[])
	{
		Student s1 = new Student();
		Student s2 = new Student();

		//s1.getStudDetails();
		//s1.printStudDetails();

		//s2.getStudDetails();
		//s2.printStudDetails();

		System.out.println(Student.displayCollegeName());
	}
}
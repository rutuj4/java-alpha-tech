import java.util.Scanner;
class College {
	String cid;
	String cname;


	void getCollegeDetails(){
		Scanner input = new Scanner(System.in);
		System.out.println("Enter college ID");
		cid = input.next();

		System.out.println("Enter college Name");
		cname = input.next();		
	}

	void printCollegeDetails(){
		System.out.println("College ID is: " + cid);
		System.out.println("College Name is: " + cname);
	}

}

class Dept extends College {

	String did;
	String dname;
	void getDeptDetails(){
		Scanner input = new Scanner(System.in);
		System.out.println("Enter Dept ID");
		did = input.next();

		System.out.println("Enter Dept Name");
		dname = input.next();		
	}

	void printDeptDetails(){
		System.out.println("Dept ID is: " + did);
		System.out.println("Dept Name is: " + dname);
	}
}


public class SingleInheritanceDemo{
		public static void main(String args[]){
			Dept dept = new Dept();

			dept.getCollegeDetails();
			dept.printCollegeDetails();
	}
}



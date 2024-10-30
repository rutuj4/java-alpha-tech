class Department
{
	int deptId;      //Instance Variables
	String deptName; //Instance Variables
	String deptHod; //Instance Variables
	
	// Parameterized Constructor
	Department(int id, String name, String hod){
		deptId = id;
		deptName = name;
		deptHod = hod;
	}

	void displayDept(){
		System.out.println(deptId);
		System.out.println(deptName);
		System.out.println(deptHod);
	}
}

class University
{
	int unNo;
	String unAdd;

	University(int no, String address){
		unNo = no;
		unAdd = address;
	}
	
	void displayUni(){
		System.out.println(unNo);
		System.out.println(unAdd);
	}
}

public class Demo 
{
	public static void main(String args[])
	{
		Department dept = new Department(111,"CS","Dr.John");
		dept.displayDept();

		University uni = new University(1,"Bangalore");
		uni.displayUni();
	}
}








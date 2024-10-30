//Order of Initialization
//1. Static, 
//2. Non Static
//3. Consructors

class TestDemo
{
	String text = "Java";		
	static String textNow = "Programming"; 


	{

		System.out.println(textNow);
		String text = "Core Java"; 
		System.out.println(text);
		System.out.println("Inside an Initializer block"); 
	}

	{
		System.out.println(text);
		System.out.println("Instance Initializer block 1");
	}

	//Constructor
	TestDemo(){
		System.out.println("Inside Constructor"); 
	}

	static {
		System.out.println("Inside a Static Block");
		// System.out.println(text); Non static variallble, therefore cannnot be called inside a static class.
	}

	public static void main(String args[]){
		TestDemo obj1 = new TestDemo();
	}
}




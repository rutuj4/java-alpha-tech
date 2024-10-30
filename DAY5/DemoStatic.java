//STATIC - ONCE WE DECLARE ANY VARIABLE

//eg: static int a;
//MEMORY WILL BE ALLOCATED FOR THIS AS A CLASS VARIABLE
//Whenever we have static methods, we dont require objects to call the value.

class DemoStatic {


	static void increment_value()
	{
		a++;
	}


	static int a = 10; //class variables
	public static void main(String args[])
	{
		DemoStatic obj1 = new DemoStatic();
		DemoStatic obj2 = new DemoStatic();

		System.out.println(obj1.a);
		System.out.println(obj2.a);

		increment_value();

		System.out.println(obj1.a);
		System.out.println(obj2.a);
	}
}
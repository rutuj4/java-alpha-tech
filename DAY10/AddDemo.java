interface IAdd{
	int add(int a, int b);
}

class Add implements IAdd {
	@Override
	public int add(int a, int b) {
		int c = a+b;
		return c;
	}
}

class AddDemo{
	public static void main(String []args){
		Add addObj = new Add();
		int res = addObj.add(3,4);
		System.out.println(res);
	}
}
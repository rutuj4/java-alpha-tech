class DemoFinal {
	public static void main(String args[]){
		float radius = 0.5f;
		final float pi = 3.142f;
		//pi = 4.1f;
		//It will give the following error: --> error: cannot assign a value to final variable pi

		float area = pi * radius * radius;
		System.out.println("Area of circle: "+ area);
	}
}
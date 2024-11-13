import java.util.Scanner;

interface ISuperMarket{
	void addItemsToCart();
	void generateBill();
	void displayCatalog();
	
}

class SuperMarket implements ISuperMarket{
	
	private String prod1, prod2, prod3;
	private float price1, price2, price3;
		
	@Override
	public void addItemsToCart() {
		//Take items from users - Use Scanner Class

		Scanner input = new Scanner(System.in);

		System.out.println("Add the Product 1");
		prod1 = input.next();
		System.out.println("Enter the price of Product 1");
		price1 = input.nextFloat();
		
		System.out.println("Add the Product 2");
		prod2 = input.next();
		System.out.println("Enter the price of Product 2");
		price2 = input.nextFloat();

		System.out.println("Add the Product 3");
		prod3 = input.next();
		System.out.println("Enter the price of Product 3");
		price3 = input.nextFloat();
		
		System.out.println("Items are added to the cart");
	}

	@Override
	public void generateBill() {
		float total = price1 + price2 + price3;
		System.out.println("Total Bill is: " + total);
	}
	
	@Override
	public void displayCatalog() {
		//Display Product1, Prod2 &  Prod3
		System.out.println("Product Details");
		System.out.println("Product 1: " + prod1 + "Price: " + price1);
		System.out.println("Product Details");
		System.out.println("Product 2: " + prod2 + "Price: " + price2);
		System.out.println("Product Details");
		System.out.println("Product 3: " + prod3 + "Price: " + price3);
	}
}

class SuperDemo{
	public static void main (String []args){
		SuperMarket obj = new SuperMarket();
		
		int n;
		
		Scanner input = new Scanner(System.in);
			
		System.out.println("WELCOME TO SUPERMARKET APP");

		while(true) {
			System.out.println("Choose any one option: \n");
			System.out.println("1. Add Items To Cart \n2. Generate Bill \n3. Display Catalog \n4. Exit");	
			
			n = input.nextInt();

			switch(n){

				case 1:
					//System.out.println("1. Add Items To Cart");
					obj.addItemsToCart();
					break;

				case 2:
					//System.out.println("2. Generate Bill");
					obj.generateBill();		
					break;

				case 3:
					//System.out.println("3. Display Catalog");
					obj.displayCatalog();
					break;

				case 4:
					System.out.println("Exiting the program");
					return;

				default:
					System.out.println("Invalid option selected.");
					break;

			}
		}
	}
}
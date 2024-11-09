// Multi-Level Inheritance

class Vehicles {
	private String model;
	private String typeOfEngine;
	private String color;
	private String mileage;
	private String speed;

	// Whenever we are creating a parameterized constructor, we need to create a Default Constructor so that the objects will be ready

	Vehicles() {} //Default Constructor
	
	Vehicles(String model, String typeOfEngine, String color, String mileage, String speed) //Parameterized Constructor
	{
		super();
		this.model = model;
		this.typeOfEngine = typeOfEngine;
		this.color = color;
		this.mileage = mileage;
		this.speed = speed;
	}

	String startVehicle()
	{
		return "Vehicle Started";
	}

	String stopVehicle()
	{
		return "Vehicle Stopped";
	}

	void displayVehicles(){
		System.out.println("Vehicle Details: ");
		System.out.println(model + typeOfEngine  + color + mileage + speed);
	}
}

class FourWheeler extends Vehicles
{
	private String noOfSeats;
	private String engineType;
	private String segment;
	private String manufacturer;

	FourWheeler(){} //Default Constructor

	FourWheeler(String noOfSeats, String engineType, String segment, String manufacturer) //Parameterized Constructor
	{
		super();
		this.noOfSeats = noOfSeats;
		this.engineType = engineType;
		this.segment = segment;
		this.manufacturer = manufacturer;
	}


	void displayFourWheelers(){
		System.out.println("Four Wheeler Details: ");
		System.out.println(noOfSeats + engineType + segment + manufacturer);
	}

	String moveForward(){
		return "FourWheleer moving forward";
	}

	String moveReverse(){
		return "FourWheleer moving in reverse direction";
	}
}

class TataNano extends FourWheeler{
	private double onRoadPrice;
	private String modelType;

	TataNano(){}
	
	TataNano(double onRoadPrice, String modelType){
		super();
		this.onRoadPrice = onRoadPrice;
		this.modelType = modelType;
	}

	void displayTataNano(){
		System.out.println("TataNano Details");
		System.out.println(onRoadPrice + modelType);
	}

	String headLightsOn(){
		return "Head Lights On";
	}

	String rearLightsOn(){
		return "Rear Lights On";
	}

}

class VehiclesDemo
{
	public static void main(String []args)
	{
		Vehicles vehicles = new Vehicles("ABC", "Petrol", "FerrariRed", "30KM", "120KM");
		FourWheeler fourWheeler = new FourWheeler("5", "Petrol", "NO", "Tata");
		TataNano nano = new TataNano(300000, "NXI");

		nano.displayVehicles();
		nano.displayFourWheelers();
		nano.displayTataNano();

	}
}
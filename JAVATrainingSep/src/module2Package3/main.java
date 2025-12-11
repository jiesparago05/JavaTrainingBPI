package module2Package3;

public class main {
	public static void main(String[] args) {
        
        // Create an object of Car and pass values through constructor
        car car = new car("toyota", "fortuner", "pink");

        // Display initial car details
        car.display();

        // Update car details using setter methods
        car.setBrand("Toyota");
        car.setModel("supra");
        car.setColor("red");

        // Display updated car details
        car.display();
    }
}

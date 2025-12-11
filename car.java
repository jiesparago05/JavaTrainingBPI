package module2Package3;

public class car {
	 // Attributes / Fields
    private String color;
    private String model;
    private String brand;

    // Constructor with parameters (initializes the object values)
    public car(String brand, String model, String color) {
        this.brand = brand;   
        this.model = model;   
        this.color = color;   
    }

    // Getter method - returns the value of brand
    public String getBrand() {
        return this.brand;
    }

    // Setter method - updates the value of brand
    public void setBrand(String brand) {
        this.brand = brand;
    }

    // Getter method - returns the value of model
    public String getModel() {
        return this.model;
    }

    // Setter method - updates the value of model
    public void setModel(String model) {
        this.model = model;   // FIXED (was this.brand = model)
    }

    // Getter method - returns the value of color
    public String getColor() {
        return this.color;
    }

    // Setter method - updates the value of color
    public void setColor(String color) {
        this.color = color;
    }

    // Display method - prints the details of the car
    public void display() {
        System.out.println("Brand: " + this.brand);
        System.out.println("Model: " + this.model);
        System.out.println("Color: " + this.color);
    }
}

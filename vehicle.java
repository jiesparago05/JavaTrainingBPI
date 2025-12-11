package module2Package6;

public abstract class vehicle implements refuelable {
	
	private int numberOfWheel;
    private String brand;

    public abstract void startEngine();
    
    @Override
    public void refuel() {
    	System.out.print(getBrand() + " Vehicle refueled!");
    }

    public void destroy() {
        System.out.println(getBrand() + "Vehicle is destroyed.");
    }

    public int getNumberOfWheel() {
        return numberOfWheel;
    }

    public String getBrand() {
        return brand;
    }

    public void setNumberOfWheel(int numberOfWheel) {
        this.numberOfWheel = numberOfWheel;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

}

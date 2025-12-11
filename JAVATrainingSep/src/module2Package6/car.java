package module2Package6;

public class car extends vehicle {
	
	@Override
	public void startEngine() {
	    System.out.println(getBrand() + " Car engine started!");
	}
	
	@Override
	public void refuel() {
	    System.out.println(getBrand() + " Car Refueled!");
	}
	
	@Override
	public void destroy() {
	    System.out.println(getBrand() + " Car DESTROY!");
	}
	
}

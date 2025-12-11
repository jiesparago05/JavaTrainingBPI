package module2Package6;

public class truck extends vehicle {
	
	@Override
    public void startEngine() {
        System.out.println(getBrand() + " Truck engine started!");
    }

    @Override
    public void refuel() {
        System.out.println(getBrand() + " Truck Refueled!");
    }
    @Override
    public void destroy() {
        System.out.println(getBrand() + " Truck DESTROY!");
    }
}

package module2Package6;

public class main {
	
    public static void main(String[] args) {
    	
        vehicle myTruck =  new truck();
        vehicle myCar = new car();

        
        myTruck.setBrand("BYD");
        myTruck.startEngine();
        myTruck.refuel();

        myCar.setBrand("TOYOTA");
        myCar.startEngine();
        myCar.refuel();
        
        destroyVehicle(myTruck);
        destroyVehicle(myCar);
    }
    
    public static void destroyVehicle(vehicle vehicle) {
        vehicle.destroy();
    }
}

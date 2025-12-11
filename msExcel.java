package module2Package5;

public class msExcel extends program {
	
	public msExcel(String name) {
		super(name);
	}
	
	@Override
	public void run() {
		setIsRunning(true);
		String message = "Opening MS Excel...";
		System.out.println(message);
	}
	
	@Override
	public void stop() {
		setIsRunning(false);
		String message = "Stopping MS Excel...";
		System.out.println(message);
	}
}

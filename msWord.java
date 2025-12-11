package module2Package5;

public class msWord extends program {
	public msWord(String name) {
		super(name);
	}
	
	@Override
	public void run() {
		setIsRunning(true);
		String message = "Opening MS Word...";
		System.out.println(message);
	}
	
	@Override
	public void stop() {
		setIsRunning(false);
		String message = "Stopping MS Word...";
	    System.out.println(message);
	}
}

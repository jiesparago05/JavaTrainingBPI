package module2Package5;

public abstract class program {
	
	private String name;
	private boolean isRunning = false;
	
	public program(String name) {
		this.name = name;
	}
	
	abstract void run();
	abstract void stop();

	 public void setName(String name) {
        this.name = name;
    }

    public void setIsRunning(boolean isRunning) {
        this.isRunning = isRunning;
    }

    public String getName() {
        return name;
    }

    public boolean getIsRunning() {
        return isRunning;
    }
}

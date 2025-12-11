package module2Package4;

public class myApp {
	public static void main(String[] args) {
		executable excel = new executable();
		executable word = new executable();
		
		runProgram(excel);
		runProgram(word);
		
		stopProgram(excel);
		stopProgram(word);
	}
	
	private static void runProgram(executable executableProgram) {
		executableProgram.run();
	}
	private static void stopProgram(executable executableProgram) {
		executableProgram.stop();
	}
}

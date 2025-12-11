package module2Package5;

public class myApp {
	public static void main(String[] args) {
		program excel = new msExcel("MS Excel");
		program word = new msWord("MS Word");
		
		runProgram(excel);
		runProgram(word);
		
		checkProgramStatus(excel);
		checkProgramStatus(word);
		
		stopProgram(excel);
		stopProgram(word);
		
		checkProgramStatus(excel);
		checkProgramStatus(word);
		
	}
	
	private static void runProgram(program executableProgram) {
		
		executableProgram.run();
		
	}
	
	private static void stopProgram(program executableProgram) {
		
		executableProgram.stop();
	}
	
	private static void checkProgramStatus(program executableProgram) {
		
		if(executableProgram.getIsRunning()) {
			
			System.out.println("Program " + executableProgram.getName() + " is running. ");
			
		} else {
			
			System.out.println("Program " + executableProgram.getName() + " is stopped. ");
		}
		
	}

}

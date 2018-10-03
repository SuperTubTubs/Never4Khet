package gameEngine;



import io.CommandLineInterfaces;


/**
 * This is the boot loader for the AI and UI which use the same i/o interface to communicate.
 * @author Hayden
 *
 */
public class BootLoader {

	public static void main(String[] args) 
	{
		//Start up UI
		startUI();
		//Start up AI
		startAI();
		//wait for terminate

	}
	
	private static void startAI() {
		CommandLineInterfaces.startProcess("AI");
	}
	
	private static void startUI() {
		CommandLineInterfaces.startProcess("UI");
	}

}

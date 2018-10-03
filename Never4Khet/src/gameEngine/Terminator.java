package gameEngine;

import java.util.Observable;
import java.util.Observer;

import io.CommandLineInterfaces;

/**
 * This class observes how the program exited and will kill the rest of the apps.
 * @author Hayden
 *
 */
public class Terminator extends Observable implements Observer {
	
	public static final Terminator arnold = new Terminator();
	
	public static Terminator getInstance() {
		return arnold;
	}
	private Terminator() {
		
	}

	@Override
	public void update(Observable o, Object arg) {
		// TODO Auto-generated method stub
		System.out.println("Terminating AI");
		CommandLineInterfaces.killProcess("AI");
		
		System.out.println("Terminating UI");
		CommandLineInterfaces.killProcess("UI");
		System.exit(0);
	}

}

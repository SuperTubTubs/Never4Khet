package gameEngine;

import ai.AIMain;
import ui.UIMain;

/**
 * This is the boot loader for the AI and UI which use the same i/o interface to communicate.
 * @author Hayden
 *
 */
public class BootLoader {

	public static void main(String[] args) 
	{
		//Start up UI
		UIMain.main(args);
		//Start up AI
		AIMain.main(args);
		//wait for terminate

	}

}

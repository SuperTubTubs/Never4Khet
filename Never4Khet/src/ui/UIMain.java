package ui;

import java.util.Observable;

public class UIMain extends Observable {
	
	private final static UIMain instance = new UIMain();
	
	private UIMain() {
		addObserver(gameEngine.Terminator.getInstance());
	}
	
	public static UIMain getInstace() {
		return instance;
	}
	
	public static void main(String[] args) {
		// Starting the Main Menu
		MainMenuFrame.main(args);
	}

	public void terminate() {
		setChanged();
		notifyObservers();
	}
}

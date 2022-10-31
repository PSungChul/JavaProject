package ex03_window_listener;

import java.awt.event.WindowEvent;

public class ClosingListener extends ListenerClass{
	
	@Override
	public void windowClosing(WindowEvent e) {
		System.exit(0);
	}
	
}

package ex02_window_listener;

import java.awt.Frame;

public class EventMain {
	public static void main(String[] args) {
		
		Frame f = new Frame();
		f.setSize(400, 350);
		f.setLocation(600, 500);
		
		//MyListener listener = new MyListener();
		
		//f��ü���� ���� �̺�Ʈ �����ڸ� ���
		//f.addWindowListener( listener );
		f.addWindowListener( new MyListener() );
		
		f.setVisible(true);
		
	}//main
}

package ex02_window_listener;

import java.awt.Frame;

public class EventMain {
	public static void main(String[] args) {
		
		Frame f = new Frame();
		f.setSize(400, 350);
		f.setLocation(600, 500);
		
		//MyListener listener = new MyListener();
		
		//f객체에게 우상단 이벤트 감지자를 등록
		//f.addWindowListener( listener );
		f.addWindowListener( new MyListener() );
		
		f.setVisible(true);
		
	}//main
}

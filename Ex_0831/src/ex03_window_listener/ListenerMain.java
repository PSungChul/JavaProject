package ex03_window_listener;

import java.awt.Frame;

public class ListenerMain {
	public static void main(String[] args) {
		
		Frame f = new Frame();
		//f.setSize(300, 300);
		//f.setLocation(500, 300);
		f.setBounds(500, 300, 300, 300);
		
		//f���� �̺�Ʈ ������ ���
		f.addWindowListener( new ClosingListener() );
		
		f.setVisible(true);
	}//main
}

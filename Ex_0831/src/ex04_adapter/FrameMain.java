package ex04_adapter;

import java.awt.Frame;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

public class FrameMain {
	public static void main(String[] args) {
		
		Frame f = new Frame();
		f.setBounds(400, 400, 300, 250);
		
		f.setVisible(true);

		f.addWindowListener( new WindowAdapter() {
			//익명 내부클래스로 WindowAdapter를 생성
			@Override
			public void windowClosing(WindowEvent e) {
				//System.exit(0);// -> 모든프레임 종료
				f.dispose();//원하는 프레임 한개만 종료
			};
		} );
		
	}//main
}

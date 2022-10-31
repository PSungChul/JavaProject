package ex01_work;

import java.awt.Frame;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

public class FrameMain {
	public static void main(String[] args) {
		
		Frame f = new Frame();
		f.setBounds(500, 400, 400, 350);
		
		f.setVisible(true);
		
		f.addWindowListener(new WindowAdapter() {
			@Override
			public void windowClosing(WindowEvent arg0) {
				
				//x버튼을 감지하면 종료여부를 묻는 팝업프레임을 띄워주자
				new PupupFrame();//생성자만이 이런식으로 이름없이 new로 바로 생성이 가능하다
			}
		});
		
	}//main
}

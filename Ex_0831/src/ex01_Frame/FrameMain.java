package ex01_Frame;

import java.awt.Color;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

public class FrameMain {
	public static void main(String[] args) {
		
		FrameParent f1 = new FrameParent();
		f1.setTitle("f1프레임");
		f1.setBackground(Color.YELLOW);
		
		FrameParent f2 = new FrameParent();
		f2.setTitle("f2프레임");
		f2.setBackground(Color.CYAN);
		
		f1.addWindowListener( new WindowAdapter() {
			//익명 내부클래스로 WindowAdapter를 생성
			@Override
			public void windowClosing(WindowEvent e) {
				System.exit(0);// -> 모든프레임 종료
				//f1.dispose();//원하는 프레임 한개만 종료
			};
		} );
		
	}//main
}

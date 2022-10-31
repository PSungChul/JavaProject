package ex02_window_listener;

import java.awt.event.WindowEvent;
import java.awt.event.WindowListener;

public class MyListener implements WindowListener{
	//WindowListener : 프레임의 우측상단 메뉴들에 대한 이벤트를 감지하기 위한 감지자
	@Override
	public void windowActivated(WindowEvent e) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void windowClosed(WindowEvent e) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void windowClosing(WindowEvent e) {
		//우측상단의 x버튼을 클릭했을 때 호출되는 메서드
		System.out.println("x버튼 클릭함");
		
		//열려있는 모든 프레임을 종료
		System.exit(0);
	}

	@Override
	public void windowDeactivated(WindowEvent e) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void windowDeiconified(WindowEvent e) {
		//최소화 상태에서 원래 크기로 돌아왔을 때 호출
		System.out.println("원래크기로 돌아옴");
	}

	@Override
	public void windowIconified(WindowEvent e) {
		//최소화 버튼을 눌렀을 때 호출
		System.out.println("최소화 됨");
	}

	@Override
	public void windowOpened(WindowEvent e) {
		// TODO Auto-generated method stub
		
	}
	
	
}

package ex01_Frame;

import java.awt.Color;
import java.awt.Frame;

public class FrameTest {
	public static void main(String[] args) {
		
		Frame frame = new Frame("첫 프레임");
		
		frame.setSize(300, 300);//프레임의 너비와 높이(px단위)
		frame.setLocation(500, 400);//프레임이 그려질 위치
		
		frame.setBackground(Color.BLUE);
		
		frame.setVisible(true);//프레임을 화면에 띄운단
		
	}//main
}

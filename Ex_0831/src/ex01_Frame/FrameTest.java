package ex01_Frame;

import java.awt.Color;
import java.awt.Frame;

public class FrameTest {
	public static void main(String[] args) {
		
		Frame frame = new Frame("ù ������");
		
		frame.setSize(300, 300);//�������� �ʺ�� ����(px����)
		frame.setLocation(500, 400);//�������� �׷��� ��ġ
		
		frame.setBackground(Color.BLUE);
		
		frame.setVisible(true);//�������� ȭ�鿡 ����
		
	}//main
}

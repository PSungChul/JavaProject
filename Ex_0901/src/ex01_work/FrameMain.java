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
				
				//x��ư�� �����ϸ� ���Ῡ�θ� ���� �˾��������� �������
				new PupupFrame();//�����ڸ��� �̷������� �̸����� new�� �ٷ� ������ �����ϴ�
			}
		});
		
	}//main
}

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
			//�͸� ����Ŭ������ WindowAdapter�� ����
			@Override
			public void windowClosing(WindowEvent e) {
				//System.exit(0);// -> ��������� ����
				f.dispose();//���ϴ� ������ �Ѱ��� ����
			};
		} );
		
	}//main
}

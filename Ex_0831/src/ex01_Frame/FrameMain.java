package ex01_Frame;

import java.awt.Color;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

public class FrameMain {
	public static void main(String[] args) {
		
		FrameParent f1 = new FrameParent();
		f1.setTitle("f1������");
		f1.setBackground(Color.YELLOW);
		
		FrameParent f2 = new FrameParent();
		f2.setTitle("f2������");
		f2.setBackground(Color.CYAN);
		
		f1.addWindowListener( new WindowAdapter() {
			//�͸� ����Ŭ������ WindowAdapter�� ����
			@Override
			public void windowClosing(WindowEvent e) {
				System.exit(0);// -> ��������� ����
				//f1.dispose();//���ϴ� ������ �Ѱ��� ����
			};
		} );
		
	}//main
}

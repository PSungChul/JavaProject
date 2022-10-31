package ex01_work;

import java.awt.Button;
import java.awt.Frame;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

public class PupupFrame {
	
	public PupupFrame() {
		
		Frame f = new Frame();
		f.setLayout(null);//�ڵ���ġ ����
		
		f.setBounds(550, 550, 300, 200);
		
		Button btn_exit = new Button("����");
		Button btn_cancel = new Button("���");
		
		btn_exit.setBounds(50, 50, 70, 50);
		btn_cancel.setBounds(180, 50, 70, 50);
		
		ActionListener al = new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				//Ŭ���� ��ư�� ������ �ؽ�Ʈ�� �����´�
				String ss = e.getActionCommand();
				//System.out.println(ss);
				
				switch( ss ) {
				case "����":
					System.exit(0);
					break;
				
				case "���":
					f.dispose();
					break;
					
				}//switch
				
			}
		};
		
		btn_exit.addActionListener(al);
		btn_cancel.addActionListener(al);
		
		f.add(btn_exit);
		f.add(btn_cancel);
		
		f.setVisible(true);
		
		f.addWindowListener(new WindowAdapter() {
			@Override
			public void windowClosing(WindowEvent arg0) {
				
				//x��ư�� �����ϸ� ���Ῡ�θ� ���� �˾��������� �������
				f.dispose();
			}
		});
	}
	
}

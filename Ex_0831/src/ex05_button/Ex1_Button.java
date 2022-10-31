package ex05_button;

import java.awt.Button;
import java.awt.Frame;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

public class Ex1_Button {
	public static void main(String[] args) {
		
		Frame f = new Frame();
		f.setBounds(500, 400, 400, 400);
		f.setLayout(null);//�������� �ڵ���ġ�� ����
		
		Button btnOk = new Button("Ȯ��");
		Button btnClose = new Button("�ݱ�");
		
		btnOk.setBounds(70, 90, 100, 50);
		btnClose.setBounds(230, 90, 100, 50);
		
		//��ư�鿡 �̺�Ʈ ������ ���
		btnOk.addActionListener( new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				System.out.println("Ȯ�δ���");
			}
		} );
		
		btnClose.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				System.exit(0);
			}
		});
		
		//�����ӿ� ��ư�� �߰�
		f.add(btnOk);
		f.add(btnClose);
		
		f.setVisible(true);
		
		f.addWindowListener( new WindowAdapter() {
			//�͸� ����Ŭ������ WindowAdapter�� ����
			@Override
			public void windowClosing(WindowEvent e) {
				f.dispose();//���ϴ� ������ �Ѱ��� ����
			};
		} );
		
	}//main
}

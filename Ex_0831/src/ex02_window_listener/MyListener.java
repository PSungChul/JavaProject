package ex02_window_listener;

import java.awt.event.WindowEvent;
import java.awt.event.WindowListener;

public class MyListener implements WindowListener{
	//WindowListener : �������� ������� �޴��鿡 ���� �̺�Ʈ�� �����ϱ� ���� ������
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
		//��������� x��ư�� Ŭ������ �� ȣ��Ǵ� �޼���
		System.out.println("x��ư Ŭ����");
		
		//�����ִ� ��� �������� ����
		System.exit(0);
	}

	@Override
	public void windowDeactivated(WindowEvent e) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void windowDeiconified(WindowEvent e) {
		//�ּ�ȭ ���¿��� ���� ũ��� ���ƿ��� �� ȣ��
		System.out.println("����ũ��� ���ƿ�");
	}

	@Override
	public void windowIconified(WindowEvent e) {
		//�ּ�ȭ ��ư�� ������ �� ȣ��
		System.out.println("�ּ�ȭ ��");
	}

	@Override
	public void windowOpened(WindowEvent e) {
		// TODO Auto-generated method stub
		
	}
	
	
}

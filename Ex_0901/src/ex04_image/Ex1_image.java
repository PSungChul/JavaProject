package ex04_image;

import java.awt.Frame;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JLabel;

public class Ex1_image {
	public static void main(String[] args) {
		
		Frame f = new Frame();
		f.setLayout(null);
		f.setBounds(500, 300, 500, 500);
		
		//����� �̹��� �ҷ�����
		ImageIcon img = new ImageIcon("������.png");
		JLabel jl = new JLabel(img);
		jl.setBounds(0, 0, 500, 500);
		
		ImageIcon img2 = new ImageIcon("������.png");
		JButton btn = new JButton(img2);
		btn.setBounds(100, 100, 100, 50);
		
		//add���� ������ �߿��ϴ�
		f.add(btn);
		f.add(jl);
		
		f.setVisible(true);
		
		f.addWindowListener(new WindowAdapter() {
			@Override
			public void windowClosing(WindowEvent arg0) {
				
				f.dispose();
				
			}
		});
		
	}//main
}

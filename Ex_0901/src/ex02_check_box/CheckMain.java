package ex02_check_box;

import java.awt.Checkbox;
import java.awt.CheckboxGroup;
import java.awt.Color;
import java.awt.Font;
import java.awt.Frame;
import java.awt.Label;
import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

import ex01_work.PupupFrame;

public class CheckMain {
	public static void main(String[] args) {
		
		Frame f = new Frame("���� ��� �սô�");
		f.setLayout(null);//�ڵ���ġ ����
		f.setBounds(500, 300, 700, 300);
		
		Font font = new Font("����ü", Font.BOLD, 20);
		
		Label q1 = new Label("1.��̴� �����Դϱ�?");
		q1.setBounds(10, 50, 400, 50);
		q1.setFont(font);//��Ʈ����
		
		Checkbox books = new Checkbox("����");
		books.setBounds(10, 100, 70, 20);
		Checkbox sports = new Checkbox("�");
		sports.setBounds(100, 100, 70, 20);
		Checkbox movie = new Checkbox("��ȭ����");
		movie.setBounds(190, 100, 70, 20);
		
		//üũ�ڽ��� ����� ������ ����
		ItemListener il = new ItemListener() {
			
			@Override
			public void itemStateChanged(ItemEvent e) {
				//üũ�ڽ��� text�� �����´�
				String s = e.getItem().toString();
				String res = "";
				
				switch(s) {
				case "����":
					res = e.getStateChange() == 1 ? "���� ����" : "���� ����";
					break;
					
				case "�":
					res = e.getStateChange() == 1 ? "� ����" : "� ����";
					break;
					
				case "��ȭ����":
					res = e.getStateChange() == 1 ? "��ȭ ����" : "��ȭ ����";
					break;
				}//switch
				
				System.out.println(res);
			}
		};
		
		Label q2 = new Label("2.����� ������ �����Դϱ�?");
		q2.setBounds(10, 150, 400, 50);
		q2.setFont(font);//��Ʈ����
		
		//������ư ����
		CheckboxGroup group = new CheckboxGroup();
		Checkbox male = new Checkbox("����", group, false);//�̸� �����س����Ÿ� true, �ƴϸ� false
		Checkbox female = new Checkbox("����", group, false);//�̸� �����س����Ÿ� true, �ƴϸ� false
		
		male.setBounds(10, 200, 70, 20);
		female.setBounds(100, 200, 70, 20);
		
		//������ư�� �̺�Ʈ ������ ���
		female.addItemListener(new ItemListener() {
			
			@Override
			public void itemStateChanged(ItemEvent e) {
				String s = e.getItem().toString();//������ư�� ������ text
				int n = e.getStateChange();//������ư�� ���õǸ� 1
				System.out.println("���� �����Դϴ�");
			}
		});
		
		//üũ�ڽ��� il������ �߰�
		books.addItemListener( il );
		sports.addItemListener( il );
		movie.addItemListener( il );
		
		f.add(q1);//�����ӿ� ���� �߰�
		f.add(books);
		f.add(sports);
		f.add(movie);
		
		f.add(q2);
		f.add(male);
		f.add(female);
		
		f.setVisible(true);
		
		f.addWindowListener(new WindowAdapter() {
			@Override
			public void windowClosing(WindowEvent arg0) {
				
				f.dispose();
				
			}
		});
		
	}//main
}

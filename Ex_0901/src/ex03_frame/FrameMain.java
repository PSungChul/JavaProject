package ex03_frame;

import java.awt.Button;
import java.awt.Color;
import java.awt.FileDialog;
import java.awt.Font;
import java.awt.Frame;
import java.awt.TextArea;
import java.awt.TextField;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.TextEvent;
import java.awt.event.TextListener;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import java.io.File;
import java.io.FileWriter;

import javax.swing.JOptionPane;

public class FrameMain {
	public static void main(String[] args) {
		
		Frame frame = new Frame("���� �Է±�");
		frame.setLayout(null);
		frame.setBounds(500, 100, 250, 400);
		frame.setBackground(Color.CYAN);
		
		//----------------------------------------------------------
		//��Ʈ
		Font font = new Font("", Font.PLAIN, 20);
		
		//Ű���忡�� ���� �Է¹ޱ� ���� �Է»���
		TextField tf = new TextField(10);
		tf.setBounds(10, 40, 170, 30);
		tf.setFont(font);
		
		//��ư����
		Button btn = new Button("�Է�");
		btn.setBounds(190, 40, 50, 30);
		btn.setEnabled(false);//��ưŬ�� ��Ȱ��ȭ
		//----------------------------------------------------------
		
		//�������� �ؽ�Ʈ�� �Է¹ޱ����� Ŭ����
		TextArea ta = new TextArea();
		ta.setBackground(Color.LIGHT_GRAY);
		ta.setFont(font);
		ta.setBounds(10, 80, 230, 250);
		ta.setEditable(false);//ta�� ���� ���� �Է��ϴ°��� ����
		//----------------------------------------------------------
		//���ϴ� ��ư �߰�
		Button btnSave = new Button("����");
		Button btnClose = new Button("�ݱ�");
		btnSave.setBounds(20, 340, 100, 40);
		btnClose.setBounds(130, 340, 100, 40);
		
		//�ݱ��ư�� �̺�Ʈ ������ �v��
		btnClose.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				frame.dispose();
			}
		});
		
		//----------------------------------------------------------
		//tf�� ���� �� ��쿡�� �Է¹�ư�� Ȱ��ȭ
		tf.addTextListener(new TextListener() {
			
			@Override
			public void textValueChanged(TextEvent e) {
				if( tf.getText().trim().equals("") ) {
					//tf�� ����ִٸ� �Է¹�ư ��Ȱ��ȭ
					btn.setEnabled(false);
				}else {
					btn.setEnabled(true);
				}
			}
		});
		
		//�Է� ��ư Ŭ���� tf�� ���� ta�� �߰�
		btn.addActionListener( new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				//ta.setText( tf.getText() );
				ta.append( tf.getText() + "\n" );
				
				tf.setText("");
				tf.requestFocus();//Ŀ���� tf�� �ű��
			}
		} );
		
		//�����ư Ŭ���� �̺�Ʈ ó��
		btnSave.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				String message = ta.getText();//ta�� ����
				
				try {
					//path�����ϱ�
					FileDialog fd =
							new FileDialog(frame, "�����ϱ�", FileDialog.SAVE);
					fd.setVisible(true);
					
					//������...
					String path = fd.getDirectory() + fd.getFile();
					
					File f = new File(path);
					FileWriter fw = new FileWriter(f);
					fw.write(message);
					
					fw.close();
					
					//��ҹ�ư�� ������ �ʰ� ���������� ������ ���
					if(fd.getFile() != null) {
						JOptionPane.showMessageDialog(frame, "����Ϸ�");
					}else {
						JOptionPane.showMessageDialog(frame, "�������");
					}
					
				} catch (Exception e2) {
					
				}
				
			}
		});
		
		//----------------------------------------------------------
		//������ ��ü���� frame�� �߰�
		frame.add(tf);
		frame.add(btn);
		frame.add(ta);
		frame.add(btnSave);
		frame.add(btnClose);
		
		frame.setResizable(false);//������ ���� �Ұ�
		frame.setVisible(true);
		
		frame.addWindowListener(new WindowAdapter() {
			@Override
			public void windowClosing(WindowEvent arg0) {
				
				frame.dispose();
				
			}
		});
		
	}//main
}

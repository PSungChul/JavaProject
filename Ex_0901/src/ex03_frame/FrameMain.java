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
		
		Frame frame = new Frame("문장 입력기");
		frame.setLayout(null);
		frame.setBounds(500, 100, 250, 400);
		frame.setBackground(Color.CYAN);
		
		//----------------------------------------------------------
		//폰트
		Font font = new Font("", Font.PLAIN, 20);
		
		//키보드에서 값을 입력받기 위한 입력상자
		TextField tf = new TextField(10);
		tf.setBounds(10, 40, 170, 30);
		tf.setFont(font);
		
		//버튼생성
		Button btn = new Button("입력");
		btn.setBounds(190, 40, 50, 30);
		btn.setEnabled(false);//버튼클릭 비활성화
		//----------------------------------------------------------
		
		//여러줄의 텍스트를 입력받기위한 클래스
		TextArea ta = new TextArea();
		ta.setBackground(Color.LIGHT_GRAY);
		ta.setFont(font);
		ta.setBounds(10, 80, 230, 250);
		ta.setEditable(false);//ta에 직접 값을 입력하는것을 방지
		//----------------------------------------------------------
		//최하단 버튼 추가
		Button btnSave = new Button("저장");
		Button btnClose = new Button("닫기");
		btnSave.setBounds(20, 340, 100, 40);
		btnClose.setBounds(130, 340, 100, 40);
		
		//닫기버튼에 이벤트 감지자 틍록
		btnClose.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				frame.dispose();
			}
		});
		
		//----------------------------------------------------------
		//tf에 값이 들어간 경우에만 입력버튼을 활성화
		tf.addTextListener(new TextListener() {
			
			@Override
			public void textValueChanged(TextEvent e) {
				if( tf.getText().trim().equals("") ) {
					//tf가 비어있다면 입력버튼 비활성화
					btn.setEnabled(false);
				}else {
					btn.setEnabled(true);
				}
			}
		});
		
		//입력 버튼 클릭시 tf의 값을 ta로 추가
		btn.addActionListener( new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				//ta.setText( tf.getText() );
				ta.append( tf.getText() + "\n" );
				
				tf.setText("");
				tf.requestFocus();//커서를 tf로 옮긴다
			}
		} );
		
		//저장버튼 클릭시 이벤트 처리
		btnSave.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				String message = ta.getText();//ta의 내용
				
				try {
					//path지정하기
					FileDialog fd =
							new FileDialog(frame, "저장하기", FileDialog.SAVE);
					fd.setVisible(true);
					
					//저장경로...
					String path = fd.getDirectory() + fd.getFile();
					
					File f = new File(path);
					FileWriter fw = new FileWriter(f);
					fw.write(message);
					
					fw.close();
					
					//취소버튼을 누르지 않고 정상적으로 저장한 경우
					if(fd.getFile() != null) {
						JOptionPane.showMessageDialog(frame, "저장완료");
					}else {
						JOptionPane.showMessageDialog(frame, "저장실패");
					}
					
				} catch (Exception e2) {
					
				}
				
			}
		});
		
		//----------------------------------------------------------
		//생성된 객체들을 frame에 추가
		frame.add(tf);
		frame.add(btn);
		frame.add(ta);
		frame.add(btnSave);
		frame.add(btnClose);
		
		frame.setResizable(false);//사이즈 변경 불가
		frame.setVisible(true);
		
		frame.addWindowListener(new WindowAdapter() {
			@Override
			public void windowClosing(WindowEvent arg0) {
				
				frame.dispose();
				
			}
		});
		
	}//main
}

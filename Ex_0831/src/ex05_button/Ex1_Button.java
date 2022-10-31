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
		f.setLayout(null);//프레임의 자동배치를 끈다
		
		Button btnOk = new Button("확인");
		Button btnClose = new Button("닫기");
		
		btnOk.setBounds(70, 90, 100, 50);
		btnClose.setBounds(230, 90, 100, 50);
		
		//버튼들에 이벤트 감지자 등록
		btnOk.addActionListener( new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				System.out.println("확인누름");
			}
		} );
		
		btnClose.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				System.exit(0);
			}
		});
		
		//프레임에 버튼을 추가
		f.add(btnOk);
		f.add(btnClose);
		
		f.setVisible(true);
		
		f.addWindowListener( new WindowAdapter() {
			//익명 내부클래스로 WindowAdapter를 생성
			@Override
			public void windowClosing(WindowEvent e) {
				f.dispose();//원하는 프레임 한개만 종료
			};
		} );
		
	}//main
}

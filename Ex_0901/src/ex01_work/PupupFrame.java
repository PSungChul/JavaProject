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
		f.setLayout(null);//자동배치 끄기
		
		f.setBounds(550, 550, 300, 200);
		
		Button btn_exit = new Button("종료");
		Button btn_cancel = new Button("취소");
		
		btn_exit.setBounds(50, 50, 70, 50);
		btn_cancel.setBounds(180, 50, 70, 50);
		
		ActionListener al = new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				//클릭된 버튼에 부착된 텍스트를 가져온다
				String ss = e.getActionCommand();
				//System.out.println(ss);
				
				switch( ss ) {
				case "종료":
					System.exit(0);
					break;
				
				case "취소":
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
				
				//x버튼을 감지하면 종료여부를 묻는 팝업프레임을 띄워주자
				f.dispose();
			}
		});
	}
	
}

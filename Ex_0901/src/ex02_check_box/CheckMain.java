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
		
		Frame f = new Frame("질문 몇가지 합시다");
		f.setLayout(null);//자동배치 끄기
		f.setBounds(500, 300, 700, 300);
		
		Font font = new Font("굴림체", Font.BOLD, 20);
		
		Label q1 = new Label("1.취미는 무엇입니까?");
		q1.setBounds(10, 50, 400, 50);
		q1.setFont(font);//폰트세팅
		
		Checkbox books = new Checkbox("독서");
		books.setBounds(10, 100, 70, 20);
		Checkbox sports = new Checkbox("운동");
		sports.setBounds(100, 100, 70, 20);
		Checkbox movie = new Checkbox("영화감상");
		movie.setBounds(190, 100, 70, 20);
		
		//체크박스에 사용할 감지자 생성
		ItemListener il = new ItemListener() {
			
			@Override
			public void itemStateChanged(ItemEvent e) {
				//체크박스의 text를 가져온다
				String s = e.getItem().toString();
				String res = "";
				
				switch(s) {
				case "독서":
					res = e.getStateChange() == 1 ? "독서 선택" : "독서 해제";
					break;
					
				case "운동":
					res = e.getStateChange() == 1 ? "운동 선택" : "운동 해제";
					break;
					
				case "영화감상":
					res = e.getStateChange() == 1 ? "영화 선택" : "영화 해제";
					break;
				}//switch
				
				System.out.println(res);
			}
		};
		
		Label q2 = new Label("2.당신의 성별은 무엇입니까?");
		q2.setBounds(10, 150, 400, 50);
		q2.setFont(font);//폰트세팅
		
		//라디오버튼 생성
		CheckboxGroup group = new CheckboxGroup();
		Checkbox male = new Checkbox("남자", group, false);//미리 선택해놓을거면 true, 아니면 false
		Checkbox female = new Checkbox("여자", group, false);//미리 선택해놓을거면 true, 아니면 false
		
		male.setBounds(10, 200, 70, 20);
		female.setBounds(100, 200, 70, 20);
		
		//라디오버튼에 이벤트 감지자 등록
		female.addItemListener(new ItemListener() {
			
			@Override
			public void itemStateChanged(ItemEvent e) {
				String s = e.getItem().toString();//라디오버튼에 부착된 text
				int n = e.getStateChange();//라디오버튼이 선택되면 1
				System.out.println("저는 여자입니다");
			}
		});
		
		//체크박스에 il감지자 추가
		books.addItemListener( il );
		sports.addItemListener( il );
		movie.addItemListener( il );
		
		f.add(q1);//프레임에 질문 추가
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

package ex02_input;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;

import ex01_file.MyPath;

public class Ex2_FileInput {
	public static void main(String[] args) {
		
		String path = MyPath.path + "test.txt";
		File f = new File(path);
		byte[] b_read = new byte[ (int)f.length() ];//배열이 받을수 있는 값이 int가 최대이기 때문에 long이 기본값인 length를 사용하려면 int로 바꿔줘야한다
		
		if( f.exists() ) {
			
			try {
				FileInputStream fis = new FileInputStream(f);//FileInputStream으로 읽어오면 무조건 String이 가본값이다
				
				//fis가 읽어온 내용을 b_read배열에 저장
				fis.read( b_read );
				
				//b_read배열에 담긴 내용을 문자열 구조로 재조립
				String str = new String( b_read );//String 명시적 객체 생성
				
				System.out.println(str);
				
				//사용이 완료된 스트림은 반드시 닫아준다
				fis.close();
				
			} catch (Exception e) {
				e.printStackTrace();
			}
			
			
		}
		
	}//main
}

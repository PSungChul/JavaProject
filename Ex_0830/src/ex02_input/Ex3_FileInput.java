package ex02_input;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;

import ex01_file.MyPath;

public class Ex3_FileInput {
	public static void main(String[] args) {
		
		//file.txt의 내용을 읽어서 회문인지 판단하시오
		//-----------------
		//!우영우!(은)는 회문입니다
		String path = MyPath.path + "file.txt";
		File f = new File(path);
		byte[] b_read = new byte[(int)f.length()];
		
		try {
			FileInputStream fis = new FileInputStream(f);
			fis.read(b_read);
			
			String ori = new String(b_read);
			String rev = "";
				
			for( int i = ori.length()-1; i >= 0; i-- ) {
				rev += ori.charAt(i);
			}
			
			if( ori.equals(rev) ) {
				System.out.println(ori + "회문수");
			}else {
				System.out.println(ori + "안회문수");
			}
				
			fis.close();
				
		} catch (Exception e) {
			e.printStackTrace();
		}
		
	}//main
}

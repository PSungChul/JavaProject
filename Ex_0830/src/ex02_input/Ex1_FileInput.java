package ex02_input;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;

import ex01_file.MyPath;

public class Ex1_FileInput {
	public static void main(String[] args) {
		
		String path = MyPath.path + "test.txt";
		File f = new File(path);
		
		if( f.exists() ) {
			
			try {
				FileInputStream fis = new FileInputStream(f);
				
				int code = 0;
				
				//read()는 1byte단위로 데이터를 읽어오는데,(아스키 코드)
				//더이상 읽어올 것이 없다면 파일의 끝(EOF)인 -1을 반환
				while( (code = fis.read()) != -1 ) {
					System.out.print((char)code);
				}//while
				
				fis.close();
				
			} catch (Exception e) {
				
				e.printStackTrace();
			}
			
		}
		
	}//main
}

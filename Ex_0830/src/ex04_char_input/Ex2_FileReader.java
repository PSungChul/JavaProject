package ex04_char_input;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;

import ex01_file.MyPath;

public class Ex2_FileReader {
	public static void main(String[] args) {
		
		//file.txt로 접근해서 알파벳 대문자의 갯수와 소문자의 갯수를 각각 출력
		//--------------------
		//대문자 : 5
		//소문자 : 22
		String path = MyPath.path + "file.txt";
		File f = new File(path);
		
		try {
			FileReader fr = new FileReader(f);
			
			int code = 0;
			int upper = 0;//대문자 갯수
			int lower = 0;//소문자 갯수
			
			while( (code = fr.read()) != -1 ) {
				
				if( code >= 'A' && code <= 'Z' ) {
					upper++;
				}
				
				if( code >='a' && code <= 'z' ) {
					lower++;
				}
				
			}//while
			
			System.out.println("대문자 : " + upper);
			System.out.println("소문자 : " + lower);
			
			fr.close();
			
		} catch (Exception e) {
			e.printStackTrace();
		}
		
	}//main
}

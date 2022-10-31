package ex04_char_input;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;

import ex01_file.MyPath;

public class Ex1_FileReader {
	public static void main(String[] args) {
		
		String path = MyPath.path + "test.txt";
		File f = new File(path);
		
		try {
			FileReader fr = new FileReader(f);
			
			int code = 0;
			
			while( (code = fr.read()) != -1 ) {//영어는 1byte로 아스키코드가 들어오고, 한글은 2byte로 유니코드가 들어온다
				System.out.print( (char)code );
			}
			
			fr.close();
			
		} catch (Exception e) {
			e.printStackTrace();
		}
		
	}//main
}

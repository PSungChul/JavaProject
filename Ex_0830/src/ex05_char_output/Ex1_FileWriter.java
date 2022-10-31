package ex05_char_output;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

import ex01_file.MyPath;

public class Ex1_FileWriter {
	public static void main(String[] args) {
		
		String path = MyPath.path + "fileWriter의 예제.txt";
		File f = new File(path);
		
		try {
			FileWriter fr = new FileWriter(f, true);//
			String str = "안녕하세요abc";
			fr.write(str);//char기반의 스트림은 기록할 내용을 byte[]구조로 만들 필요가 없다!!
			
			fr.close();//write는 close()가 반드시 있어야만 내용이 작성이 된다
			
		} catch (Exception e) {
			e.printStackTrace();
		}
		
	}//main
}

package ex04_char_input;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;

import ex01_file.MyPath;

public class Ex2_FileReader {
	public static void main(String[] args) {
		
		//file.txt�� �����ؼ� ���ĺ� �빮���� ������ �ҹ����� ������ ���� ���
		//--------------------
		//�빮�� : 5
		//�ҹ��� : 22
		String path = MyPath.path + "file.txt";
		File f = new File(path);
		
		try {
			FileReader fr = new FileReader(f);
			
			int code = 0;
			int upper = 0;//�빮�� ����
			int lower = 0;//�ҹ��� ����
			
			while( (code = fr.read()) != -1 ) {
				
				if( code >= 'A' && code <= 'Z' ) {
					upper++;
				}
				
				if( code >='a' && code <= 'z' ) {
					lower++;
				}
				
			}//while
			
			System.out.println("�빮�� : " + upper);
			System.out.println("�ҹ��� : " + lower);
			
			fr.close();
			
		} catch (Exception e) {
			e.printStackTrace();
		}
		
	}//main
}

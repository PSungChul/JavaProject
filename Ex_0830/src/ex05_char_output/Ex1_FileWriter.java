package ex05_char_output;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

import ex01_file.MyPath;

public class Ex1_FileWriter {
	public static void main(String[] args) {
		
		String path = MyPath.path + "fileWriter�� ����.txt";
		File f = new File(path);
		
		try {
			FileWriter fr = new FileWriter(f, true);//
			String str = "�ȳ��ϼ���abc";
			fr.write(str);//char����� ��Ʈ���� ����� ������ byte[]������ ���� �ʿ䰡 ����!!
			
			fr.close();//write�� close()�� �ݵ�� �־�߸� ������ �ۼ��� �ȴ�
			
		} catch (Exception e) {
			e.printStackTrace();
		}
		
	}//main
}

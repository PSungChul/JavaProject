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
				
				//read()�� 1byte������ �����͸� �о���µ�,(�ƽ�Ű �ڵ�)
				//���̻� �о�� ���� ���ٸ� ������ ��(EOF)�� -1�� ��ȯ
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

package ex02_input;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;

import ex01_file.MyPath;

public class Ex2_FileInput {
	public static void main(String[] args) {
		
		String path = MyPath.path + "test.txt";
		File f = new File(path);
		byte[] b_read = new byte[ (int)f.length() ];//�迭�� ������ �ִ� ���� int�� �ִ��̱� ������ long�� �⺻���� length�� ����Ϸ��� int�� �ٲ�����Ѵ�
		
		if( f.exists() ) {
			
			try {
				FileInputStream fis = new FileInputStream(f);//FileInputStream���� �о���� ������ String�� �������̴�
				
				//fis�� �о�� ������ b_read�迭�� ����
				fis.read( b_read );
				
				//b_read�迭�� ��� ������ ���ڿ� ������ ������
				String str = new String( b_read );//String ����� ��ü ����
				
				System.out.println(str);
				
				//����� �Ϸ�� ��Ʈ���� �ݵ�� �ݾ��ش�
				fis.close();
				
			} catch (Exception e) {
				e.printStackTrace();
			}
			
			
		}
		
	}//main
}

package ex02_input;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;

import ex01_file.MyPath;

public class Ex3_FileInput {
	public static void main(String[] args) {
		
		//file.txt�� ������ �о ȸ������ �Ǵ��Ͻÿ�
		//-----------------
		//!�쿵��!(��)�� ȸ���Դϴ�
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
				System.out.println(ori + "ȸ����");
			}else {
				System.out.println(ori + "��ȸ����");
			}
				
			fis.close();
				
		} catch (Exception e) {
			e.printStackTrace();
		}
		
	}//main
}

package ex01_file;

import java.io.File;

public class Ex4_File {
	public static void main(String[] args) {
		
		String path = MyPath.path + "aaa";
		File f = new File(path);
		//exists : ��� �غ� �Ϸ�������� true, �ϳ��� �̿Ϸ���¸� false
		//aaa�������� �����ϴ� �������� ���������� �������� �ʴ� ������ ������ �ִ� ���
		if( !f.exists() ) {
			f.mkdirs();//��λ� �������� �ʴ� �������� ����
		}
		
	}//main
}

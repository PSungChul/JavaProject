package ex01_file;

import java.io.File;

public class Ex2_File {
	public static void main(String[] args) {
		
		String path = MyPath.path + "work";
		File f = new File(path);
		
		if( !f.isFile() ) {
			//path����� �������� �̸��� ��� �����´�
			String[] names = f.list();
			
			for( int i = 0; i < names.length; i++ ) {
				System.out.println(names[i]);
			}//for
		}
		
	}//main
}

package ex01_file;

import java.io.File;

public class Ex1_File {
	public static void main(String[] args) {
		//IO(Input, Output)
		//IO�� ����� ��Ʈ���� �ǹ��Ѵ�
		//��Ʈ���̶� �����͸� ������ϱ� ���� ���
		//JVM���� �ַܼ� ���� �������� Output, �ܼ��� ���� JVM���� ������ Input
		String path = MyPath.path + "test.txt";
		File f = new File(path);
		//isFile : ������ ��ΰ� �������� Ȯ�� //isDirectory : ������ ��ΰ� �������� Ȯ��
		if( !f.isDirectory() ) { //f.isFile()
			//path����� ������ ����or������ �뷮�� �����´�
			System.out.println("�뷮 : " + f.length() + "byte");
		}
		
		
	}//main
}

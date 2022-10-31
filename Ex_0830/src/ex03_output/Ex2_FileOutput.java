package ex03_output;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;

import ex01_file.MyPath;

public class Ex2_FileOutput {
	public static void main(String[] args) {
		
		//...Stream : byte����� ��Ʈ��(1byte�����θ� �����͸� �ְ���� �� �ִ�.)//���ϱ����� �ְ���� �� ���
		//...Writer, Reader : char����� ��Ʈ��(�ִ� 2byte���� �����͸� �ְ���� �� �ִ�.)//�ؽ�Ʈ�� �ְ���� �� ���
		
		String path = MyPath.path + "fileOutput����.txt";
		File f = new File(path);
		
		try {
			FileOutputStream fos = new FileOutputStream(f, true);//true/((false)����)�� str�� ������ ���� �ۼ��Ҷ����� �̾�������� �����Ѵ�
			String str = "�ȳ��ϼ���";
			
			//fos���� ������ ������ byte[]������ �ɰ��� �����Ѵ�
			byte[] b = str.getBytes();
			fos.write(b);
			
		} catch (Exception e) {
			e.printStackTrace();
		}
		
	}//main
}

package ex03_output;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;

import ex01_file.MyPath;

public class Ex2_FileOutput {
	public static void main(String[] args) {
		
		//...Stream : byte기반의 스트림(1byte단위로만 데이터를 주고받을 수 있다.)//파일구조를 주고받을 때 사용
		//...Writer, Reader : char기반의 스트림(최대 2byte까지 데이터를 주고받을 수 있다.)//텍스트를 주고받을 때 사용
		
		String path = MyPath.path + "fileOutput예제.txt";
		File f = new File(path);
		
		try {
			FileOutputStream fos = new FileOutputStream(f, true);//true/((false)생략)는 str에 내용을 새로 작성할때마다 이어붙일지를 결정한다
			String str = "안녕하세요";
			
			//fos에게 전달할 내용을 byte[]구조로 쪼개서 저장한다
			byte[] b = str.getBytes();
			fos.write(b);
			
		} catch (Exception e) {
			e.printStackTrace();
		}
		
	}//main
}

package ex01_file;

import java.io.File;

public class Ex1_File {
	public static void main(String[] args) {
		//IO(Input, Output)
		//IO는 입출력 스트림을 의미한다
		//스트림이란 데이터를 입출력하기 위한 통로
		//JVM에서 콘솔로 값을 내보내면 Output, 콘손의 값을 JVM에서 읽으면 Input
		String path = MyPath.path + "test.txt";
		File f = new File(path);
		//isFile : 마지막 경로가 파일인지 확인 //isDirectory : 마지막 경로가 폴더인지 확인
		if( !f.isDirectory() ) { //f.isFile()
			//path경로의 마지막 파일or폴더의 용량을 가져온다
			System.out.println("용량 : " + f.length() + "byte");
		}
		
		
	}//main
}

package ex01_file;

import java.io.File;

public class Ex4_File {
	public static void main(String[] args) {
		
		String path = MyPath.path + "aaa";
		File f = new File(path);
		//exists : 모든 준비가 완료되있으면 true, 하나라도 미완료상태면 false
		//aaa폴더까지 접근하는 과정에서 물리적으로 존재하지 않는 폴더나 파일이 있는 경우
		if( !f.exists() ) {
			f.mkdirs();//경로상에 존재하지 않는 폴더들을 생성
		}
		
	}//main
}

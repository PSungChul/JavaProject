package ex02_input;

import java.io.IOException;
import java.util.Scanner;

public class Ex4_input {
	public static void main(String[] args) {
		
		byte[] read = new byte[100];
		
		Scanner sc = new Scanner(System.in);
		//스캐너를 완전히 풀어 썻을 경우
		System.out.print("입력 : ");
		try {
			System.in.read( read );
			int n = Integer.parseInt( new String(read).trim() );
			System.out.println(n);
			
			System.out.print("문장 : ");
			System.in.read(read);
			System.out.println( new String(read).trim() );
			
			//System.in.close();
			
		} catch (IOException e) {
			e.printStackTrace();
		}
		
		//sc.close();//스캐너 특성상 스트림계열중 스캐너만 close()를 사용하지 않는다
		
	}//main
}

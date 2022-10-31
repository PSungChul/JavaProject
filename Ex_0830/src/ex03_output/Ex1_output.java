package ex03_output;

import java.io.PrintStream;

public class Ex1_output {
	public static void main(String[] args) {
		//System.out.println();을 완전히 풀어 썻을 경우
		//화면에 데이터를 출력하도록 하는 클래스 PrintStream
		PrintStream ps = System.out;
		ps.write('A');
		ps.write('\n');
		ps.write('B');
		
		//스트림은 사용이 완료되면 반드시 닫아주자!!
		ps.close();
	}//main
}

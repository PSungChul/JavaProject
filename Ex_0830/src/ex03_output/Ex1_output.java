package ex03_output;

import java.io.PrintStream;

public class Ex1_output {
	public static void main(String[] args) {
		//System.out.println();�� ������ Ǯ�� ���� ���
		//ȭ�鿡 �����͸� ����ϵ��� �ϴ� Ŭ���� PrintStream
		PrintStream ps = System.out;
		ps.write('A');
		ps.write('\n');
		ps.write('B');
		
		//��Ʈ���� ����� �Ϸ�Ǹ� �ݵ�� �ݾ�����!!
		ps.close();
	}//main
}

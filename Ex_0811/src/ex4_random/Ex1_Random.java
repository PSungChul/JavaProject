package ex4_random;

import java.util.Random;

public class Ex1_Random {
	public static void main(String[] args) {
		//������ ����� ���� �ʿ��� RandomŬ����
		Random rnd = new Random();
		
		//1253 ~ 2517������ ����
		//int random = rnd.nextInt( �߻���ų ������ ���� ) + ���ۼ�;
		//int random = rnd.nextInt( �� �� - ���� �� + 1 ) + ���ۼ�;
		int random = rnd.nextInt( 2517 - 1253 + 1 ) + 1253;
		System.out.println(random);
		
		//������ ����Ͽ� A ~ Z������ �� �� �ϳ��� �������� ���
		int r = rnd.nextInt( 90 - 65 + 1 ) + 65;
		System.out.println((char)r);
		
		int r2 = rnd.nextInt( 'Z' - 'A' + 1 ) + 'A';
		System.out.println((char)r2);
		
		char c = (char)(rnd.nextInt( 'Z' - 'A' + 1 ) + 'A');
		System.out.println(c);
	}//main
}

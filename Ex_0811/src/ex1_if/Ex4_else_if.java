package ex1_if;

public class Ex4_else_if {
	public static void main(String[] args) {
		
		//else-if�� : �������� ���� �񱳰� �ʿ��� ���
		int num = 75;
		String str = "";
		
		if( num >= 90 ) {
			str = "A";
		}else if( num >= 80 ){
			str = "B";
		}else if( num >= 70 ){
			str = "C";
		}else if( num >= 60 ){
			str = "D";
		}else {
			//���� �غ��ص� ��� ���ǽ��� ������ ���
			//else������ �ݵ�� ���ļ� �������´�
			str = "F";
		}
		
		System.out.println(str);
		
	}//main

}

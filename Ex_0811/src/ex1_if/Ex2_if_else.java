package ex1_if;

public class Ex2_if_else {
	
	public static void main(String[] args) {
		
		//if_else�� : �ϳ��� ���ǽ��� ������ ���� ������ ��� Ŀ���ϴ� ���ǽ�
		//if( ���ǽ� ){
		//	���ǽ��� ���϶� ����Ǵ� ����
		//}else{
		//	���ǽ��� ������ �� ����Ǵ� ����
		//}
		int n = 49;
		String str = "";
		
		if( ++n >= 50 ) {
			str = "50�̻��� ��";
		}else {
			//���� ������ �����̶�� '�ݵ��' ����Ǵ� ����
			str = "50�̸��� ��";
		}
		
		System.out.println(str);
		
		System.out.println("------------------------------");
		
		//���� age�� ���̸� �����ϰ�
		//30�� �̻��̸� '��Ǹ�ŭ ��̱���'�� �׷��� ������ '�� �� ��ŵ� ��'��
		//����ϴ� if���� ����ÿ�
		int age = 28;
		
		if( age >= 30 ) {
			System.out.println("��Ǹ�ŭ ��̱���");
		}else {
			System.out.println("�� ��ŵ� ��");
		}
		
		System.out.println("------------------------------");
		
		//���� if-else���� ���׿����ڷ� �����غ���
		String res = age >= 30 ? "��Ǹ�ŭ ��̱���" : "�� �嵮�� ��";		
		System.out.println(res);		
	}//main
	
}

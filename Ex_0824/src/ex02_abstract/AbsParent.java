package ex02_abstract;

public abstract class AbsParent {
	//�߻�޼��带 �Ѱ��� ������ �ִ� Ŭ������
	//abstract�� ���ؼ� �߻�Ŭ�������� �������� �Ѵ�
	
	int n = 100;
	String str = "hi";
	
	public int getN() {
		return n;
	}
	
	//�޼����� ���࿵��(body)�� ���� '�̿ϼ��� �޼���' �� �߻�޼���
	//��, �߻�޼���� abstractŰ���带 ������ �־�� �Ѵ�.
	abstract public void setN(int n);
	
}

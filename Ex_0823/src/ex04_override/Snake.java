package ex04_override;

public class Snake extends Animal{

	String sensor = "�㿡�� �ߺ�";
	
	//�������̵�
	//'�޼����� ������'�� �ǹ̸� ������, ��Ӱ����� ��ü����
	//�θ��� �Լ��� �״�� ��������, �ڽ��� ������ �°� ���븸 ������ �ϴ°��� �ǹ��Ѵ�.
	@Override
	public int getLeg() {
		return 0;
	}
	
}

package ex01_super;

public class Child extends Parent{
	
	//super : �θ�Ŭ����
	//super�� ���ó
	//�θ��� �����ڸ� ȣ��
	public Child() {
		//�θ�Ŭ�������� ���ڰ��� ���ٸ� ��������������, ���ڰ��� �ִٸ� �ʿ��ϴ�
		super(10); //Parent();
		System.out.println("Child�� ������");
	}
	
	//�θ��� ������ ȣ��
	public void test( int num ) {
		super.num = num;
	}
	
	//�θ��� �޼��带 ȣ��
	@Override
	public int getNum() {
		//     Parent.getNum();
		return super.getNum();
	}
	
}

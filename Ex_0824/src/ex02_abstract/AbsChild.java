package ex02_abstract;

public class AbsChild extends AbsParent{

	//�߻�Ŭ������ ��ӹ޴� �ڽ�Ŭ������
	//�θ��� �̿ϼ� �޼��带 ��ӹ޾� �ϼ���Ű�� ���� ������ �ȴ�.
	@Override
	public void setN(int n) {
		System.out.println("n:" + n);
	}
	
}

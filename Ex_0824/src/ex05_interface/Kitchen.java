package ex05_interface;

//�������̽��� ���߱����� �����ϴ�
//public class Kitchen implements Menu1, Menu2, Menu3{
public class Kitchen implements Menu3{

	@Override
	public String jjajang() {
		return "�߸� + ����ҽ� + ����";
	}

	@Override
	public String jjambbong() {
		return "ȫ�� + ��¡�� + ���߱⸧";
	}

	@Override
	public String tangsuyuck() {
		return "������� + ��� + ���̹���";
	}

	@Override
	public String mandu() {
		return "�а��� + ���μ�";
	}

	@Override
	public String boggembab() {
		return "�� + �ް� + ���";
	}

}

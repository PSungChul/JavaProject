package ex04_interface;

public class InterChild implements InterTest{
	//인터페이스는 implements예약어를 통해 '구현'한다

	@Override
	public int getA() {
		return VALUE;
	}
}

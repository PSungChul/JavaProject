package ex03_abstract;

public class UnitMain {
	public static void main(String[] args) {
		
		Terran t1 = new Terran("�غ�", 100, false);
		t1.decEnergy();
		System.out.println(t1.getEnergy());
		
		Protoss p1 = new Protoss("��Ʋ", 50, true);
		p1.decEnergy();
		p1.decEnergy();
		System.out.println(p1.getEnergy());
		
		zerg z1 = new zerg("�����", 200, false);
		z1.decEnergy();
		System.out.println(z1.getEnergy());
	}//main
}

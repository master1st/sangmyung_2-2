
class Parents {
	public void familyName() {
		System.out.print("��");
	}
	
	public void name() {
		familyName();
		System.out.println("ö��");
	}
}

class Son extends Parents {
	public void name() {
		familyName();
		System.out.println("����");
	}
}

class Daughter extends Parents {
	public void name() {
		familyName();
		System.out.println("��");
	}
}

public class UpCastingEx2 {
	public static void main(String[] args) {
		Son s = new Son();
		Daughter d = new Daughter();
		
		Parents p = (Parents)s; // ��ĳ���� (Parents)��������
		Parents p2 = (Parents)d;
		
		p.name();  // ���� �տ� ���� ����
		p2.name(); // �� �տ� ���� ����
	}
}
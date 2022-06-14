
class Parents {
	public void familyName() {
		System.out.print("김");
	}
	
	public void name() {
		familyName();
		System.out.println("철수");
	}
}

class Son extends Parents {
	public void name() {
		familyName();
		System.out.println("인직");
	}
}

class Daughter extends Parents {
	public void name() {
		familyName();
		System.out.println("희선");
	}
}

public class UpCastingEx2 {
	public static void main(String[] args) {
		Son s = new Son();
		Daughter d = new Daughter();
		
		Parents p = (Parents)s; // 업캐스팅 (Parents)생략가능
		Parents p2 = (Parents)d;
		
		p.name();  // 인직 앞에 김이 붙음
		p2.name(); // 희선 앞에 김이 붙음
	}
}
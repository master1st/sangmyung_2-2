
public class MyInfoApp {
	String name;
	int age ;
	String subject;
	
	public MyInfoApp(String name, int age, String subject) {
		this.name = name;
		this.age = age;
		this.subject = subject;
	}
	
	public void viewApp() {
		System.out.println("�� �̸��� "+name+" �� ���̴� "+age+" �� ������ "+subject);
	}
	public static void main(String[] args) {
		MyInfoApp my = new MyInfoApp("������",23,"��ǻ�Ͱ��а�");
		my.viewApp();
				
	}
}


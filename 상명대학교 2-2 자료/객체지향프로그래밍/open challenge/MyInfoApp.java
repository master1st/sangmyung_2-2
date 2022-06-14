
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
		System.out.println("내 이름은 "+name+" 내 나이는 "+age+" 내 전공은 "+subject);
	}
	public static void main(String[] args) {
		MyInfoApp my = new MyInfoApp("윤석현",23,"컴퓨터과학과");
		my.viewApp();
				
	}
}


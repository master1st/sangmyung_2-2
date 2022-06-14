class Person {
	private int weigth;
	int age;
	protected int height;
	public String name;
	
	public void getWeight(int weigth) {
		this.weigth = weigth;
	}
	public void showWeight() {
		System.out.println(this.weigth);
	}
}

class Student extends Person {
	public void set() {
		age = 30;
		name = "ȫ�浿";
		height = 175;
		getWeight(99);
	}
}
public class InheritanceEx {
	public static void main(String[] args) {
		Student s = new Student();
		s.set();
		System.out.print(s.age + s.name + s.height);
		s.showWeight();
	}
}

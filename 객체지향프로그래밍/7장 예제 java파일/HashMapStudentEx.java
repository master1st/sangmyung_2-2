import java.util.*;

class Student {
	int id;
	String tel;
	public Student(int id, String tel) {
		this.id = id; this.tel = tel;
	}
public class HashMapStudentEx {
	public static void main(String[] args) {
		HashMap<String, String> map = new HashMap<String, Student>();
		
		map.put("Ȳ����",new Student(1,"010-9497-3180"));
		map.put("Ȳ����",new Student(1,"010-9497-3180"));
		map.put("Ȳ����",new Student(1,"010-9497-3180"));
		
		Scanner scanner = new Scanner(System.in);
		while(true) {
			System.out.println("�˻��� �̸�?");
			String name = scanner.nextLine();
			if(name.equals("exit"))
				break;
			Student student = map.get(name);
			if(student == null)
				System.out.println(name +"�� ���� ����Դϴ�.");
			else {
				System.out.println("id:",+student.getid()+"��ȭ:"+student.tel);
			}
			
		}
	}
}

}
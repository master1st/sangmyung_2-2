package �⸻�����غ�;
import java.util.*;
public class HashMapDicEx {
	public static void main(String[] args) {
		HashMap<String, String> hs = new HashMap<String,String>();
		hs.put("�迵��", "�Ǳ���");
		hs.put("������", "����");
		hs.put("�ں���", "�ڿ���");
		
		Scanner scanner = new Scanner(System.in);
		while(true) {
			System.out.print("ã����� �ܾ��?");
			String eng = scanner.next();
			if(eng.equals("exit")) {
				System.out.println("�����մϴ�.");
				break;
			}
			String kor = hs.get(eng);
			if(kor == null)
				System.out.println("ã����� �ܾ �����ϴ�.");
			else
				System.out.println(kor);
		}
		scanner.close();
	}
}

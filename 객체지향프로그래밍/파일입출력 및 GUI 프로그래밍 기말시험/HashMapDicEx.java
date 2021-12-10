package 기말시험준비;
import java.util.*;
public class HashMapDicEx {
	public static void main(String[] args) {
		HashMap<String, String> hs = new HashMap<String,String>();
		hs.put("김영석", "건국대");
		hs.put("윤석현", "상명대");
		hs.put("박병건", "박연구");
		
		Scanner scanner = new Scanner(System.in);
		while(true) {
			System.out.print("찾고싶은 단어는?");
			String eng = scanner.next();
			if(eng.equals("exit")) {
				System.out.println("종료합니다.");
				break;
			}
			String kor = hs.get(eng);
			if(kor == null)
				System.out.println("찾고싶은 단어가 없습니다.");
			else
				System.out.println(kor);
		}
		scanner.close();
	}
}

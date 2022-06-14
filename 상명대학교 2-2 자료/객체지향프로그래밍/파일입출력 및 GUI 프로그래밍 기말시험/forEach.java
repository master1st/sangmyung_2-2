
public class forEach {
	public static void main(String[] args) {
		int[] num = {1,2,3,4,5};
		int sum =0;
		for (int k : num)
			sum += k;
		System.out.println("값의 합은 : " + sum);
		
		String[] fruits = {"사과","배","바나나","체리","포도"};
		for(String s : fruits) {
			System.out.println(s);
		}
//		1. 클래스처럼 보이게 하는 상수
//		2. 서로 관련있는 상수들끼리 모아 상수들을 대표할 수 있는 이름으로 타입을 정의하는 것
//		3. Enum 클래스 형을 기반으로 한 클래스형 선언 
		enum Week {월,화,수,목,금,토,일}
		for(Week day : Week.values())
			System.out.println(day+"요일");
		
		enum people {남,녀,노,소}
		for(people p : people.values())
			System.out.println(p+"자");
	}
}

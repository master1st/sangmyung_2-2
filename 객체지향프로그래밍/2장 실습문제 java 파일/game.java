import java.util.Scanner;

public class game{
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("가위바위보 게임입니다. 가위, 바위, 보 중에서 입력하세요");
		System.out.println("철수 >> ");
		String c = scanner.nextLine();
		System.out.println("영희 >> ");
		String y = scanner.nextLine();
		
		if(c.equals("가위")) {
			if(y.equals("가위")) {
				System.out.println("비겼습니다.");
			}
			else if(y.equals("바위")) {
				System.out.println("영희가 이겼습니다.");
			}
			else {
				System.out.println("철수가 이겼습니다.");
			}
		}
		if(c.equals("바위")) {
			if(y.equals("가위")) {
				System.out.println("철수가 이겼습니다..");
			}
			else if(y.equals("바위")) {
				System.out.println("비겼습니다.");
			}
			else {
				System.out.println("영희가 이겼습니다.");
			}
		}
		if(c.equals("보")) {
			if(y.equals("가위")) {
				System.out.println("영희가 이겼습니다.");
			}
			else if(y.equals("바위")) {
				System.out.println("철수가 이겼습니다.");
			}
			else {
				System.out.println("비겼습니다.");
			}
		}
		
		
		
	}
}
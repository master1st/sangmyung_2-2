import java.util.Scanner;
public class won {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("원하를 입력하세요(단위 원)>>");
		int wonhaw = scanner.nextInt();
		double dollor = (double)wonhaw/1100;
		System.out.println((wonhaw)+"원은 $"+dollor+"입니다.");
		scanner.close();
	}
	

}

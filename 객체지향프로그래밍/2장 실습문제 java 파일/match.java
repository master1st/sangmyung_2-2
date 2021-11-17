import java.util.Scanner;
public class match {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("1~99 사이의 정수를 입력하시오>>"
				+ "");
		int num = scanner.nextInt();
		int s = 0, r = 0,count =0;
		if(num > 10) {
		s = num/10;
		r = num%10;
		}
		else {
			s = num;
			r = num;
		}
		if(s%3==0) {
			count++;
		}
		if(r%3==0) {
			count++;
		}
		if(count == 1) {
			System.out.println("박수짝");
		}
		else if(count == 2) {
			System.out.println("박수짝짝");
		}
		else { System.out.println("오류거나 369게임 false");}
		scanner.close();
		}
}

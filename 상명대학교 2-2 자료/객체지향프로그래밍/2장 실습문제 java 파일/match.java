import java.util.Scanner;
public class match {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("1~99 ������ ������ �Է��Ͻÿ�>>"
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
			System.out.println("�ڼ�¦");
		}
		else if(count == 2) {
			System.out.println("�ڼ�¦¦");
		}
		else { System.out.println("�����ų� 369���� false");}
		scanner.close();
		}
}

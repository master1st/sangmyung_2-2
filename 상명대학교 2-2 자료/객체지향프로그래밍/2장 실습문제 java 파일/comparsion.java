import java.util.Scanner;
public class comparsion {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("2�ڸ��� ���� �Է�(10~99)>>");
		int num = scanner.nextInt();
		
		if(num%10 == num/10) {
			System.out.println("Yes! 10�� �ڸ��� 1�� �ڸ��� �����ϴ�.");
		}
		else {
			System.out.println("Failed.");
		}
		scanner.close();
	}
}

import java.util.Scanner;
public class won {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("���ϸ� �Է��ϼ���(���� ��)>>");
		int wonhaw = scanner.nextInt();
		double dollor = (double)wonhaw/1100;
		System.out.println((wonhaw)+"���� $"+dollor+"�Դϴ�.");
		scanner.close();
	}
	

}

import java.util.Scanner;

public class game{
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("���������� �����Դϴ�. ����, ����, �� �߿��� �Է��ϼ���");
		System.out.println("ö�� >> ");
		String c = scanner.nextLine();
		System.out.println("���� >> ");
		String y = scanner.nextLine();
		
		if(c.equals("����")) {
			if(y.equals("����")) {
				System.out.println("�����ϴ�.");
			}
			else if(y.equals("����")) {
				System.out.println("���� �̰���ϴ�.");
			}
			else {
				System.out.println("ö���� �̰���ϴ�.");
			}
		}
		if(c.equals("����")) {
			if(y.equals("����")) {
				System.out.println("ö���� �̰���ϴ�..");
			}
			else if(y.equals("����")) {
				System.out.println("�����ϴ�.");
			}
			else {
				System.out.println("���� �̰���ϴ�.");
			}
		}
		if(c.equals("��")) {
			if(y.equals("����")) {
				System.out.println("���� �̰���ϴ�.");
			}
			else if(y.equals("����")) {
				System.out.println("ö���� �̰���ϴ�.");
			}
			else {
				System.out.println("�����ϴ�.");
			}
		}
		
		
		
	}
}
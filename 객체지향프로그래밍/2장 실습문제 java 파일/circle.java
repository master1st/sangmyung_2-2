import java.util.Scanner;
public class circle {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("���� �߽ɰ� ������ �Է�>>");
		double cx = scanner.nextDouble();
		double cy = scanner.nextDouble();
		double r = scanner.nextDouble();
		System.out.println("�� �Է�>>");
		double x = scanner.nextDouble();
		double y = scanner.nextDouble();
		
		if(r > cx && r > cy) {
			if((r-cx <= x && r+cx >= x )&&( r-cy <= y && r+cy >= y)){
				System.out.println("�� ("+x+","+y+")�� ���ȿ� �ִ�.");
			}
			else {
				System.out.println("�� ("+x+","+y+")�� ���ۿ� �ִ�.");
			}
		}
		else {
			if((cx-r <= x && cx+r >= x )&&( cy-r <= y && cy+r >= y)){
				System.out.println("�� ("+x+","+y+")�� ���ȿ� �ִ�.");
			}
			else {
				System.out.println("�� ("+x+","+y+")�� ���ۿ� �ִ�.");
			}
		}
		scanner.close();
	}

}

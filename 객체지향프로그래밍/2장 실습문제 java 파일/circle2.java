import java.util.Scanner;
public class circle2 {
	double x,y,r;
	public static void main(String[] args) {
	Scanner scanner = new Scanner(System.in);
	circle2 c1 = new circle2();
	circle2 c2 = new circle2();
			
	System.out.println("ù���� ���� �߽ɰ� ������ �Է�>>");
	c1.x = scanner.nextDouble();
	c1.y = scanner.nextDouble();
	c1.r = scanner.nextDouble();
	System.out.println("�ι��� ���� �߽ɰ� ������ �Է�>>");
	c2.x = scanner.nextDouble();
	c2.y = scanner.nextDouble();
	c2.r = scanner.nextDouble();
	
	if(Math.sqrt(Math.pow(c1.x - c2.x,2)) > c1.r+c2.r ) {
		System.out.println("�� ���� ���� ��ġ�� �ʴ´�.");	
	}
	else {
		System.out.println("�� ���� ���� ��ģ��.");
	}
	}
}

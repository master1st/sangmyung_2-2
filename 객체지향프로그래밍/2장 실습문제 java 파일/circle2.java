import java.util.Scanner;
public class circle2 {
	double x,y,r;
	public static void main(String[] args) {
	Scanner scanner = new Scanner(System.in);
	circle2 c1 = new circle2();
	circle2 c2 = new circle2();
			
	System.out.println("첫번쨰 원의 중심과 반지름 입력>>");
	c1.x = scanner.nextDouble();
	c1.y = scanner.nextDouble();
	c1.r = scanner.nextDouble();
	System.out.println("두번쨰 원의 중심과 반지름 입력>>");
	c2.x = scanner.nextDouble();
	c2.y = scanner.nextDouble();
	c2.r = scanner.nextDouble();
	
	if(Math.sqrt(Math.pow(c1.x - c2.x,2)) > c1.r+c2.r ) {
		System.out.println("두 원은 서로 겹치지 않는다.");	
	}
	else {
		System.out.println("두 원은 서로 겹친다.");
	}
	}
}

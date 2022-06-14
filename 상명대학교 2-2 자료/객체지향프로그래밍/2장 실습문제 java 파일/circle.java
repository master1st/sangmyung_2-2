import java.util.Scanner;
public class circle {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("원의 중심과 반지름 입력>>");
		double cx = scanner.nextDouble();
		double cy = scanner.nextDouble();
		double r = scanner.nextDouble();
		System.out.println("점 입력>>");
		double x = scanner.nextDouble();
		double y = scanner.nextDouble();
		
		if(r > cx && r > cy) {
			if((r-cx <= x && r+cx >= x )&&( r-cy <= y && r+cy >= y)){
				System.out.println("점 ("+x+","+y+")는 원안에 있다.");
			}
			else {
				System.out.println("점 ("+x+","+y+")는 원밖에 있다.");
			}
		}
		else {
			if((cx-r <= x && cx+r >= x )&&( cy-r <= y && cy+r >= y)){
				System.out.println("점 ("+x+","+y+")는 원안에 있다.");
			}
			else {
				System.out.println("점 ("+x+","+y+")는 원밖에 있다.");
			}
		}
		scanner.close();
	}

}

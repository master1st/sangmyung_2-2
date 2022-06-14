import java.util.Scanner;
public class Rect {
	int x;
	int y;
	public static boolean inRect(int x, int y, int rectx1, int recty1,
			int rectx2, int recty2) {
		if(( x>= rectx1 && x <= rectx2 ) && (y>=recty1 && y<=recty2))
			return true;
		else return false;
	}
	
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		Rect r1 = new Rect();
		Rect r2 = new Rect();
		
		r1.x = scanner.nextInt();
		r1.y = scanner.nextInt();
		r2.x = scanner.nextInt();
		r2.y = scanner.nextInt();
		if(r1.inRect(r1.x,r1.y,100,100,200,200) || r2.inRect(r2.x,r2.y,100,100,200,200)) {
			System.out.println("이미 만들어진 직사각형과 충돌");
		}
		else {
			System.out.println("충돌 아님");
		}
		scanner.close();
	}
}

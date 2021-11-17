import java.util.Scanner;
public class edge {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("점 (x,y)의 좌표를 입력하시오>>");
		int x = scanner.nextInt();
		int y = scanner.nextInt();
		
		if(x<100 || x>200) {
			System.out.println("("+x+","+y+")는 사각형 밖에 있습니다.");
			return ;
		}
		else if(y<100 || y>200 ) {
			System.out.println("("+x+","+y+")는 사각형 밖에 있습니다.");
			return ;
		}
		else {
			System.out.println("("+x+","+y+")는 사각형 안에 있습니다.");
			return ;
		}
		
	}
	
}
//100보다 밖에있고 200보다 밖에있는 경우 제외 
//X,Y 둘다 
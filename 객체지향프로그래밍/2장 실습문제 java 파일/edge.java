import java.util.Scanner;
public class edge {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("�� (x,y)�� ��ǥ�� �Է��Ͻÿ�>>");
		int x = scanner.nextInt();
		int y = scanner.nextInt();
		
		if(x<100 || x>200) {
			System.out.println("("+x+","+y+")�� �簢�� �ۿ� �ֽ��ϴ�.");
			return ;
		}
		else if(y<100 || y>200 ) {
			System.out.println("("+x+","+y+")�� �簢�� �ۿ� �ֽ��ϴ�.");
			return ;
		}
		else {
			System.out.println("("+x+","+y+")�� �簢�� �ȿ� �ֽ��ϴ�.");
			return ;
		}
		
	}
	
}
//100���� �ۿ��ְ� 200���� �ۿ��ִ� ��� ���� 
//X,Y �Ѵ� 
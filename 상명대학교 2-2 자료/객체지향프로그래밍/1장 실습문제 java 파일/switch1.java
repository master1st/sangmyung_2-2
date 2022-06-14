import java.util.Scanner;
public class switch1 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		String game = scanner.next();
		
		switch(game) {
		case "가위" : 
			System.out.println(1);
			break;
		case "바위" :
			System.out.println(2);
			break;
		case "보" :
			System.out.println(3);
			break;
		default : System.out.println(0);
		}
	}
}

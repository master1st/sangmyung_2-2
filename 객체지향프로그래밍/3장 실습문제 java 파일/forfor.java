import java.util.Scanner;
public class forfor {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.print("������ �Է��Ͻÿ�>>");
		char num = scanner.next().charAt(0);
		for(char i='a'; i<=num; i++) {
			char abc = 'a';
			System.out.print("\n");
			for(char j=num; j>=i; j--) {
				System.out.print(abc);
				abc+=1;
			}
		}
	}
}


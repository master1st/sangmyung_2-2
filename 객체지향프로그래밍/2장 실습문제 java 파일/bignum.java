import java.util.Scanner;
public class bignum {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int [] num = new int[3];
		System.out.println("���� 3�� �Է�>>");
		for(int i=0; i<3; i++) {
			num[i] = scanner.nextInt();
		}
		int max = num[0];
		int min = num[0];
		for(int i=0; i<3; i++) {
			if(num[i] > max) {
			max = num[i];	
			}
			if(num[i] < min) {
			min = num[i];
			}
		}
		for(int i=0; i<3; i++) {
			if(num[i] > min && num[i] < max) {
				System.out.println("�߰� ���� "+num[i]);
			}
		}
		
	scanner.close();	
	}
}

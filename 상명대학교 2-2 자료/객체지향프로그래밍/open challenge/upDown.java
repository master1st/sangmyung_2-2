import java.util.Scanner;
public class upDown {
	int ans = 1;
	int quiz =0;
	public static void main(String[] args) {
		int count = 1;
		int ah = 0;
		int bh = 99;
		char regame = 'y';
		upDown a = new upDown();
		Scanner scanner = new Scanner(System.in);
		//�ϴ� ���� �Է��Ѱ� 0~99 55~99 �̷����̴�. 
		while(regame == 'y') {
			if(a.ans == a.quiz) {
				System.out.println("�¾ҽ��ϴ�.");
				System.out.print("�ٽ��Ͻðڽ��ϱ�(y/n>>");
				regame = scanner.next().charAt(0);
				count = 1;
				a.ans = 1;
				a.quiz = 0;
			}

		while(a.ans != a.quiz) {
			if(count == 1) {
				a.quiz = scanner.nextInt();
				System.out.println("���� �����Ͽ����ϴ�. ���߾� ������");
				ah = 0; bh = 99;
				System.out.println(ah+"-"+bh);
			}
			System.out.print(count++ + ">>" );
			a.ans = scanner.nextInt();
			if(a.quiz != a.ans && a.ans > a.quiz ) {
				System.out.println("�� ����");
				bh = a.ans;
				System.out.println(ah + "-" + bh);
			}
			else if(a.quiz != a.ans && a.ans < a.quiz) {
				System.out.println("�� ����");
				ah = a.ans;
				System.out.println(ah + "-" + bh);	
			}
		}
		}
		scanner.close();
	}
}

import java.util.Scanner;
public class money {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("�ݾ��� �Է��Ͻÿ�>>");
		int m = scanner.nextInt();
		int num = 0;
		if(m/50000 > 0) {
			System.out.println("��������" + m/50000+" ��");
			num = m%50000;
		}
		if(num/10000 > 0) {
			System.out.println("������" + num/10000+" ��");
			num = m%10000;
			
		}
		if(num/1000 > 0) {
			System.out.println("õ����" + num/1000+" ��");
			num = m%1000;
			
		}
		if(num/100 > 0) {
			System.out.println("���" + num/100+" ��");
			num = m%100;
			
		}
		if(num/50 > 0) {
			System.out.println("���ʿ�" + num/50+" ��");
			num = m%50;
			
		}
		if(num/10 > 0) {
			System.out.println("�ʿ�" + num/10+" ��");
			num = m%10;
			
		}
		if(num/1 > 0) {
			System.out.println("�Ͽ�" + num/1+" ��");
			num = m%1;
			
		}
		scanner.close();
	}
}

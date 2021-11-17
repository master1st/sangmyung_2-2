import java.util.Scanner;
public class money {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("금액을 입력하시오>>");
		int m = scanner.nextInt();
		int num = 0;
		if(m/50000 > 0) {
			System.out.println("오만원권" + m/50000+" 매");
			num = m%50000;
		}
		if(num/10000 > 0) {
			System.out.println("만원권" + num/10000+" 매");
			num = m%10000;
			
		}
		if(num/1000 > 0) {
			System.out.println("천원권" + num/1000+" 매");
			num = m%1000;
			
		}
		if(num/100 > 0) {
			System.out.println("백원" + num/100+" 매");
			num = m%100;
			
		}
		if(num/50 > 0) {
			System.out.println("오십원" + num/50+" 매");
			num = m%50;
			
		}
		if(num/10 > 0) {
			System.out.println("십원" + num/10+" 매");
			num = m%10;
			
		}
		if(num/1 > 0) {
			System.out.println("일원" + num/1+" 매");
			num = m%1;
			
		}
		scanner.close();
	}
}

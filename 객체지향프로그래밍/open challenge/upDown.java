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
		//일단 내가 입력한게 0~99 55~99 이런식이다. 
		while(regame == 'y') {
			if(a.ans == a.quiz) {
				System.out.println("맞았습니다.");
				System.out.print("다시하시겠습니까(y/n>>");
				regame = scanner.next().charAt(0);
				count = 1;
				a.ans = 1;
				a.quiz = 0;
			}

		while(a.ans != a.quiz) {
			if(count == 1) {
				a.quiz = scanner.nextInt();
				System.out.println("수를 결정하였습니다. 맞추어 보세요");
				ah = 0; bh = 99;
				System.out.println(ah+"-"+bh);
			}
			System.out.print(count++ + ">>" );
			a.ans = scanner.nextInt();
			if(a.quiz != a.ans && a.ans > a.quiz ) {
				System.out.println("더 낮게");
				bh = a.ans;
				System.out.println(ah + "-" + bh);
			}
			else if(a.quiz != a.ans && a.ans < a.quiz) {
				System.out.println("더 높게");
				ah = a.ans;
				System.out.println(ah + "-" + bh);	
			}
		}
		}
		scanner.close();
	}
}

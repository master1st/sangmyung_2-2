import java.util.Scanner;
public class ContinueExample {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("정수를 5개 입력하세요.");
		int sum=0;
		for(int i=0; i<5; i++) {
			int n = scanner.nextInt();
			if(n<=0)
				continue;
			else {
				sum += n;
			}
		}			//continue 없이 if 문만 붙여서 해도되지만 복잡한 로직일경우 continue
		System.out.print("양수의 합은 " + sum);
		scanner.close();
		}
	}


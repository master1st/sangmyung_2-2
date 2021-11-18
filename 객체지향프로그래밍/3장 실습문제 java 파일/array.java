import java.util.Scanner;
public class array {
	public static void main(String[] args) {
		int []arr = new int[10];
		Scanner scanner = new Scanner(System.in);
		for(int i=0; i<arr.length; i++) {
			arr[i] = scanner.nextInt();
			
			if(arr[i]%3 ==0)
				System.out.print("3의 배수는" + arr[i] + " ");
		}
		scanner.close();
	}
}

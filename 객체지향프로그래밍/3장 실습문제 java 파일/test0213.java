
public class test0213 {
	public static void main(String[] args) {
		char grade = 'D';
		int sum=0;
		
		switch (grade) {
		case 'A':
			sum += 100;
		case 'B':
			sum += 50;
		case 'C':
			sum += 30;
		case 'D':
			sum += 10;
		}
		System.out.print(sum);
	}
}

import java.util.Scanner;
public class Bookarray {
	String title;
	String author;
	public Bookarray(String title, String author) {
		this.title = title;
		this.author = author;
	}
	
	
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		Bookarray [] b = new Bookarray[2];
		for(int i=0; i<b.length; i++) {
			System.out.print("제목>>");
			String title = scanner.nextLine();
			System.out.print("저자>>");
			String author = scanner.nextLine();
			
			b[i] = new Bookarray(title,author);
		}
		for(int j=0; j<b.length; j++) {
			System.out.print("(" + b[j].title + "," + b[j].author + ")");
		}
	}
}

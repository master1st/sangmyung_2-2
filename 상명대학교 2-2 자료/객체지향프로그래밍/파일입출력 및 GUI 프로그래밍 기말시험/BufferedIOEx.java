package 기말시험준비;
import java.io.*;
import java.util.Scanner;
public class BufferedIOEx {
	public static void main(String[] args) {
		FileReader fin = null;
		int c;
		try {
			fin = new FileReader("C:\\Users\\82109\\Desktop\\경재 자료파일\\상명대학교 2학년 2학기 과목 정리\\객체지향프로그래밍\\temp\\zxtext.txt");
			BufferedOutputStream out = new BufferedOutputStream(System.out,5);
			while ((c = fin.read()) != -1) {
				out.write(c);
			}
			new Scanner(System.in).nextLine();
			out.flush();
			fin.close();
			out.close();
			
		} catch(IOException e){
			e.printStackTrace();
			
		}
	}
	
}

package �⸻�����غ�;
import java.io.*;
import java.util.Scanner;
public class BufferedIOEx {
	public static void main(String[] args) {
		FileReader fin = null;
		int c;
		try {
			fin = new FileReader("C:\\Users\\82109\\Desktop\\���� �ڷ�����\\�����б� 2�г� 2�б� ���� ����\\��ü�������α׷���\\temp\\zxtext.txt");
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

package �⸻�����غ�;
import java.io.*;

public class TextCopyEx {
	public static void main(String[] args) {
	char b[] = {'7','5','3','4','1','4'};
	
	try {
		File f = new File("C:\\Users\\82109\\Desktop\\���� �ڷ�����\\�����б� 2�г� 2�б� ���� ����\\��ü�������α׷���\\temp\\zxtext.txt");
		FileWriter fout = new FileWriter("C:\\\\Users\\\\82109\\\\Desktop\\\\���� �ڷ�����\\\\�����б� 2�г� 2�б� ���� ����\\\\��ü�������α׷���\\\\temp\\\\zxtext.txt");
		for(int i=0; i<b.length; i++)
			fout.write(b[i]);
		fout.close();
	}catch(IOException e){
		System.out.println("�������");
		
		return;
		
	}
	System.out.println("���强��");
}
}

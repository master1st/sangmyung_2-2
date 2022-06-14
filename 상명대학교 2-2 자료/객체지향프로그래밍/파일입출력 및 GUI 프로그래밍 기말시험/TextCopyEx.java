package 기말시험준비;
import java.io.*;

public class TextCopyEx {
	public static void main(String[] args) {
	char b[] = {'7','5','3','4','1','4'};
	
	try {
		File f = new File("C:\\Users\\82109\\Desktop\\경재 자료파일\\상명대학교 2학년 2학기 과목 정리\\객체지향프로그래밍\\temp\\zxtext.txt");
		FileWriter fout = new FileWriter("C:\\\\Users\\\\82109\\\\Desktop\\\\경재 자료파일\\\\상명대학교 2학년 2학기 과목 정리\\\\객체지향프로그래밍\\\\temp\\\\zxtext.txt");
		for(int i=0; i<b.length; i++)
			fout.write(b[i]);
		fout.close();
	}catch(IOException e){
		System.out.println("저장실패");
		
		return;
		
	}
	System.out.println("저장성공");
}
}

import java.util.Scanner;
public class RollingDice {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int gameEnd =0;
		int numberOfGame = 0;
		int same=0;
		System.out.println("���� �������� ���� �Է��Ͻÿ�.");
		int peopleNum = scanner.nextInt();
		if(peopleNum < 2 && peopleNum > 6) {
			System.out.println("2���� 6������ ������ ���� �Է����ּ���");
		}
		int resultSum[] = new int[peopleNum];
		Player peoplearr[] = new Player[peopleNum];
		System.out.println("���� �������� �̸��� ���ʷ� �Է��Ͻÿ�.");
		
		for(int i=0; i<peoplearr.length; i++) {
			System.out.println(i+1+"��° ������ �̸� : ");
			peoplearr[i] = new Player(scanner.next());
		}
		
		System.out.println("***   ���ݺ��� ������ �����մϴ�.   ***\n");
		
		while(true) { 
			int win = 0;
		System.out.println(" Game #"+ ++numberOfGame);
		
		for(int i=0; i<peoplearr.length; i++) {
			System.out.println(peoplearr[i].setName()+" �����Դϴ�. �ֻ����� �������� 1�� �Է��ϼ���.");
			gameEnd = scanner.nextInt();
			if(gameEnd == 0) {
				break;
			}
			 resultSum[i] = peoplearr[i].rollResult();
			 peoplearr[i].faceValueSum(resultSum[i]);
			 win = resultSum[0];
			 if(i>0) {
				 if(win == resultSum[i]) {
					 System.out.println("�����ϴ�.");
				 		same=1;
				 		peoplearr[i].getSameWin();
				 }
			 if(win < resultSum[i]) {
				 win = resultSum[i];
				 }
			
			 }
		}
		if(gameEnd == 0) break;
		for(int i=0; i<peoplearr.length; i++) {
			if(same!=1)
			if(peoplearr[i].returnSum() == win) {
				System.out.println("�̹� ������ ���ڴ� "+peoplearr[i].setName()+" �Դϴ�.");
			peoplearr[i].win(); 
		}
		}
		System.out.println("������ ����Ͻðڽ��ϱ�?(y/n): ");
		String regame = scanner.next();
		if(regame.equals("n")) {
			break;
		}
		same =0;
	
		}
		System.out.println("��ü "+numberOfGame+" ���� ��");
		for(int i=0; i<peoplearr.length; i++) {
			System.out.println(peoplearr[i].setName()+" "+peoplearr[i].setresult()+"�� " +peoplearr[i].setSameWin() +"���"); 
		}
		System.out.print("�Ͽ����ϴ�.");


}
}
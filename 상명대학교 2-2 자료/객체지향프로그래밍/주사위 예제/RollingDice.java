import java.util.Scanner;
public class RollingDice {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int gameEnd =0;
		int numberOfGame = 0;
		int same=0;
		System.out.println("게임 참가자의 수를 입력하시오.");
		int peopleNum = scanner.nextInt();
		if(peopleNum < 2 && peopleNum > 6) {
			System.out.println("2에서 6사이의 참가자 수를 입력해주세요");
		}
		int resultSum[] = new int[peopleNum];
		Player peoplearr[] = new Player[peopleNum];
		System.out.println("게임 참가자의 이름을 차례로 입력하시오.");
		
		for(int i=0; i<peoplearr.length; i++) {
			System.out.println(i+1+"번째 참가자 이름 : ");
			peoplearr[i] = new Player(scanner.next());
		}
		
		System.out.println("***   지금부터 게임을 시작합니다.   ***\n");
		
		while(true) { 
			int win = 0;
		System.out.println(" Game #"+ ++numberOfGame);
		
		for(int i=0; i<peoplearr.length; i++) {
			System.out.println(peoplearr[i].setName()+" 차례입니다. 주사위를 던지려면 1을 입력하세요.");
			gameEnd = scanner.nextInt();
			if(gameEnd == 0) {
				break;
			}
			 resultSum[i] = peoplearr[i].rollResult();
			 peoplearr[i].faceValueSum(resultSum[i]);
			 win = resultSum[0];
			 if(i>0) {
				 if(win == resultSum[i]) {
					 System.out.println("비겼습니다.");
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
				System.out.println("이번 게임의 승자는 "+peoplearr[i].setName()+" 입니다.");
			peoplearr[i].win(); 
		}
		}
		System.out.println("게임을 계속하시겠습니까?(y/n): ");
		String regame = scanner.next();
		if(regame.equals("n")) {
			break;
		}
		same =0;
	
		}
		System.out.println("전체 "+numberOfGame+" 게임 중");
		for(int i=0; i<peoplearr.length; i++) {
			System.out.println(peoplearr[i].setName()+" "+peoplearr[i].setresult()+"승 " +peoplearr[i].setSameWin() +"비김"); 
		}
		System.out.print("하였습니다.");


}
}
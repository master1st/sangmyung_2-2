
public class twodim {
	public static void main(String[] args) {
		int i[][];
		i = new int[4][];
//가장 중요한 것은 먼저 행을 정의해줘서 층을 만든다. 그다음 각 층에 해당하는 열을 만들어줘서
//아파트 0층에는 누가 사는지 이런식으로 생각하면 저장하기 편하다.
		i[0] = new int[1];
		i[1] = new int[2];
		i[2] = new int[3];
		i[3] = new int[4]; 
		
//위의 것은 비정방형 배열로 층이 불규칙적으로 열과 행이 규칙적이지않다.
//층은 4층이나 거주민이 1명 2명 3명 4명 층마다 다르다.
	}
}

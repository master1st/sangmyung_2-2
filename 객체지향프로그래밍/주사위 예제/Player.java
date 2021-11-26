
	public class Player extends Die {
		private String name;
		private int result;
		private int faceValueSum;
		private int same;
		public void win() {
			this.result++;
		}
		public Player(String name) {
			this.name = name;
		}
		public void getSameWin() {
			this.same++;
		}
		public int setSameWin() {
			return same;
		}
		public String setName() {
			return this.name;
		}
		public int setresult() {
			return this.result;
		}
		public int rollResult()
		{
			int d1 = this.roll();
			int d2 = this.roll();
			int sum = d1+d2;
			System.out.println(this.name + ": 첫번쨰 주사위: "+d1+"  두번쨰 주사위: "+d2+"  주사위 합: "+sum);
			System.out.print("\n");
			return sum;
		}
		public void faceValueSum(int sum) {
			this.faceValueSum = sum;
		}
		public int returnSum() {
			return this.faceValueSum;
		}
		
		
	}

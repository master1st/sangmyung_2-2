
public class twoarr {
	public static void main(String[] args) {
		double arr[][] ={{3.3, 3.4},
						 {3.5,3.6},
						 {3.7,4.0},
						 {4.1,4.2} };
		double sum = 0;
		int count =0;
		for(int i=0; i<arr.length; i++) {
			for(int j=0; j<arr[i].length; j++) {
				sum += arr[i][j];
				count++;
			}
		}
		int n = arr.length;
		int m = arr[0].length;	//이렇게 할 수도 있겠네. 어쨋든 
		System.out.println("4년간 전체 평점 평균 : "+sum/count);
	}
}						

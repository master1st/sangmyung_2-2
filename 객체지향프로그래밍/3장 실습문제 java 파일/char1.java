
public class char1 {
	public static void main(String[] args) {
		boolean[] arr = {true,false,false,true};
		int count=1;
		int arrdim[][] = new int[4][3];
		for(int j=0; j<arrdim.length; j++) {
			System.out.print("\n");
		for(int i=0; i<arrdim[0].length; i++) {
			arrdim[j][i] = count++;
		System.out.print("    "+arrdim[j][i]);
		}
	}
}
}
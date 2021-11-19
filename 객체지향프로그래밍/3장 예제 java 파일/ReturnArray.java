
public class ReturnArray {
	 static int[] makeArray() {
		int arr[] = new int[4];
		for(int i=0; i<arr.length; i++) {
			arr[i] = i;
		}
		return arr;
	}
	public static void main(String[] args) {
		int arr[];
		arr = makeArray();
		for(int i=0; i<arr.length; i++) {
			System.out.print(arr[i] + " ");
		}
		
	}
}

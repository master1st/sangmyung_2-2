//배열 갯수할당에 변수를 사용할 수는 없다. 동적할당의 규칙때문에.
public class ReturnArray {
	public static int[] makeArray() {
		int [] makeArray = new int[4];
		for(int i=0; i<makeArray.length; i++) {
			makeArray[i] = i;
		}
		return makeArray;
		
	}
		public static void main(String[] args) {
			int [] arr = ReturnArray.makeArray();
			
			for(int i=0; i<arr.length; i++) {
				System.out.print(arr[i]);
			}
		}
	}

//이 예제는 배열 치환에 의한 배열 생성 메소드 이다.
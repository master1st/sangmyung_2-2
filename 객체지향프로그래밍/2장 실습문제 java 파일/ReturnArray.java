//�迭 �����Ҵ翡 ������ ����� ���� ����. �����Ҵ��� ��Ģ������.
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

//�� ������ �迭 ġȯ�� ���� �迭 ���� �޼ҵ� �̴�.

public class forEach {
	public static void main(String[] args) {
		int[] num = {1,2,3,4,5};
		int sum =0;
		for (int k : num)
			sum += k;
		System.out.println("���� ���� : " + sum);
		
		String[] fruits = {"���","��","�ٳ���","ü��","����"};
		for(String s : fruits) {
			System.out.println(s);
		}
//		1. Ŭ����ó�� ���̰� �ϴ� ���
//		2. ���� �����ִ� ����鳢�� ��� ������� ��ǥ�� �� �ִ� �̸����� Ÿ���� �����ϴ� ��
//		3. Enum Ŭ���� ���� ������� �� Ŭ������ ���� 
		enum Week {��,ȭ,��,��,��,��,��}
		for(Week day : Week.values())
			System.out.println(day+"����");
		
		enum people {��,��,��,��}
		for(people p : people.values())
			System.out.println(p+"��");
	}
}

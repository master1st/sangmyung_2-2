class Weapon
{
	protected int fire() 
	{
		return 1;
	}
}
class Cannon extends Weapon
{
	protected int fire() 
	{
		return 10;
	}
}
public class Overriding {
	public static void main(String[] args) {
//		Weapon w = new Weapon();
//		System.out.println(w.fire());
//		
//		Cannon c = new Cannon();
//		System.out.println(c.fire());
		Weapon w = new Weapon();
		System.out.println(w.fire());
		w = new Cannon();
		System.out.println(w.fire());	
		//������ �ϴ� ������ �������ε� �����̴�.
		//�θ�� ���� ���ǵ� �޼ҵ带 �޼ҵ� �������̵��� ����
		//�ڽĿ��� �״�� ��ӹް��ϴ� ��� �޼ҵ� �������̵��� Ư¡��
		//�������ε��� �ִ�. �θ���� ���ٰ� �ٽ� �ڽĿ��� �´�.
		//�׷� �޼ҵ� �������̵��� ��������� ? 
		
		//�ٵ� �ٽ� ã�ƺ��ϱ� �׳� �ڽ� �ڽ��� ���۷��� ������ 
		//�ν��Ͻ�ȭ ���ѵ� �������ε��� �ȴ�. �ᱹ ������ 
		// �� �̷��� Ǯ �ʿ�� ���ٴ°� 
	}
}
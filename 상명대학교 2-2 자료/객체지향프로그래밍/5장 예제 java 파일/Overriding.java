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
		//이짓을 하는 이유는 동적바인딩 때문이다.
		//부모로 부터 정의된 메소드를 메소드 오버라이딩을 통해
		//자식에게 그대로 상속받게하는 대신 메소드 오버라이딩의 특징은
		//동적바인딩에 있다. 부모것을 갔다가 다시 자식에게 온다.
		//그럼 메소드 오버라이딩의 사용조건은 ? 
		
		//근데 다시 찾아보니까 그냥 자식 자신의 레퍼런스 변수로 
		//인스턴스화 시켜도 동적바인딩이 된다. 결국 문제를 
		// 꼭 이렇게 풀 필요는 없다는것 
	}
}
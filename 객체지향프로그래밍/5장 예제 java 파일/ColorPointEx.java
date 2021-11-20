class Point { 
	private int x,y;
	public void Set(int x, int y) {
		this.x = x;
		this.y = y;
	}
	public void ShowPoint() {
		System.out.println("("+ x +"," + y + ")");
	
	}
}

class ColorPoint extends Point {
	String color;
	
	public void Set(String color) {
		this.color = color;
	}
	public void ShowColorPoint() {
		System.out.print(color);
		ShowPoint();
	}
}

public class ColorPointEx {
	public static void main(String[] args) {
		Point p = new Point();
		p.Set(1, 2);
		p.ShowPoint();
		
		ColorPoint cp = new ColorPoint();
		cp.Set(3,4);
		cp.Set("red");
		cp.ShowColorPoint();
		
		}
}


//(1,2) red(3,4)
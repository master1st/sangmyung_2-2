package 기말시험준비;
import java.util.Vector;

class zoint {
	private int x,y;
	public zoint(int x, int y) {
		this.x = x;
		this.y = y;
	}
	public String toString() {
		return "(" + x + "," + y + ")";
	}
}
public class PointVectorEx {
	public static void main(String[] args) {
		Vector<zoint> v = new Vector<zoint>();
		
		v.add(new zoint(2,3));
		v.add(new zoint(-5,20));
		v.add(new zoint(30,-8));
		
		v.remove(0);
		for(int i =0; i<v.size(); i++) {
			zoint p = v.get(i);
			System.out.println(p);
		}
	}
}

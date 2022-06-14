package 기말고사;
import java.util.*;
public class c2 {
	public static void main(String[] args) {
		Vector<Integer> v = new Vector<Integer>();
		for(int i =0; i<10; i++) v.add(i);
		Iterator<Integer> it = v.iterator();
		while(it.hasNext()) {
			System.out.print(it.next()+ " ");
		}
	}

}


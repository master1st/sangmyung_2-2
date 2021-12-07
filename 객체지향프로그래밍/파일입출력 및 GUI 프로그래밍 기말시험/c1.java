package 기말고사;
import java.util.*;
public class c1 {
	public static void main(String[] args) {
		ArrayList<String> a = new ArrayList<String>(10);
		a.add("java");
		a.add(0,"C++");
		
		a.size();
		a.remove(a.size()-1);
		
		for(int i =0; i<a.size(); i++) {
			System.out.print(a.get(i)+ " ");
		}
	}
}

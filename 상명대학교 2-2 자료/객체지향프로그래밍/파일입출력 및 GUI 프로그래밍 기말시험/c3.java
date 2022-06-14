package 기말고사;
import java.util.*;
public class c3 {
	public static int func(HashMap<String, Integer> h) {
		return h.size();
	}
	public static void main(String[] args) {
		HashMap<String, Integer> h = new HashMap<String, Integer>();
		h.put("a",10);
		h.put("b", 20);
		System.out.println(func(h));
	}
}

package �⸻���;
import java.util.StringTokenizer;
public class a {
	public static void main(String[] args) {
		StringTokenizer st = new StringTokenizer("a=3,b=5,c=6", "=,");
		while(st.hasMoreTokens())
			System.out.println(st.nextToken());
	}

}

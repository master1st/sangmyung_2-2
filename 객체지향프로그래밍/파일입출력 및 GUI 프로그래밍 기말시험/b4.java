package �⸻���;
import java.util.Calendar;
public class b4 {
	public static void main(String[] args) {
		Calendar date = Calendar.getInstance();
		date.clear();
		date.set(Calendar.YEAR, 2021);
		date.set(Calendar.MONTH, 12);
		date.set(Calendar.DAY_OF_MONTH, 07);
		System.out.println("��� ��¥�� "+ date.get(Calendar.YEAR)+"��"+date.get(Calendar.MONTH)+"��"+date.get(Calendar.DAY_OF_MONTH)+"��");
	}
}

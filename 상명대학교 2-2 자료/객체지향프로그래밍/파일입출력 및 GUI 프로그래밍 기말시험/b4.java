package 기말고사;
import java.util.Calendar;
public class b4 {
	public static void main(String[] args) {
		Calendar date = Calendar.getInstance();
		date.clear();
		date.set(Calendar.YEAR, 2021);
		date.set(Calendar.MONTH, 12);
		date.set(Calendar.DAY_OF_MONTH, 07);
		System.out.println("약속 날짜는 "+ date.get(Calendar.YEAR)+"년"+date.get(Calendar.MONTH)+"월"+date.get(Calendar.DAY_OF_MONTH)+"일");
	}
}

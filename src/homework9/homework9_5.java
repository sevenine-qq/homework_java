package homework9;
import java.util.GregorianCalendar;
public class homework9_5 {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		GregorianCalendar calendar=new GregorianCalendar();
		showtime(calendar);
		long a=1234567898765L;
		calendar.setTimeInMillis(a);
		System.out.println();
		showtime(calendar);
	}
	public static void showtime(GregorianCalendar calendar) {
		System.out.print(calendar.get(GregorianCalendar.YEAR)+":");
		
		System.out.print(calendar.get(GregorianCalendar.MONTH)+":");
		
		System.out.print(calendar.get(GregorianCalendar.DAY_OF_MONTH));
	}


}

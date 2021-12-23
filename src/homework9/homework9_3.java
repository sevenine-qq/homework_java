package homework9;
import java.util.Date;
public class homework9_3 {
		// TODO Auto-generated method stub
		Date date=new Date();
		
		public void setDate(int n) {
			date.setTime(n);
		}
		
		public void getDate() {
			System.out.println(date.toString());
		}

		public static void main(String[] args) {
			// TODO Auto-generated method stub
			Date date=new Date();
			for(long i=10000;i<1e12;i=i*10) {
				date.setTime(i);
				System.out.println(date.toString());
				
			}
		}

	}

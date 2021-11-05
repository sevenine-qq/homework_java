package homework_second;
import java.util.Scanner;
public class homework_3_22 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        Scanner scan=new Scanner(System.in);
        System.out.print("Enter a point with two coordinates:");
        float x=scan.nextFloat();
        float y=scan.nextFloat();
        scan.close();
        double r=Math.sqrt(x*x+y*y);
        if (r<10)
        {
        	System.out.format("Point (%.1f,%.1f) is in the circle",x,y);
        	
        }
        else
        {
        	System.out.format("Point (%.1f,%.1f) is not in the circle",x,y);
        }
	}

}

package homework_second;
import java.util.Scanner;
public class homework_3_23 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        Scanner scan=new Scanner(System.in);
        System.out.print("Enter a point with two coordinates:");
        float x=scan.nextFloat();
        float y=scan.nextFloat();
        scan.close();
        if (x>=-5 && x<=5 && y>=-2.5 && y<=2.5) {
        	System.out.format("Point (%.1f , %.1f) is in the rectangle",x,y);
        }
        else {
        	System.out.format("Point (%.1f , %.1f) is not in the rectangle",x,y);
        }
	}

}

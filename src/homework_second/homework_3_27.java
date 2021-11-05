package homework_second;
import java.util.Scanner;
public class homework_3_27 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        Scanner scan=new Scanner(System.in);
        System.out.print("Enter a point's x- and y-coordinates:");
        float x=scan.nextFloat();
        float y=scan.nextFloat();
        scan.close();
        if (2*(y-100)<=-x) {
        	System.out.println("The point is in the triangle");
        }
        else {
        	System.out.println("The point is not in the triangle");
        }
	}

}

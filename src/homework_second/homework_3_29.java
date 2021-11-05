package homework_second;
import java.util.Scanner;
public class homework_3_29 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        Scanner scan=new Scanner(System.in);
        System.out.print("Enter circle1's center x-, y-coordinates,and radius:");
        float x1=scan.nextFloat();
        float y1=scan.nextFloat();
        float r1=scan.nextFloat();
        System.out.print("Enter circle2's center x-, y-coordinates,and radius:");
        float x2=scan.nextFloat();
        float y2=scan.nextFloat();
        float r2=scan.nextFloat();
        scan.close();
        if (Math.sqrt((x1-x2)*(x1-x2)+(y1-y2)*(y1-y2))<=Math.abs(r1-r2)) {
        	System.out.println("circle2 is inside circle1");
        }
        else if(Math.sqrt((x1-x2)*(x1-x2)+(y1-y2)*(y1-y2))<=r1+r2) {
        	System.out.println("ciecle2 overlaps circle1");
        }
        else {
        	System.out.println("circle2 does not overlap circle1");
        }
	}

}

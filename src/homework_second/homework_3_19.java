package homework_second;
import java.util.Scanner;

public class homework_3_19 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan=new Scanner(System.in);
        float a=scan.nextFloat();
        float b=scan.nextFloat();
        float c=scan.nextFloat();
        scan.close();
        if (a+b>c && a+c>b && b+c>a)
        {
        	System.out.println(a+b+c);
        }
        else
        {
        	System.out.println("输入值不合法");
        }
	}

}

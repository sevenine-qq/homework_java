package homework_second;
import java.util.Scanner;
public class homework_5_45 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        Scanner scan=new Scanner(System.in);
        int i=0;
        float[] number=new float[15];
        System.out.print("Enter 10 numbers:");
        float total=0,total2=0;
        for (i=0;i<10;++i) {
        	number[i]=scan.nextFloat();
        	total+=number[i];
        	total2+=number[i]*number[i];
        }
        System.out.format("The mean is %.2f",total/10);
        System.out.println();
        //System.out.println("The mean is "+total/10);
        double subtraction=total*total/10;
        double merchant=0;
        merchant=Math.sqrt((total2-subtraction)/9);
        System.out.format("The standard deviation is %.5f",merchant);
        //System.out.println("The standard deviation is "+merchant);
	}

}

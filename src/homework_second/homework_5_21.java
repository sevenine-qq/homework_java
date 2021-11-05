package homework_second;
import java.util.Scanner;
public class homework_5_21 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        Scanner scan=new Scanner(System.in);
        System.out.print("Loan Amount:");
        float amount=scan.nextFloat();
        System.out.print("Number of Years:");
        float NumberOfYears=scan.nextFloat();
        scan.close();
        System.out.print("Interest Rate    ");
        System.out.print("Monthly Payment    ");
        System.out.println("Total Payment    ");
        float i;
        double MonthlyPayment,TotalPayment;
        for(i=5;i<=8;i+=0.125) {
        	System.out.format("%.3f            ",i);
        	MonthlyPayment=amount*(i/1200)*((Math.pow(1+i/1200, NumberOfYears*12))/(Math.pow(1+i/1200, NumberOfYears*12)-1));
        	System.out.format("%.2f             ",MonthlyPayment);
        	TotalPayment=MonthlyPayment * NumberOfYears * 12;
        	System.out.format("%.2f        ",TotalPayment);
        	System.out.println();
        }
	}

}

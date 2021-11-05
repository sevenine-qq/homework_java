package homework_second;
import java.util.Scanner;
public class homework_5_22 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        Scanner scan=new Scanner(System.in);
        float LoanAmount,NumberOfYears,AnnualInterestRate;
        double MonthlyPayment,TotalPayment;
        int i;
        System.out.print("Loan Amount:");
        LoanAmount=scan.nextFloat();
        System.out.print("Number of Years:");
        NumberOfYears=scan.nextFloat();
        System.out.print("Annual Interest Rate:");
        AnnualInterestRate=scan.nextFloat();
        scan.close();
        MonthlyPayment=LoanAmount*(AnnualInterestRate/1200)*((Math.pow(1+AnnualInterestRate/1200, NumberOfYears*12))/(Math.pow(1+AnnualInterestRate/1200, NumberOfYears*12)-1));
        System.out.format("%.2f",MonthlyPayment);
        System.out.println();
        TotalPayment=MonthlyPayment * NumberOfYears * 12;
        System.out.format("%.2f",TotalPayment);
        System.out.println();
        System.out.print("Payment#     Interest     Principal     Balance");
        System.out.println();
        double Principle,Monthlyinterest,Balance;
        Balance=LoanAmount;
        for (i=1;i<=NumberOfYears*12;++i) {
        	System.out.printf("%-10d",i);
        	Monthlyinterest=AnnualInterestRate/12 * Balance;
        	Principle=MonthlyPayment-Monthlyinterest;
        	Balance-=Principle;
        	System.out.printf("%11.2f",Monthlyinterest);
        	
        	System.out.printf("%14.2f",Principle);
        	//System.out.print("         ");
        	System.out.printf("%13.2f",Balance);
        	System.out.println();
        	
        }
	}

}

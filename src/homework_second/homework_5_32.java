package homework_second;
import java.util.Scanner;
public class homework_5_32 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        int single=(int)(Math.random()*10);
        int ten=(int)(Math.random()*10);
        while (ten==single) {
        	ten=(int)(Math.random()*10);
        }
        int lottery;
        lottery=ten*10+single;
        System.out.print("Enter your lottery pick (two digits):");
        Scanner scan=new Scanner(System.in);
        int guess=scan.nextInt();
        scan.close();
        int guesssingle=guess%10;
        int guessten=guess/10;
        System.out.println("The lottery number is "+ lottery);
        if (guess==lottery) {
        	System.out.println("Exact match:you win $10,000");
        }
        else if(guessten==single && guesssingle==ten) {
        	System.out.println("Match all digits:you win $3,000");
        }
        else if(guessten==ten||guessten==single||guesssingle==single||guesssingle==ten) {
        	System.out.println("Match one digit:you win $1,000");
        }
        else {
        	System.out.println("Sorry,no match");
        }
	}

}

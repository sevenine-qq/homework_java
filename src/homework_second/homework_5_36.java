package homework_second;
import java.util.Scanner;
public class homework_5_36 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
				// TODO Auto-generated method stub
		        Scanner scan=new Scanner(System.in);
		        System.out.print("Enter the first 9 digits of an ISBN as integer:");
		        int num=scan.nextInt();
		        scan.close();
		        int arry[]=new int[10];
		        int n=9;
		        while (n!=0){
		            arry[n]=num%10;
		            num=num/10;
		            n-=1;
		        }
		        int d=(arry[1]+arry[2]*2+arry[3]*3+arry[4]*4+arry[5]*5+arry[6]*6+arry[7]*7+arry[8]*8+arry[9]*9)%11;
		        if (d==10) {
		        	System.out.println("The ISBN-10 number is "+arry[1]+arry[2]+arry[3]+arry[4]+arry[5]+arry[6]+arry[7]+arry[8]+arry[9]+'X');
		        }
		        else{
		        	System.out.println("The ISBN-10 number is "+arry[1]+arry[2]+arry[3]+arry[4]+arry[5]+arry[6]+arry[7]+arry[8]+arry[9]+d);
		        }
		        
	}

}

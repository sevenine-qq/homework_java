package homework_second;
import java.util.Scanner;
public class homework_5_38 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 Scanner scan=new Scanner(System.in);
			int integer,divisor,n,i;
			int[] remainder=new int[99];
			integer=scan.nextInt();
			scan.close();
			divisor=integer;
			n=0;
			/*for(i=0;i<99;++i) {
				remainder[i]=5;
			}*/
	        while(divisor>7) {
	        	remainder[n]=divisor%8;
	        	divisor=divisor/8;
	        	n+=1;
	        }
	        if(divisor!=0) {
	        	System.out.print(divisor);
	        }
	        for(i=n-1;i>=0;--i) {
	        	System.out.print(remainder[i]);
	        }
		}

	}


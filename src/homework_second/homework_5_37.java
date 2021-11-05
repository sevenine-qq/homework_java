package homework_second;
import java.util.Scanner;
public class homework_5_37 {

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
        while(divisor!=0 && divisor!=1) {
        	remainder[n]=divisor%2;
        	divisor=divisor/2;
        	n+=1;
        }
        if(divisor==1) {
        	System.out.print(1);
        }
        for(i=n-1;i>=0;--i) {
        	System.out.print(remainder[i]);
        }
	}

}

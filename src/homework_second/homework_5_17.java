package homework_second;
import java.util.Scanner;
public class homework_5_17 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        Scanner scan=new Scanner(System.in);
        System.out.print("Enter the number of lines:");
        int line=scan.nextInt();
        scan.close();
        int i,j,k,n;
        for (i=0;i<line;++i) {
        	if (i<9) {
        		if (line<10) {
        		    for (j=0;j<line-i;++j) {
        		        System.out.print("  ");
        		    }
        		}
        		else {
        			for (j=0;j<i-8;++j) {
        		        System.out.print("  ");
        		    }
        			for(j=0;j<line-9;++j) {
        				System.out.print("   ");
        			}
        			for(k=0;k<9-i;++k) {
        			    System.out.print(" ");
        			}
        			for(k=0;k<8-i;++k) {
        				System.out.print(" ");
        			}
        		}
        	}
        	else {
        		for (j=0;j<line-i-1;++j) {
        		    System.out.print("  ");
        		}
        		
        		for (j=0;j<line-i;++j) {
        		    System.out.print(" ");
        		}
        	}
        	for (k=i;k>=0;--k) {
        		 System.out.format("%d ",k+1);
        	}
        	
        	n=i;
        	for (k=0;k<n;++k) {
        		if (k+2<10) {
        		    System.out.format("%d ",k+2);
        		}
        		else if(k+2==10) {
        			System.out.format("%d ",k+2);
        		}
        		else {
        			System.out.format("%d ",k+2);
        		}
        	}
        	System.out.println();
	}
	}
}

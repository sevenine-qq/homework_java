package homework_second;

public class homework_5_19 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        int n,i,j,k;
        n=8;
        for (i=0;i<n;++i) {
        	
        	for (j=0;j<n-i-1;++j) {
        		System.out.print("    ");
        	}
        	for (k=0;k<i+1;++k) {
        		if (Math.pow(2, k)<10){
        		    System.out.format("   %.0f",Math.pow(2, k));
        		}
        		else if((Math.pow(2,k)>=10) & (Math.pow(2, k)<100)) {
        			System.out.format("  %.0f",Math.pow(2, k));
        		}
        		else if(Math.pow(2,k)>=100) {
        			System.out.format(" %.0f",Math.pow(2, k));
        		}
        	}
        	for(k=1;k<i+1;++k) {
        		if (Math.pow(2, i-k)<10){
        		    System.out.format("   %.0f",Math.pow(2, i-k));
        		}
        		else if((Math.pow(2,i-k)>=10) & (Math.pow(2, i-k)<100)) {
        			System.out.format("  %.0f",Math.pow(2, i-k));
        		}
        		else if(Math.pow(2,i-k)>=100) {
        			System.out.format(" %.0f",Math.pow(2, i-k));
        		}
        	}
        	System.out.println();
        }
	}

}

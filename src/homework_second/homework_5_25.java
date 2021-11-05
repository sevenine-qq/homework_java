package homework_second;

public class homework_5_25 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        int i,j;
        double PI;
        PI=0;
        for (i=10000;i<=100000;i+=10000) {
        	for (j=1;j<=i;++j) {
        		PI=PI+Math.pow(-1,j+1)/(2*j-1);
        		
        	}
        	PI=4 * PI;
        	System.out.printf("%.2f\n",PI);
        }
	}

}

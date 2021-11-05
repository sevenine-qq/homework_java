package homework_second;

public class homework_5_26 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        int i,j,k;
        double e,num,n;
        for (i=10000;i<100000;i+=10000) {
        	e=0;
        	for(j=1;j<=i;++j) {
        		num=1;
        		for(k=1;k<=j;++k) {
        			num=num*k;
        		}
        		n=1/num;
        		e+=n;
        	}
        	System.out.println(e);
        }
	}

}

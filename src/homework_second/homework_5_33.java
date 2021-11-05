package homework_second;

public class homework_5_33 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        int i,divisor,j;
        divisor=0;
        for(i=1;i<=10000;++i) {
        	for(j=1;j<i;++j) {
        		if(i%j==0) {
        			divisor+=j;
        		}
        	}
        	if (divisor==i) {
        		System.out.println(i);
        	}
        	divisor=0;
        }
	}

}

package homework_second;

public class homework_5_27 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        int i,num;
        num=0;
        for (i=101;i<2101;++i) {
        	if ((i%4==0 & i%100!=0) || (i%1000==0 & i%400==0)) {
        		System.out.print(i);
        		num+=1;
        	}
        	if (num%10!=0) {
        		System.out.print(" ");
        	}
        	else {
        		System.out.println();
        	}
        	
        }
	}

}

package homework_second;
import java.util.Random;
import java.util.Scanner;
public class homwork3_15 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        Scanner scan=new Scanner(System.in);
        System.out.print("输入一个三位整数：");
        int NumFromUser=scan.nextInt();
        scan.close();
        Random random=new Random();
        int NumWeProduced=random.nextInt(100);
        NumWeProduced=NumWeProduced+100;
        //NumWeProduced=131;
        //System.out.println(NumWeProduced);
        int arry1[] = new int[5];
        int arry2[]=new int[5];
        int i,j;
        i=j=0;
        int NumFromUser1,NumWeProduced1;
        NumFromUser1=NumFromUser;
        NumWeProduced1=NumWeProduced;
        for (i=0;i<3;++i) {
        	arry1[i]=NumFromUser%10;
        	arry2[i]=NumWeProduced%10;
        	NumFromUser=NumFromUser/10;
        	NumWeProduced=NumWeProduced/10;
        }
        int num=0;
        int f[]=new int[5];
        
        for (i=0;i<3;++i)
        {
        	f[i]=1;
        	
        	
        }
        if (NumFromUser1==NumWeProduced1)
        {
        	System.out.println("10 000 dollars");
        }
        else
        {
            for (i=0;i<3;++i)
            {
        	    for (j=0;j<3;++j)
        	    {
        	    	if (arry1[i]==arry2[j] && f[j]==1)
        	    	{
        			      f[j]=0;
        			     
        			      num+=1;
        			      break;
        		    }
        	    }
            }
            switch(num) {
            case 0:
            	System.out.println("no dollars");
            	break;
            case 1:
            	System.out.println("1000 dollars");
            	break;
            case 2:
            	System.out.println("1000 dollars");
            	break;
            case 3:
            	System.out.println("3000 dollars");
            	break;
            }
            	
        }
        
	}

}

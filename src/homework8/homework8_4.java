package homework8;
import java.util.Scanner;
public class homework8_4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input=new Scanner(System.in);
        int[][] workTime=new int[8][7];
        int i,j;
        int temp;
        int[] totalTime=new int[8];//工作总时间
        System.out.print("请依次输入每个员工周日到周五的工作时间：");
        for (i=0;i<8;i++) {
        	totalTime[i]=0;
        	for (j=0;j<6;j++) {
        		workTime[i][j]=input.nextInt();
        		totalTime[i]+=workTime[i][j];
        	}
        }
        int[] totalTime1=new int[8];
        for(i=0;i<8;i++) {
        	totalTime1[i]=totalTime[i];
        }
        for(i=0;i<8-1;i++) {
        	boolean flag=true;
        	for(j=0;j<8-i-1;j++) {
        		if(totalTime[j]<totalTime[j+1]) {
        			temp=totalTime[j];
        			totalTime[j]=totalTime[j+1];
        			totalTime[j+1]=temp;
        			flag=false;
        		}
        	}
        	if(flag) {
        		break;
        	}
        }
        for(i=0;i<8;i++) {
        	for(j=0;j<8;j++) {
        		if(totalTime1[j]==totalTime[i]) {
                	System.out.println("Employee"+j+":"+totalTime[i]);
                	totalTime1[j]=-1;
        		}
        	}
        }
        input.close();
	}

}

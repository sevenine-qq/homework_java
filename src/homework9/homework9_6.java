package homework9;
import java.util.Scanner;
import java.util.Random;
public class homework9_6 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr=new int[100000];
        Random rd=new Random();
        for(int i=0;i<arr.length;i++) {
        	arr[i]=rd.nextInt(100000);
        }
        
        StopWatch sw=new StopWatch();
        selectsort(arr);
        sw.stop();
        
        System.out.println("Ö´ÐÐÁË"+sw.getElapsedTime()+"ºÁÃë");
	}
	
	public static void selectsort(int[] arr) {
		int i,j,min;
		int temp;
		for(i=0;i<arr.length-1;i++) {
			min=arr[i];
			for(j=i+1;j<arr.length;j++) {
				if(arr[j]<min) {
					min=arr[j];
				}
			}
			temp=arr[i];
			arr[i]=min;
			min=temp;
		}

	}

}
class StopWatch{
	private long startTime;
	private long endTime;
	
	public StopWatch() {
		startTime=System.currentTimeMillis();
	}
	
	public void stop() {
		this.endTime=System.currentTimeMillis();
	}
	
	public long getElapsedTime() {
		return this.endTime-this.startTime;
	}
}


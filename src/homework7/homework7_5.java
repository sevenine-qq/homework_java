package homework7;
import java.util.Scanner;
public class homework7_5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input=new Scanner(System.in);
		System.out.print("Enter 10 numbers: ");
		int[] num=new int[10];
		int n;
		int i=0;
		int times = 0;//互不相同的数的个数
		int[] newNum=new int[10];
		while(i<10) {
			n=input.nextInt();
			num[i]=n;
			i++;
		}
		for(int x=0;x<10;x++) {
			if(num[x]>0) {
				newNum[x]=num[x];
				times++;
				for(int y=x+1;y<i;y++) {
					if(num[y]==num[x]) {
						num[y]=-num[y];
					}
				}
			}
		}
		System.out.println("The number of distinct number is "+times);
		System.out.print("The distinct numbers are: ");
		for(int j=0;j<10;j++) {
			if(newNum[j]>0) {
				System.out.print(newNum[j]+" ");
			}
		}
		input.close();

	}

}

package homework9;
import java.util.Scanner;
public class homework9_10 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		QuadraticEquation q=new QuadraticEquation();
        int a,b,c,d;
		Scanner input=new Scanner(System.in);
		System.out.print("请输入a，b，c: ");
        a=input.nextInt();
        b=input.nextInt();
        c=input.nextInt();
        q.seta(a);
        q.setb(b);
        q.setc(c);
        d=q.getDiscriminant();
        System.out.println("判别式的值为"+d);
        if(d>0) {
        	System.out.println("根1为"+q.getRoot1()+","+"根2为"+q.getRoot2());
        }
        else if(d==0) {
        	System.out.println("根为"+q.getRoot1());
        }
        else {
        	System.out.println("The equation has no roots.");
        }
        input.close();

	}

}
class QuadraticEquation{
	private int a=0;
	private int b=0;
	private int c=0;
	
	public QuadraticEquation() {
		
	}
	
	public int geta() {
		return a;
	}
	public int getb() {
		return b;
	}
	public int getc() {
		return c;
	}
	
	public void seta(int a) {
		this.a=a;
	}
	public void setb(int b) {
		this.b=b;
	}
	public void setc(int c) {
		this.c=c;
	}
	
	public int getDiscriminant() {
		return b*b-4*a*c;
	}
	
	public double getRoot1() {
		int d=this.getDiscriminant();
		if(d<0) {
			return 0;
		}
		else
			return (-b+Math.sqrt(this.getDiscriminant()))/(2*a);
	}
	public double getRoot2() {
		int d=this.getDiscriminant();
		if(d<0) {
			return 0;
		}
		else
			return (-b-Math.sqrt(this.getDiscriminant()))/(2*a);
	}
}


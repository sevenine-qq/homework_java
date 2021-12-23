package homework9;
import java.util.Scanner;
public class homework9_11 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		LinearEquation l=new LinearEquation();
		Scanner input=new Scanner(System.in);
		System.out.print("ÇëÊäÈëa,b,c,d,e,f: ");
		double a,b,c,d,e,f;
		a=input.nextDouble();
		b=input.nextDouble();
		c=input.nextDouble();
		d=input.nextDouble();
		e=input.nextDouble();
		f=input.nextDouble();
		
		l.seta(a);
		l.setb(b);
		l.setc(c);
		l.setd(d);
		l.sete(e);
		l.setf(f);
		
		if(l.isSovlable()==true) {
			System.out.printf("xÎª£º%.2f",l.getX());
			System.out.print("\t");
			System.out.printf("yÎª£º%.2f",l.getY());
		}
		else {
			System.out.println("The equation has no solution.");
		}
		input.close();

	}

}
class LinearEquation{
	private double a;
	private double b;
	private double c;
	private double d;
	private double e;
	private double f;
	
	public LinearEquation() {
		
	}
	
	public double geta() {
		return a;
	}
	public double getb() {
		return b;
	}
	public double getc() {
		return c;
	}
	public double getd() {
		return d;
	}
	public double gete() {
		return e;
	}
	public double getf() {
		return f;
	}
	
	public void seta(double a) {
		this.a=a;
	}
	public void setb(double b) {
		this.b=b;
	}
	public void setc(double c) {
		this.c=c;
	}
	public void setd(double d) {
		this.d=d;
	}
	public void sete(double e) {
		this.e=e;
	}
	public void setf(double f) {
		this.f=f;
	}
	
	public boolean isSovlable() {
		if ((a*d-b*c)!=0) {
			return true;
		}
		else {
			return false;
		}
	}
	
	public double getX() {
		return (e*d-b*f)/(a*d-b*c);
	}
	public double getY() {
		return (a*f-e*c)/(a*d-b*c);
	}
}


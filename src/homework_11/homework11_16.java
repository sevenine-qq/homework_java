package homework_11;
import java.util.ArrayList;
import java.util.Random;
import java.util.Scanner;

public class homework11_16 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Random rand=new Random();
		int number1=rand.nextInt(10);
		int number2=rand.nextInt(10);
		Scanner input=new Scanner(System.in);
		System.out.println("What is "+number1+"+"+number2+"?");
		ArrayList<Integer> answer=new ArrayList<>();
		answer.add(input.nextInt());
		while(!answer.contains(number1+number2)) {
			System.out.println("Wrong answer. Try again. Waht is "+
					number1+"+"+number2+"?");
			answer.add(input.nextInt());
		}
		System.out.println("You got it !");
		input.close();
	}

}

package homework_first;

import java.util.Scanner;

public class homework_first {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		final double PI=3.14159;
	       Scanner input = new Scanner(System.in);
	       System.out.print("Enter an integer for seconds: ");
	       int seconds = input.nextInt();
	       int minutes = seconds / 60;
	       int remainingSeconds = seconds % 60;
	       System.out.println(seconds + " seconds is " + minutes + " minutes and " + remainingSeconds + "seconds");
       
	}

}

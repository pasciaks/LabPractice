package labs;

import com.pasciak.utils.GetInputUtility;

public class PosNegZeroWithUtil {

	public static void main(String[] args) {

		System.out.println(
				"This program reads a number from the user and prints out whether the number is positive, negative, or zero.");

		java.util.Scanner input = new java.util.Scanner(System.in);

		GetInputUtility giu = new GetInputUtility();

		int number;

		number = giu.getInput("Enter an integer number: ", -(Integer.MAX_VALUE), Integer.MAX_VALUE, input);

		String result = number == 0 ? "zero" : number > 0 ? "positive" : "negative";

		System.out.println("Your number " + number + " is " + result);

		System.out.println("Goodbye!");

		input.close();

	}

}

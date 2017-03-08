
/*
 * a program to convert an int variable to String using an inbuilt function of String class.
 */
//import scanner for user input
import java.util.Scanner;

//public class conv

public class conv {

	// demo method to convert integer to string
	public void demoInteger() {
		int i;
		System.out.println("Enter Integer value that you want  to convert in String conversion ");
		// taking user input
		@SuppressWarnings("resource")
		Scanner obj1 = new Scanner(System.in);
		i = obj1.nextInt();
		// Integer to String conversion by valueOf method

		String str1 = String.valueOf(i);

		System.out.println("This is the conversion from Integer to String " + str1);
	}

	// demoDouble method to convert double to String
	public void demoDouble() {
		double d;
		System.out.println(" ");
		System.out.println("Enter Double value that you want  to convert in String conversion ");
		@SuppressWarnings("resource")
		Scanner obj = new Scanner(System.in);
		d = obj.nextDouble();

		// Double to String conversion

		String str = String.valueOf(d);

		System.out.println("This is Double to String conversion " + str);

	}

	public static void main(String[] args) {
		// creating object of class conv
		conv o = new conv();
		// calling method

		o.demoInteger();
		o.demoDouble();

	}
}
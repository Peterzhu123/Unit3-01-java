// Create by : Peter zhu
// Create on : Nov 2018 	
// This is a program about Factorial

import java.util.Scanner;

public class Factorial {
	public static void main(String[] args) {
		System.out.println("Enter a number");
		Scanner scanner = new Scanner(System.in);
		int userInput = scanner.nextInt();
		
		System.out.println("The number is " + calculate(userInput));
	}
	
	public static int calculate(int number) {
		if(number <= 1)
		   return 1;
		else 
			return number * calculate(number-1); 
	}

}

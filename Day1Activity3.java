/**
 * 
 */
package com.bpi.hello;
import java.util.Scanner;
/**
 * 
 */
public class Day1Activity3 {

	/**
	 * @param args
	 */
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);

		//ACTIVITY#3
		public static int computeSum(int a, int b) {
		        return a + b;
		    }

		    // Method to compute difference
		    public static int computeDifference(int a, int b) {
		        return a - b;
		    }

		    // Method to compute product
		    public static int computeProduct(int a, int b) {
		        return a * b;
		    }

		    public static void main(String[] args) {
		        Scanner scanner = new Scanner(System.in);

		        System.out.print("Enter first integer: ");
		        int firstDigit = scanner.nextInt();

		        System.out.print("Enter second integer: ");
		        int secondDigit = scanner.nextInt();

		        // Compute results using methods
		        int sum = computeSum(firstDigit, secondDigit);
		        int difference = computeDifference(firstDigit, secondDigit);
		        int product = computeProduct(firstDigit, secondDigit);

		        // Display results
		        System.out.println("Sum: " + sum);
		        System.out.println("Difference: " + difference);
		        System.out.println("Product: " + product);

		        scanner.close();

		
	}

}

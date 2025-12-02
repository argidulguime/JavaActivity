/**
 * 
 */
package com.bpi.hello;
import java.util.Scanner;
/**
 * 
 */
public class Day1Activity4 {

	/**
	 * @param args
	 */
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);

		//Activity#4
		public static void main(String[] args) {
		        Scanner scanner = new Scanner(System.in);
		        System.out.print("Enter your age: ");
		        int InputAge = scanner.nextInt();
		        if (InputAge < 18) {
		            System.out.println("Minor");
		        } else if (InputAge >= 18 && InputAge <= 59) {
		            System.out.println("Adult");
		        } else {
		            System.out.println("Senior");
		        }

		
	}

}

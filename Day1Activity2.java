/**
 * 
 */
package com.bpi.hello;
import java.util.Scanner;
/**
 * 
 */
public class Day1Activity2 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);
        //ACTIVITY#2
        System.out.print("Enter your age: ");
        String ageParamStr = scanner.nextLine();
        // Convert String to int
        int ageParInt = Integer.parseInt(ageParamStr);
        // Convert int to double
        double ageParamDob = (double) ageParInt;
        // Display both versions
        System.out.println("Your age as int: " + ageParInt);
        System.out.println("Your age as double: " + ageParamDob);
        scanner.close();
		
	}

}

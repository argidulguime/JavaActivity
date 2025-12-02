/**
 * 
 */
package com.bpi.hello;
import java.util.Scanner;
/**
 * 
 */
public class Day1Activity1 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub

Scanner scanner = new Scanner(System.in);
        
		//ACTIVITY#1
        System.out.print("What is your name? ");
        String Fullname = scanner.nextLine();
        System.out.println("Hello, " + Fullname + "!");
        scanner.close();
	}

}

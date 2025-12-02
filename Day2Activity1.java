/**
 * 
 */
package com.bpi.hello;
import java.util.Scanner;
/**
 * 
 */
public class Day2Activity1 {


	// Method to calculate sum from 1 to n
	    public static int calculateSum(int n) {
	        int sum = 0;
	        for (int i = 1; i <= n; i++) {
	            sum += i;
	        }
	        return sum;
	    }

	    public static void main(String[] args) {
	        int n = 50; // Upper limit
	        int sum = calculateSum(n);
	        System.out.println("Sum = " + sum);
	    }



}

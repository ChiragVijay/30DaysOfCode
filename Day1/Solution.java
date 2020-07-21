import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {
	
    public static void main(String[] args) {
        int i = 4;
        double d = 4.0;
        String s = "HackerRank ";
		
        Scanner scan = new Scanner(System.in);

        /* Declare second integer, double, and String variables. */
        int one;
        double two;
        String three;
        

        /* Read and save an integer, double, and String to your variables.*/
        // Note: If you have trouble reading the entire String, please go back and review the Tutorial closely.
        Scanner scans = new Scanner(System.in);
        one = scans.nextInt();
        two = scans.nextDouble();
        scans.nextLine();
        three = scans.nextLine();
        
        /* Print the sum of both integer variables on a new line. */
        System.out.println(one + i);
        /* Print the sum of the double variables on a new line. */
        System.out.println(two + d);

		
        /* Concatenate and print the String variables on a new line; 
        	the 's' variable above should be printed first. */
        System.out.println(s + three);


        scan.close();

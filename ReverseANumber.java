package com.ReverseANumber;

import java.util.Scanner;

public class ReverseANumber {
	
	public static void main(String[] args) {
		
		  Scanner sc = new Scanner(System.in);  
	       System.out.println("Enter a Number : ");  
	       int num = sc.nextInt();
	       
		int reversed = 0;

	    for(;num != 0; num /= 10) {
	      int digit = num % 10;
	      reversed = reversed * 10 + digit;
	    }

	    System.out.println("Reversed Number: " + reversed);
	}

}

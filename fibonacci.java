package com.fibonacci;
import java.util.Scanner;

public class fibonacci {
public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);
	
	System.out.println("Enter the num1 : ");
	int num1 = sc.nextInt();

	System.out.println("Enter the num2 : ");
	int num2 = sc.nextInt();
	
	System.out.println("Enter the length of the series : ");
	int length = sc.nextInt();
    
    System.out.println("Fibonacci Series is " + length + " terms:");

    for (int i = 1; i <= length; ++i) {
      System.out.print(num1 + ", ");

      
      int nextNum = num1 + num2;
      num1 = num2;
      num2 = nextNum;
    }
  }

}

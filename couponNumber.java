package coupanNumber;

import java.util.Random;

public class couponNumber {
	public static void main(String[] args) {
		String str="";
	    String alphabet = "abcdefghijklmnopgrstuvwxyzADCDEFCHITKLMNOFORSTUVXYZ0123456789" ;
		System.out.println("Length: "+alphabet.length());
		
		Random r=new Random();
		for(int i=0; i<=4; i++) {
		char c = alphabet.charAt((r.nextInt(alphabet. length())));
		str = String.valueOf(c)+str;
		}
		System.out.println(str); 
	}
}

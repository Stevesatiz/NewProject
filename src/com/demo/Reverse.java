package com.demo;

public class Reverse {

	public static void main(String[] args) {
		
		String input="java application";
		String output="";
		String temp=input;
		for(int i=input.length()-1;i>=0;i--) {
			char charAt = input.charAt(i);
			output=output+charAt;
		}
		System.out.println(output);
		if (temp.equals(output)) {
			System.out.println("palindrome");
		}
		else {
			System.out.println("not polindrome");
		}
	}
}

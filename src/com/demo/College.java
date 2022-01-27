package com.demo;

public class College {
	public static void main(String[] args) {
		
	int count=0;
	int input=121;
	int rev=0;
	int temp=input;
	while(input>0) {
		int a=input/10;
		int b=input%10;
		rev=b+(rev*10);
		input=a;
		count++;
	}
	if(rev==temp) {
		System.out.println("palidrome");
	}
	else {
		System.out.println("not polidrome");
	}
	}}



	

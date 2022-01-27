package com.demo;

public class Ascending {
public static void main(String[] args) {
	
	int[] a=new int[6];
	a[0]=10;
	a[1]=20;
	a[2]=50;
	a[3]=30;
	a[4]=70;
	a[5]=25;

	for(int i=0;i<a.length;i++) {
		for(int j=i+1;j<a.length;j++) {
			if(a[i]<a[j]) {
				int temp=a[i];
				a[i]=a[j];
				a[j]=temp;
			}
			
		}
		
	}
	
for (int i=0;i<a.length;i++) {
	System.out.println(a[i]);
}
System.out.println(a[1]);
}
}


package com.syntax.class09;

public class Task02 {

	public static void main(String[] args) {
		
		//Create an array of chars and store grades into it: A,B,C,D,E,F. 
				//Then print a grade B (use 2 different ways of creating an array).
		
		char[] grades=new char[6];
		grades[0]='A';
		grades[1]='B';
		grades[2]='c';
		grades[3]='D';
		grades[4]='E';
		grades[5]='F';
		
		System.out.println(grades[1]);
		
		System.out.println("----------------------------------------------------------------");
		
		String[] names=new String[5];
		names[0]="Sarah";
		names[1]="Jack";
		names[2]="Linda";
		names[3]="Aaron";
		names[4]="Noor";
		System.out.println(names[3]);
		
		

	}

}

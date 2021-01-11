package com.cooksys.ftd.assignments.objects;

public class Main {
	
	public static void main(String[] args) {
		IRational r1 = new Rational(-1, -2);
		
		IRational r2 = new SimplifiedRational(1, 2);
		
		System.out.println(r1);
		
		System.out.println(r1.negate());
		
		System.out.println(r2.negate());
		
		System.out.println(r2.add(r1));
		
		System.out.println(r1.equals(r2));
		
	}

}

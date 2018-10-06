package com.cakmak.test;

public class Oddity {

	public static boolean isOdd(int number) {
		return number % 2 != 0;
	}

	public static void main(String[] args) {
		System.out.println("IsOdd:" + isOdd(5));
		System.out.println("IsOdd:" + isOdd(10));
		System.out.println("IsOdd:" + isOdd(-5));
		System.out.println("IsOdd:" + isOdd(-10));
	}
}

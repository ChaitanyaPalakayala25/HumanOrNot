package com.demo.project;
import java.util.Random;

public class genRandomNumbers {
	
	public static void main(String[] args) {
		
		Random rand = new Random();
		int num1 = rand.nextInt(10);
		int num2 = rand.nextInt(10);
		int num3 = rand.nextInt(10);
		
		System.out.println(num1+num2+num3);
	}
	
	
}

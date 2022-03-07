package com.juaracoding.array;

import java.util.Arrays;

public class ContohArray4 {

	public static void main(String[] args) {
		
		String motor[] = {"Yamaha","Honda","Suzuki"};
		String tambah = "Kawasaki";
		
		System.out.println("Before");
		for(String i : motor) {
			System.out.print(i+" ");
		}
		
		System.out.println();
		System.out.println("After");
		String newMotor[] = Arrays.copyOf(motor, motor.length+1);
		
		newMotor[motor.length]=tambah;
		for(String i : newMotor) {
			System.out.print(i+" ");
		}
		
		
	}
	
}

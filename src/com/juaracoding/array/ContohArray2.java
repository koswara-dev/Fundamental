package com.juaracoding.array;

import java.util.Scanner;

public class ContohArray2 {

	public static void main(String[] args) {
		
		int angka[] = new int[10];
		angka[0] = 10;
		angka[1] = 11;
		angka[2] = 12;
		angka[3] = 13;
		angka[4] = 14;
		angka[5] = 15;
		
		System.out.println(angka[2]);
		System.out.println(angka[6]);
		System.out.println(angka.length);
		
		//Lat2
		//String
		Scanner scan = new Scanner(System.in);
		
		String motor[] = new String[3];
		for(int i=0;i<motor.length;i++) {
			motor[i] = scan.next();
		}
		
		for(int i=0;i<motor.length;i++) {
			System.out.println(motor[i]);
		}
		
		for(String i : motor) {
			System.out.println(i);
		}
	}
	
}

package com.juaracoding.ujian1;

import java.util.Scanner;

public class Soal10 {

	public static void main(String[] args) {
//		float a = 88.8776f;
//		System.out.printf("%.2f",a);
		
		Scanner scan = new Scanner(System.in);
		
		System.out.println("==================");
		
		for(int i=0;i<3;i++) {
			String huruf = scan.next();
			int angka = scan.nextInt();
			
			System.out.printf("%-15s%03d\n",huruf,angka);
		}
		
		System.out.println("==================");
	}
}

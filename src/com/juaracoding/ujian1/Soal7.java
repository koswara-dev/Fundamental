package com.juaracoding.ujian1;

import java.util.Scanner;

public class Soal7 {

	public static void main(String[] args) {
		
		//2, 5
		//3, 6
		
		Scanner scan = new Scanner(System.in);
		
		int angka = scan.nextInt();
		int pangkat = scan.nextInt();
		
		for(int i=1; i<=pangkat; i++) {
			System.out.print(Math.pow(angka, i)+" ");
		}
		
		System.out.print(Math.pow(2, 1)+" ");
		System.out.print(Math.pow(2, 2)+" ");
		System.out.print(Math.pow(2, 3)+" ");
		System.out.print(Math.pow(2, 4)+" ");
		
	}
}

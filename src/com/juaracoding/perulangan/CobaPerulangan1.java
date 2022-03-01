package com.juaracoding.perulangan;

import java.util.Scanner;

public class CobaPerulangan1 {

	public static void main(String[] args) {
		
		for(int i=1; i<=10; i = i+2) {
			System.out.print(i + " ");
		}
		
		System.out.println();
		
		for(int i=10; i>=1; i--) {
			System.out.print(i + " ");
		}
		
		System.out.println();
		
		for(int i=1; i<=10; i = i+2) {
			System.out.print("* ");
		}
		
		System.out.println();
		
		int nilaiAwal, nilaiAkhir;
		nilaiAwal = 5;
		nilaiAkhir = 1;
		
		for(int i=nilaiAwal; i>=nilaiAkhir; i--) {
			System.out.print(i + " ");
		}
		
		System.out.println();
		
		// For Each
//		String[] motor = {"Suzuki","Honda","Yamaha"};
//		for(String i : motor) {
//			System.out.println(i);
//		}
//		
//		int[] bilangan = {10,20,30,40,50};
//		for(int i : bilangan) {
//			System.out.println(i);
//		}
		
		// gunakan inputan
		// 10 8 6 4 2
		// for each kopi = americano, kapal api, good day 
		
		Scanner scan = new Scanner(System.in);
		
		String kopi[] = new String[3];
		for(int i=0; i<3; i++) {
			kopi[i] = scan.nextLine();
		}
//		for(int i=0; i<3; i++) {
//			System.out.print(kopi[i]+ " ");
//		}		
		for(String i : kopi) {
			System.out.print(i+ " ");
		}

	}

}

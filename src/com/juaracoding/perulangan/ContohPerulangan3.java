package com.juaracoding.perulangan;

import java.util.Iterator;

public class ContohPerulangan3 {

	public static void main(String[] args) {
		
//		for(int i=1; i<5; i++) {
//			for(int j=1; j<4; j++) {
//				System.out.println(j);
//			}
//		}
		
		for(int i=1; i<5; i++) {
			for(int j=3; j>=1; j--) {
				System.out.print(j+" ");
			}
			System.out.println();
		}
		
//		for(int i=1; i<5; i++) {
//			for(int j=1; j<5; j++) {
//				System.out.println("*");
//			}
//		}
		
		for(int i=1; i<5; i++) {
			for(int j=4; j>=1; j--) {
				System.out.print("*");
			}
			System.out.println();
		}
		
		//pola segitiga siku
		for(int i=1; i<5; i++) {
			for(int j=1; j<=i; j++) {
				System.out.print("*");
			}
			System.out.println();
		}
		
		//gunakan inputan
		//buat pola segitiga siku alas 6, tinggi 5
		
		// mirror ******
		
		//1 * 3 * 5 * 7
		//* 3 * 5 *
		//3 * 5
		// *
		
		for(int i=1; i<8; i++) {
			for(int j=i; j<=8-i; j++) {
				if(j % 2 == 0) {
					System.out.print("*");
				} else {
					System.out.print(j);
				}
			}
			System.out.println();
		}
		
	}
}

package com.juaracoding.perulangan;

public class ContohPerulangan2 {

	public static void main(String[] args) {
		
		// 1 * 3 * 5 * 7
		for(int i=0; i<10; i++) {
			if(i % 2 == 0) {
				System.out.print("* ");
			} else {
				System.out.print(i+" ");
			}
		}
	}
}

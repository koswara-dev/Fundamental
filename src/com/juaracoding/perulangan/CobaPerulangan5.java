package com.juaracoding.perulangan;

public class CobaPerulangan5 {

	public static void main(String[] args) {
		
		int x = 1;
		
		while(x < 10) {
			if(x % 2 == 0) {
				System.out.print("* ");
			} else {
				System.out.print(x + " ");
			}
			x++;
		}
	}
}

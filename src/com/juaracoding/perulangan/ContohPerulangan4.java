package com.juaracoding.perulangan;

public class ContohPerulangan4 {

	public static void main(String[] args) {
		
		int x = 1;
		
		while(x < 5) {
			System.out.print(x);
			x++;
		}
		
		System.out.println();
		
		int y = 1;
		do {
			System.out.print(y);
			y++;
		}
		while(y < 10);
				
		System.out.println();
				
//		do {
//			System.out.println("loops");
//		}
//		while(true);
		
		int z = 2;
		do {
			System.out.print(z + " ");
			z = z+2;
		}
		while(z < 10);
	}
}

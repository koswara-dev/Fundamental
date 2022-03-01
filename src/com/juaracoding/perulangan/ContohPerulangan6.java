package com.juaracoding.perulangan;

import java.util.Scanner;

public class ContohPerulangan6 {

	public static void main(String[] args) {
		
//		for(int i=1; i<10; i++) {
//			if(i == 5) {
//				break;
//			}
//			System.out.print(i + " ");
//		}
//		
//		System.out.println();
//		
//		for(int i=1; i<10; i++) {
//			if(i == 5) {
//				continue;
//			}
//			System.out.print(i + " ");
//		}
//		
//		System.out.println();
//		
//		int x = 1;
//		
//		while(x < 5) {
//			if(x == 3) {
//				x++;
//				break;
//			}
//			System.out.print(x);
//			x++;
//		}
//		
//		System.out.println();
//		
//		int y = 1;
//		
//		while(y < 5) {
//			if(y == 3) {
//				y++;
//				continue;
//			}
//			System.out.print(y);
//			y++;
//		}
//		
//		System.out.println();
//		
//		int z = 1;
//		int sum = 0;
//		
//		while(z < 5) {
//			if(z == 3) {
//				z++;
//				continue;
//			}			
//			sum += z;
//			z++;
//			
//		} System.out.print(sum);
		
		
		Scanner scan = new Scanner(System.in);
		while(true) {
			System.out.println("Close ya/tidak?");
			String input = scan.nextLine();
			if(input.equals("ya")) {
				break;
			}
		} System.out.println("Terima kasih");
		
		while(true) {
			System.out.println("Masukan angka (0 exit): ");
			int num = Integer.valueOf(scan.nextLine());
			if(num == 0) {
				break;
			}
		} System.out.println("Terima kasih");
		
	}
}

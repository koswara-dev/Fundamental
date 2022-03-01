package com.juaracoding.ujian1;

import java.util.Scanner;

public class Soal8 {

	//1
	//Text print
	//Text print
	//2
	//Text print
	//Text print
	
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		int angka = scan.nextInt();
		
		for(int i=1; i<angka; i++) {
			System.out.println(i);
			for(int j=1; j<angka; j++) {
				System.out.println("Text print");
			}
		}
	}
}

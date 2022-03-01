package com.juaracoding.perulangan;

import java.util.Scanner;

public class contohProgram2 {

	public static void main(String[] args) {
		
		// Program Sederhana menggunakan percabangan dan looping
		// Rumus bidang datar
		// 1. Persegi
		// 2. Persegi panjang
		// 3. Segitiga
		// misal pilih 1
		// setiap rumus menggunakan variabel inputan
		// apakah ingin mencoba rumus lain? yes
		// tidak (keluar program)
		
		Scanner scan = new Scanner(System.in);
		boolean running = true;
		String jawab;
		
		// program rumus bangun datar		
		System.out.println("Rumus Bangun Datar");
		
		while(running) {
			System.out.print("Apakah ingin mencoba rumus lain [ya/tidak]? ");
			jawab = scan.nextLine();
			
			if(jawab.equalsIgnoreCase("ya")) {
				// program rumus bangun datar
				
				
			} else {
				// stop program
				running = false;
			}
		}
		
	}
}

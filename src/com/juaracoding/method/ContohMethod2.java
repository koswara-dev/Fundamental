package com.juaracoding.method;

import java.util.Scanner;

public class ContohMethod2 {

	public static void main(String[] args) {
		
		// Rumus Bangun Ruang
		// method: rumusBangunRuang: Kubus, Balok
		//    method: luasKubus, volumeKubus
		//    method: luasBalok, volumeBalok
		
		rumusBangunRuang();
		
		
	}
	
	static void rumusBangunRuang() {
		Scanner scan = new Scanner(System.in);
		int pilih;
		System.out.println("1. Kubus");
		System.out.println("2. Balok");
		System.out.print("Pilih Rumus: "); pilih = scan.nextInt(); 
		switch (pilih) {
		case 1:
			//
			luasKubus();
			volumeKubus();
			break;
			
		case 2:
			//
			luasBalok();
			volumeBalok();
			break;
			
		default:
			System.out.println("Hanya ada 2 rumus bangun ruang");
			break;
		}
	}
	
	static void luasKubus() {
		System.out.println("Method Luas Kubus");
	}
	
	static void volumeKubus() {
		System.out.println("Method Volume Kubus");
	}
	
	static void luasBalok() {
		System.out.println("Method Luas Balok");
	}
	
	static void volumeBalok() {
		System.out.println("Method Volume Balok");
	}
	
}

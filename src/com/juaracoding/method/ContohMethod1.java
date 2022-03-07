package com.juaracoding.method;

import java.util.Scanner;

public class ContohMethod1 {

	public static void main(String[] args) {
		
		System.out.println(luasKotak(5.5f));
		System.out.printf("%.2f\n\n",luasKotak(2.9f));
		
		cetak();
		
		identitas("Koswara", "Kuningan");
		identitas("Budi", "Cirebon");
		
		double tanahAku = luasPersegiPanjang(10, 15);
		System.out.println(tanahAku);
		
		double tanahB = luasPersegiPanjang(20, 10);
		System.out.println(tanahB);
		
		inputData();
		
		
	}
	
	static float luasKotak(float s) { //float luasKotak = s * s
		
		float luas = s*s; 
		return luas;
		
	}
	
	static double luasPersegiPanjang(double p,double l) {
		
		return p*l;
		
	}
	
	static void cetak() {
		System.out.println("Cetak dari method");
	}
	
	static void inputData() {
		Scanner scan = new Scanner(System.in);
		System.out.print("Masukan nama: ");
		String nama = scan.nextLine();
		System.out.print("Masukan Alamat: ");
		String alamat = scan.nextLine();
		System.out.println("-----------");
		System.out.println("Nama: "+nama);
		System.out.println("Alamat: "+alamat);
		
		cetak();
	}
	
	static void identitas(String nama, String alamat) {
		
		System.out.println("Nama saya : " + nama + ", Alamat : " + alamat);
		
	}
	
}

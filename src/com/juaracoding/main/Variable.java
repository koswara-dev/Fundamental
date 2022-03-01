package com.juaracoding.main;

public class Variable {

public static void main(String[] args) {
		
		String nama = "Koswara";
		String alamatLengkap = "Kuningan Jabar";
		String nomorRumah;
		nomorRumah = "A10";
		int perkalian;
		perkalian = 10*5;		
		byte angka = 127;
		float rumusSegitiga = 10.576f;
		double rumusLingkaran = 100.5;
		
		System.out.println("Nama \t: " + nama);
		System.out.println("Alamat : " + alamatLengkap);
		System.out.println("Nomor Rumah : " + nomorRumah);
		System.out.println("Perkalian : " + perkalian);
		System.out.println("Coba Byte : " + angka);
		System.out.println("Rumus Segitiga : " + rumusSegitiga);
		System.out.println("Rumus Lingkaran : " + rumusLingkaran);
		System.out.printf("Rumus Segitiga : %.2f", rumusSegitiga);
	}
}

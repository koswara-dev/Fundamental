package com.juaracoding.main;


import java.time.LocalDate;
import java.util.Scanner;


public class InputData {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		LocalDate localDate = LocalDate.now();
		System.out.println(localDate);
		
		String nama, alamat;
		int a, b, jml;
//		int nilai = scan.nextInt();
//		double nilai2 = scan.nextDouble();
		
		System.out.print("Nama : "); nama = scan.nextLine();
		System.out.print("Alamat : "); alamat = scan.nextLine();
		System.out.print("Nilai A = "); a = scan.nextInt();
		System.out.print("Nilai B = "); b = scan.nextInt();
		jml = a + b;
		System.out.println("---------------");
		System.out.println("Nama : "+nama);
		System.out.println("Alamat : "+alamat);
		System.out.println(nama.length());
		System.out.println(nama.concat(alamat));
		System.out.println(nama.toUpperCase());
		System.out.println("Jumlah : "+jml);

//		System.out.println("Nilai : "+nilai);
//		System.out.println("Nilai : "+nilai2);
		
		// Nama : (Input)
		// Nama : (Hasil Input)
	}
}

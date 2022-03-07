package com.juaracoding.main;

import java.util.Scanner;

public class MainRumus extends Rumus {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		int a, b;
		a = scan.nextInt();
		b = scan.nextInt();
		String nama1 = scan.next();
		
//		Rumus rumus = new Rumus();
//		System.out.println(rumus.penjumlahan(a, b));
		
		MainRumus rumus = new MainRumus();
		System.out.println(rumus.penjumlahan(a, b));
		
		int angka[] = {11,22,33,44};
		rumus.dataArray(angka);
		
		rumus.inputData(nama1);
		rumus.tampilkanNama();
		

	}
	
	

}

class Rumus{
	
	String nama;
	
	double penjumlahan(int a, int b) {
		return a+b;
	}
	
	void dataArray(int angka[]) {
		for(int i=0;i<angka.length;i++) {
			System.out.println(angka[i]);
		}
	}
	
	void inputData(String nama1) {
		nama = nama1;
	}
	
	void tampilkanNama() {
		System.out.println("Nama: "+nama);
	}
}

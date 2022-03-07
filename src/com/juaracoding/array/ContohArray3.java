package com.juaracoding.array;

import java.util.Scanner;

public class ContohArray3 {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		int baris,kolom;
		System.out.print("Jumlah Baris: ");baris = scan.nextInt();
		System.out.print("Jumlah Kolom: ");kolom = scan.nextInt();
		int matriksA[][] = new int[10][10];
		int matriksB[][] = new int[10][10];
		int hasilMatriks[][] = new int[10][10];
		
		System.out.println("Masukan Matriks A:");
		for(int i=0;i<baris;i++) {
			for(int j=0;j<kolom;j++) {
				matriksA[i][j] = scan.nextInt();
			}
		}
		
		System.out.println("Masukan Matriks B:");
		for(int i=0;i<baris;i++) {
			for(int j=0;j<kolom;j++) {
				matriksB[i][j] = scan.nextInt();
			}
		}
		
		System.out.println("Hasil Penjumlahan Matriks A dan B:");
		for(int i=0;i<baris;i++) {
			for(int j=0;j<kolom;j++) {
				hasilMatriks[i][j]=matriksA[i][j]+matriksB[i][j];
				System.out.print(hasilMatriks[i][j]+" ");
			}
			System.out.println();
		}
		
		
	}
}

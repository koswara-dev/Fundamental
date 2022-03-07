package com.juaracoding.array;

public class ContohArray1 {

	public static void main(String[] args) {
		
		int[] angka = {10,11,12,13,14};
		String[] motor = {"Honda","Suzuki","Yamaha"};
		
		System.out.println(angka.length);
		System.out.println(angka[0]);
		System.out.println(angka[4]);
		System.out.println(angka[0]+" "+angka[3]);
		
		for(int i=0;i<5;i++) {
			System.out.print(angka[i]+" ");
		}
		
		System.out.println();
		
		for(int i=0;i<angka.length;i++) {
			System.out.print(angka[i]+" ");
		}
		
		System.out.println();
		
		//for each
		for(int i:angka) {
			System.out.print(i+" ");
		}
		
		System.out.println();
		System.out.println(motor.length);
		//Lat1
		
	}
}

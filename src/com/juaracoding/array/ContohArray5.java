package com.juaracoding.array;

import java.util.Arrays;

public class ContohArray5 {

	public static void main(String[] args) {
		
		int angka[] = {20,22,17,8,10};
		
		int valueBaru=100, posisi_index=1;
		
		System.out.println("Before");
		for(int i=0;i<angka.length;i++) {
			System.out.print(angka[i]+" ");
		}
		
		System.out.println();
		System.out.println("After");
		for(int i=angka.length-1;i>posisi_index;i--){ //i=4;i>3;i--
			angka[i]=angka[i-1]; //menggeser posisi i=i-1, 4=3
		}
		
		angka[posisi_index]=valueBaru;//angka[3]=12
		System.out.print(Arrays.toString(angka)+" ");
		
	}
}

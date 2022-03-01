package com.juaracoding.percabangan;

public class ContohPercabangan6 {

	public static void main(String[] args) {
		
		String kelas = "1B";
		int jam = 10;
		
		switch (kelas) {
		case "1A":
			System.out.println("Ruang 1");
			switch (jam) {
			case 9:
				System.out.println("Statistik");
				break;
			case 11:
				System.out.println("Pemrograman Java");
				break;	
			default:
				System.out.println("Tidak ada jadwal");
				break;
			}
			break;

		case "1B":
			System.out.println("Ruang 2");
			switch (jam) {
			case 8:
				System.out.println("Bahasa Indonesia");
				break;
			case 10:
				System.out.println("Praktikum Java");
				break;	
			default:
				System.out.println("Tidak ada jadwal");
				break;
			}
			break;
		default:
			System.out.println("Tidak ada kelas tersebut");
			break;
		}
		
	}
}

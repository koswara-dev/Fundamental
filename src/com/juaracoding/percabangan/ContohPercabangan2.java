package com.juaracoding.percabangan;

public class ContohPercabangan2 {

	public static void main(String[] args) {
		
		int nilai = 80;
		String kata1 = "JuaraCoding";
		String kata2 = "juaracoding";
		
		String level = "level 3";
		
		//predikat 90-100 A, 86-89 = B, 75-85 = C, D
		if (nilai >= 90 && nilai <=100) {
			System.out.println("Grade A");
			
		} else if (nilai >= 86 && nilai <=89) {
			System.out.println("Grade B");
			
		} else if (nilai >= 75 && nilai <=85) {
			System.out.println("Grade C");
			
		} else if (nilai >= 0 && nilai <=74) {
			System.out.println("Grade D");
			
		} else {
			System.out.println("nilai hanya dari 0 - 100");
		}
		
		//penggunaan operator logika pada kondisi 
		if (kata1.equalsIgnoreCase(kata2) || kata1 == kata2) {
			System.out.println("sama dengan");
		}
		
		if(level.equalsIgnoreCase("Level 1")) {
			System.out.println("Lower");
		} else if(level.equalsIgnoreCase("Level 2")) {
			System.out.println("Middle");
		} else if(level.equalsIgnoreCase("Level 3")) {
			System.out.println("Exellent");
		} else {
			System.out.println("hanya level 1 sampai 3");
		}
		
		// Gunakan inputan
		// input huruf vokal dan konsonan
		// contoh a, A = huruf vokal
		// contoh c, C = huruf konsonan
		
		// Pasien pilih ruangan: kelas VIP, ket: 1 ruangan 1 orang, Rp. 200.000 per malam
		// pasien tersebut dirawat selama 3 hari, muncul tagihan berapa?
		// kelas 1, ket: 1 ruangan 2 orang, Rp. 150.000 per malam
		// kelas 2, ket: 1 ruangan 4 orang, Rp. 90.000 per malam
		// kelas 3, ket: 1 ruangan 6 orang, Rp. 50.000 per malam

	}

}

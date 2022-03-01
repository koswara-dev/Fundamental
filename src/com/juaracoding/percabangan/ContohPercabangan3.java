package com.juaracoding.percabangan;

public class ContohPercabangan3 {

	public static void main(String[] args) {
		
		int x = 200;
		
		if (x % 2 == 0) {
			if (x / 100 != 0) {
				System.out.println(x + " bilangan genap lebih dari 100");
			} else if (x / 10 != 0){
				System.out.println(x + " bilangan genap lebih dari 10");
			}
		}
		
		String gender = "p";
		int usia = 5;
		
		if (gender.equalsIgnoreCase("L")) {
			if (usia > 6) {
				System.out.println("Gender: "+ gender);
				System.out.println("Usia: "+ usia);
				System.out.println("Harus vaksin");
			} else {
				System.out.println("Gender: "+ gender);
				System.out.println("Usia: "+ usia);
				System.out.println("Belum boleh vaksin");
			}
		} else if (gender.equalsIgnoreCase("P")) {
			if (usia > 6) {
				System.out.println("Gender: "+ gender);
				System.out.println("Usia: "+ usia);
				System.out.println("Harus vaksin");
			} else {
				System.out.println("Gender: "+ gender);
				System.out.println("Usia: "+ usia);
				System.out.println("Belum boleh vaksin");
			}
		}
		
		// Gunakan inputan
		// Donor Darah
		// usia diatas 17
		// beratBadan diatas 50
		// Boleh donor darah
		
		int usiaPendonor = 18;
		int beratBadan = 51;
		
		if(usiaPendonor > 17) {
			if(beratBadan > 50) {
				System.out.println("Usia: "+usiaPendonor);
				System.out.println("Berat Badan: "+beratBadan);
				System.out.println("Boleh donor");
			} else {
				System.out.println("Usia: "+usiaPendonor);
				System.out.println("Berat Badan: "+beratBadan);
				System.out.println("belum boleh donor");
			}
		} else if (usiaPendonor < 17 || beratBadan < 50) {
			System.out.println("Usia: "+usiaPendonor);
			System.out.println("Berat Badan: "+beratBadan);
			System.out.println("belum boleh donor");
		}
		
	}
}

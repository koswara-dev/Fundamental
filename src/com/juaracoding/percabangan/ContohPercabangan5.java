package com.juaracoding.percabangan;

public class ContohPercabangan5 {

	public static void main(String[] args) {
		//Switch Case
		int hari = 5;
		
		switch(hari) {
			case 1:
				System.out.println("Senin");
				break;
			case 2:
				System.out.println("Selasa");
				break;
			case 3:
				System.out.println("Rabu");
				break;
			case 4:
				System.out.println("Kamis");
				break;
			case 5:
				System.out.println("Jum'at");
				break;
			case 6:
				System.out.println("Sabtu");
				break;
			case 7:
				System.out.println("Minggu");
				break;
			default:
				System.out.println("Tidak ada nama hari tersebut");
				break;
		}
		
		String browser = "firefox";
		
		switch (browser) {
		case "chrome":
			System.out.println("Open Chrome");			
			break;
		case "firefox":
			System.out.println("Open Firefox");
			break;
		default:
			System.out.println("Hanya ada 2 browsers");
			break;
		}
	}
}

package com.juaracoding.oop;

public class Motor {

	void yamaha(){
		System.out.println("Ini merk Yamaha");
	}
	
	void honda(){
		System.out.println("Ini merk Honda");
	}
	
	void kawasaki(String tipe) {
		System.out.println("Tipe: "+tipe);
	}
	
	double kecepatan(double jarak, double waktu) {
		return jarak/waktu;
	}
	
}

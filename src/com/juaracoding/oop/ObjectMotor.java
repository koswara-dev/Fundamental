package com.juaracoding.oop;

import com.juaracoding.oop2.Motor2;

class CobaProtected {
	
	protected String merkLampu = "Lampu";
	
}

public class ObjectMotor {
	
	private int ukuranBan = 17;

	public static void main(String[] args) {
		
		Motor objMotor = new Motor();
//		System.out.println(objMotor.merk);
//		System.out.println(objMotor.tipe);
		
		objMotor.yamaha();
		objMotor.honda();
		objMotor.kawasaki("Ninja");
		
		double hasil=objMotor.kecepatan(100, 30);
		System.out.println("Kecepatan = "+hasil);
		
		
		Motor2 objMotor2 = new Motor2();
		System.out.println(objMotor2.merk2);
		
		//Private
		ObjectMotor myMotor = new ObjectMotor();		
		System.out.println("Ukuran Ban: "+myMotor.ukuranBan);
		
		//Protected
		CobaProtected myProtected = new CobaProtected();
		System.out.println("Akses Protected: "+myProtected.merkLampu);
		
		
		
	}
}

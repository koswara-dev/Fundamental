package com.juaracoding.oop;

public class ObjKaryawan {

	public static void main(String[] args) {
		
//		Karyawan karyawan1 = new Karyawan("Koswara");
//		System.out.println("Nama: "+karyawan1.modelNama);
		
		Karyawan karyawan = new Karyawan();
		karyawan.divisiKaryawan(1, "Nama1", "Jabatan1", 1000);
		karyawan.divisiKaryawan(2, "Nama2", "Jabatan2", 2000);
		
//		karyawan.inputData();
	
	}
}

//Karyawan
//objek karyawan1, karyawan2, dst
//class method: divisi
//atribut: id, nama, jabatan, salary
//gunakan modifier
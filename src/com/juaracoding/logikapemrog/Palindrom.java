package com.juaracoding.logikapemrog;

public class Palindrom {

	public static void main(String[] args) {
		
		cobaPalindrom("kasur ini rusak");
		
	}
	
	public static void cobaPalindrom(String teks) {
		String poli = "";
		
		for(int i = teks.length(); i>0; i--) {
			String kata = teks.substring(i-1, i);//7,8
			poli += kata;
		}
		
		if(teks.equals(poli)) {
			System.out.println(teks + " --- ini adalah palindrom");
		} else {
			System.out.println(teks + " --- ini bukan palindrom");
		}
	}
}

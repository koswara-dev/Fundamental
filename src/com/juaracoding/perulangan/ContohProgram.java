package com.juaracoding.perulangan;

import java.util.Scanner;

public class ContohProgram {

	public static void main(String[] args) {
		
		String passwd = "inipassword";
		int maxInput = 3;
		
		Scanner scan = new Scanner(System.in);
		String inputPasswd;
		
		System.out.print("Masukan password : "); inputPasswd = scan.nextLine();
		
		if(inputPasswd.equals(passwd)) {
			System.out.println("Welcome, Home Page");
		} else {
			for(int i = 1; i < maxInput; i++) {
				System.out.print("Masukan password : "); inputPasswd = scan.nextLine();
				if(inputPasswd.equals(passwd)) {
					System.out.println("Welcome, Home Page");
				}
			}
			System.out.println("Akses ditolak karena sudah "+maxInput+" x salah");
		}
		
		
		
	}
}

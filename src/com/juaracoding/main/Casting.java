package com.juaracoding.main;

public class Casting {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		short dataShort = 1024;
		double dataDouble = dataShort;
		
		char dataChar = 'Y';
		long dataLong = dataChar; //ASCII
		
		long dataLong2 = 2147483647;
		int dataInt = (int) dataLong2;
		
		System.out.println(dataDouble);
		System.out.println(dataLong);
		System.out.println(dataInt);
	}

}

package com.juaracoding.percabangan;

import java.text.DecimalFormat;
import java.text.DecimalFormatSymbols;
import java.text.NumberFormat;
import java.util.Locale;

public class LatPercabangan2 {

	public static void main(String[] args) {
						
		double harga = 100000.95;
		
		DecimalFormat formatRupiah = (DecimalFormat) DecimalFormat.getCurrencyInstance();
		DecimalFormatSymbols simbolRupiah = new DecimalFormatSymbols();
		
		simbolRupiah.setCurrencySymbol("Rp. ");
		simbolRupiah.setMonetaryDecimalSeparator(',');
		simbolRupiah.setGroupingSeparator('.');
		
		formatRupiah.setDecimalFormatSymbols(simbolRupiah);
		System.out.println(formatRupiah.format(harga));
		
		NumberFormat formatDollar = NumberFormat.getCurrencyInstance(Locale.US);
		System.out.println(formatDollar.format(harga));
		
		NumberFormat formatKursJepang = NumberFormat.getCurrencyInstance(Locale.JAPAN);
		System.out.println(formatKursJepang.format(harga));
		
		
	}
}

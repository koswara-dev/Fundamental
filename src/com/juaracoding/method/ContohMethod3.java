package com.juaracoding.method;

public class ContohMethod3 {

	public static void main(String[] args) {
		
		StringBuffer sb = new StringBuffer("Juara"); //Constructor Parameter
//		sb.append("Coding");
		
//		sb.insert(1, "Coding");
		
		int start=3, end=5;
		
//		sb.replace(start, end, "Coding");
		
		sb.delete(start, end);
		
		System.out.println(sb);
		
		String a = "Kasur ini Rusak";
		
		StringBuffer balikKata = new StringBuffer(a);	
		balikKata.reverse();
		
		System.out.println(balikKata);
	}
	
}

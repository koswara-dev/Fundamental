package com.juaracoding.percabangan;

public class ContohPercabangan {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Integer a, b;
		a = 12;
		b = 10;
		boolean c = "test" == "test";
		String kata1, kata2;
		kata1 = "juaracoding";
		kata2 = "Juaracoding";
		
//		System.out.println(a);
//		System.out.println(b);
//		System.out.println(kata1.equals("juaracoding"));
		
		if(kata1.equalsIgnoreCase(kata2)) {
			System.out.println("sama dengan");
		} else {
			System.out.println("tidak sama dengan");
		}
	}

}

package com.juaracoding.logikapemrog;

public class Operator {

	public static void main(String[] args) {
		
		//operator
		int a = 50+25;
		int b = a + 100;
		int c = b + b;
		System.out.println(a);
		System.out.println(b);
		System.out.println(c);
		
		System.out.println();
		
		int x = 20;
		int y = 20;
		System.out.println(x++);//+1
		System.out.println(++x);//+2
		System.out.println(y--);
		System.out.println(--y);
		
		System.out.println(11%2);
		
		System.out.println(11>9);
		
		System.out.println(11>9 && 9<11);
		
		int nilai1 = 100;
		int nilai2 = 200;
		nilai1 += 4;
		nilai2 -= 4;
		System.out.println(nilai1);
		System.out.println(nilai2);
		
		//substring
		String kata1 = "JuaraCoding";
		System.out.println(kata1.substring(5,10));
		System.out.println(kata1.substring(3,5));
		System.out.println(kata1.substring(0,1));
		System.out.println(kata1.substring(1,2));

	}

}

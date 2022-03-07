package com.juaracoding.main;

import java.util.Scanner;

class Account{  
	int acc_no;  
	String name;  
	float amount;  
	//Method to initialize object  
	void insert(int a,String n,float amt){  
	acc_no=a;  
	name=n;  
	amount=amt;  
	}  
	//deposit method  
	void deposit(float amt){  
	amount=amount+amt;  
	System.out.println(amt+" deposited");  
	}  
	//withdraw method  
	void withdraw(float amt){  
	if(amount<amt){  
	System.out.println("Insufficient Balance");  
	}else{  
	amount=amount-amt;  
	System.out.println(amt+" withdrawn");  
}  
}  
//method to check the balance of the account  
void checkBalance(){System.out.println("Balance is: "+amount);}  
//method to display the values of an object  
void display(){System.out.println(acc_no+" "+name+" "+amount);}  
}  
//Creating a test class to deposit and withdraw amount  
class TestAccount{  
public static void main(String[] args){  
	
	Scanner scan = new Scanner(System.in);
	int a = scan.nextInt();
	String n = scan.next();
	float amt = scan.nextFloat();
	
	Account a1=new Account();  
	a1.insert(a,n,amt);  
	a1.display();  
	a1.checkBalance();  
	a1.deposit(40000);  
	a1.checkBalance();  
	a1.withdraw(15000);  
	a1.checkBalance();  
}}   

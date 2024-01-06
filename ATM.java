package oops2;

import java.util.HashMap;
import java.util.Scanner;

public class ATM {
	
	public static void main(String[] args) {
			ATMOP obj=new ATMOP();
			
			}
}

class Data{
	float balance;
	
}


class ATMOP{
	Scanner sc=new Scanner(System.in);
	HashMap<Integer,Data> map=new HashMap<>();
	ATMOP(){
		System.out.println("******************************************");
		System.out.println("Welcom to our ATM ");
		op();
		
	}
	
	public void op() {
		System.out.println("Enter your pin code:");
		int pincode=sc.nextInt();
		
		if(map.containsKey(pincode)==true) {
			Data obj =map.get(pincode);
			menu(obj);
		}else {
			System.out.println("******************************************");
			System.out.println("Please create account First:");
			System.out.println("Set your pin code: ");
			int pin =sc.nextInt();
			Data obj=new Data();
			map.put(pin, obj);
			menu(obj);	
		}
	}
	
	public void menu(Data obj) {
		System.out.println("******************************************");
		
		System.out.println("please enter valid number:");
		System.out.println("1. Check Balance");
		System.out.println("2. Deposit money");
		System.out.println("3. withdraw money");
		System.out.println("4. check another account");
		System.out.println("5. Exit");
		
		int x=sc.nextInt();
		
		if(x == 1) {
			check_balacne(obj);
		}else if(x == 2) {
			deposit(obj);		}
		else if(x == 3) {
			withdraw(obj);		}
		else if(x == 4) {
			op();		}
		else if(x == 5) {
			System.out.println("Thank You !");
		}else {
			System.out.println("please enter valid Number");
			menu(obj);		
		}
	}
	
	public void check_balacne(Data obj) {
		System.out.println("********************************");
		System.out.println("Your Balance "+obj.balance);
		System.out.println("********************************");
		menu(obj);
	}
	
	public void deposit(Data obj) {
		System.out.println("enter your amount");
		float a=sc.nextFloat();
		
		obj.balance= obj.balance + a;
		
		System.out.println("amount deposited successfully");
		System.out.println("********************************");
		menu(obj);
	}
	
	public void  withdraw(Data obj) {
		System.out.println("Enter your amount:");
		float a=sc.nextFloat();
		if(obj.balance>=a) {
			obj.balance=obj.balance-a;
			System.out.println("amount withdraw successfully");
			
		}else {
			System.out.println("Insufficient balance");
		}
		
		
		System.out.println("********************************");
		menu(obj);	
	}
	
	
	
	
}
	
	
	
	
	
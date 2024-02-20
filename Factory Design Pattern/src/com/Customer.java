package com;

import java.util.Scanner;

public class Customer {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Welcome to Online Shopping Apps");
		System.out.println("1:Myntra\n2:Amazon\n3:Flipkart");
		System.out.println("Select one Shopping App");
		int choice=sc.nextInt();
		OnlineShoppingApp objApp=Mobile.selectApp(choice);
		if(objApp instanceof Myntra) {
			System.out.println("Do shopping from Myntra App");
		}
		else if(objApp instanceof Amazon) {
			System.out.println("Do shopping from Amazon App");
		}
		else if(objApp instanceof Flipkart) {
			System.out.println("Do shopping from Flipkart App");
		}
		else {
			System.out.println("Go with Another Shopping App");
		}
	}

}

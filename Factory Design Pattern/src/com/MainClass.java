package com;
import java.util.Scanner;

public class MainClass {
	public static void main(String[] args) {
		Hotel h=new Hotel();
		/*Internally if choice 1-->Food obj=new Biryani();
		 *Internally if choice 2-->Food obj=new Pizza();
		 *Internally if choice 3-->Food obj=new Burger();
		 *Internally if choice 4,5..-->Food obj=null;
		 */
		Scanner sc=new Scanner(System.in);
		System.out.println("Welcome to JSpider's Hotel");
		System.err.println("--------MenuCard----------");
		System.out.println("1:Biryani\n2:Pizza\n3:Burger");
		System.out.println("Enter your choice");
		int choice=sc.nextInt();
		
		Food obj=h.orderFood(choice);
		if(obj instanceof Biryani) {
			System.out.println("Eating Biryani");
		}
		else if(obj instanceof Pizza) {
			System.out.println("Eating pizza");
		}
		else if(obj instanceof Burger) {
			System.out.println("Eating burger");
		}
		else {
			System.out.println("Invalid choice");
		}
	}

}

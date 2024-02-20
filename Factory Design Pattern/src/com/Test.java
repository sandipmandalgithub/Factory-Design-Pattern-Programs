
package com;
import java.util.Scanner;
/**
 * FDP-->FACTORY DESIGN PATTERN IS A PROCESS WHEREIN ONE METHOD CAN RETURN DIFFERENT TYPES OF OBJECTS.(GENERALIZATION OR UPCASTING)
 * 
 * -selectTransport() can return 3 diff types of objects & we cannot have 3 diff return types,
 * hence we have avoid or handle it using generalized return type.
 * 
 * -if the return type is car the method only can return car type object(specialization)
 * 
 * -if the return type is vehicle the method  can return car,bike and bus type object(Generalization)
 */

public class Test {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Wlecome to Jspider's Transport");
		System.out.println("1.Car\n2.Bike\n3.Bus");
		System.out.println("Enter your choice");
		int choice=sc.nextInt();
		Person p=new Person();
		Vehicle obj=p.selectTransport(choice);

		if(obj instanceof Car) {
			System.out.println("Choosing Car");
		}
		else if(obj instanceof Bike) {
			System.out.println("Choosing Bike");
		}
		else if(obj instanceof Bus) {
			System.out.println("Choosing Bus");
		}
		else {
			System.out.println("Invalid choice");
		}

	}

}

//SINGLE LINE COMMENT

/*
 * MULTI LINE COMMENT
 */


/**
 * DOCUMENTATION LINE COMMENT
 */



















package com;

public class Person {
	Vehicle selectTransport(int choice) {
		if(choice==1) {
			Car ca=new Car();
			return ca;
		}
		else if(choice==2) {
			Bike bi=new Bike();
			return bi;
		}
		else if(choice==3) {
			Bus bu=new Bus();
			return bu;
		}
		else {
			System.out.println("Invalid choice");
			return null;
		}
	}

}

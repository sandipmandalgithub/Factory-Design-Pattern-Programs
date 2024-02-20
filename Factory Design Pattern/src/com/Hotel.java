package com;
import java.util.Scanner;
/* IF THE RUTURN TYPE IS FOOD IT CAN RETURN DIFFERENT TYPES OF OBJECTS.
 * IF THE RUTURN TYPE WAS BIRYANI OR PIZZA OR BURGER IT MEANS IT CAN RETURN ONLY ONE SPECIFIC TYPE OF
 * OBJECT WHICH MEANS "SPECIALIZATION"
 * HENCE, THE RETURN TYPE IS FOOD IT CAN ALLOW BIRYANI,PIZZA AND BURGER OBJECTS(GENERALIZATION)
 */


public class Hotel {
	 
	Food orderFood(int choice){
		if(choice==1) {
			Biryani bi=new Biryani();
			
			return bi;
		}
		else if(choice==2) {
			Pizza pi=new Pizza();
			return pi;
		}
		else if(choice==3) {
			Burger bu=new Burger(); 
			return bu;
		}
		else {
			return null;
		}
		
	}
	 
}

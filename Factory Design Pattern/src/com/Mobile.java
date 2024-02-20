package com;

public class Mobile {
	static OnlineShoppingApp selectApp(int choice){
		if(choice==1) {
			Myntra m=new Myntra();
			return m;
		}
		else if(choice==2) {
			Amazon a=new Amazon();
			return a;
		}
		else if(choice==3) {
			Flipkart f=new Flipkart();
			return f;
		}
		else {
		return null;
		}
	}

}

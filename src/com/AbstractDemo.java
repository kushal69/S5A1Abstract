package com;

//	Abstract Class with 2 abstract method signatures
abstract class Country {
	abstract void collecttax();

	abstract void result();
}

// Class India extends Country implementing its super class abstract methods if not implemented it gives error saying add unimplemented methods
class India extends Country {
	void collecttax() {
		System.out.println("The tax of the country India is being collected");
	}

	void result() {
		System.out.println("The tax of the country India is collected");
	}
}

//Class America extends Country implementing its super class abstract methods if not implemented it gives error saying add unimplemented methods
class America extends Country {
	void collecttax() {
		System.out.println("The tax of the country America is being collected");
	}

	void result() {
		System.out.println("The tax of the country America is collected");
	}
}

//	Main Class
public class AbstractDemo {

	// Main Method
	public static void main(String[] args) {
		Country ci = new India();		//	We are creating the new instance of India with the Country Class where the implementation done in the India and 
		ci.collecttax();				//	accessing it from the Country object as it provides abstraction also
		ci.result();

		Country ca = new America();
		ca.collecttax();
		ca.result();
	}

}

package com.Oops.inheritance;

//Car is a Parent class and it has 2 Child class Benz and Audi
class Car{
	public void car() {
		System.out.println("It is a Car of type..");
}
}
//Child class Benz extends from its parent class
class Benz extends Car{
	public void brand() {
		System.out.println("Mercedes benz ");
	}
}
//Child class Audi extends from its parent class
class Audi extends Car{
	public void brand() {
		System.out.println("Audi R8");
	}
}
public class Hirarchical {

	public static void main(String[] args) {
		System.out.println("By creating Object of 'Car'/Parent class...");
		Car c1=new Car();
		c1.car(); //We can access only the parent class properties
		
		System.out.println("-----------------------------------------------------------");
		
		System.out.println("Creating Object of '1st'child class");
		Benz b1=new Benz();
		b1.car();
		b1.brand();//We can access both Child and Parent class properties

		System.out.println("-----------------------------------------------------------");
		
		System.out.println("Creating Object of '2nd'child class");
		Audi a1=new Audi();
		a1.car();
		a1.brand();//We can access both Child and Parent class properties                         
	}

}

package com.Oops.inheritance;
//Parent class//SuperClass
class Sample
{
	public void type()
	{
		System.out.println("1.Start typing");
	}
}
//SubClass inheriting from Parent class
class Sample1 extends Sample
{
	public void send()
	{
		System.out.println("2.Message sent sucessfully");
	}
}
//Subclass inheriting from its superclass
class Sample2 extends Sample1
{
	public void receive()
	{
		System.out.println("3.Message received sucessfully");
	}
}
class MultiLevel {
	public static void main(String[] args) {
		System.out.println("Program Starts... Of Sample(Parent)");
		Sample s=new Sample();
		s.type();
		//s.send();
		//s1.receive();
		System.out.println("------------------------------Program Ends...");
		System.out.println("... Of Sample1(Child of Parent)");
		Sample1 s1=new Sample1();
		s1.type();
		s1.send();
		//s1.receive();
		System.out.println("------------------------------Program Ends...");
	
		System.out.println("... Of Sample2(Child of its parent)");
		Sample2 s2=new Sample2();
		s2.type();
		s2.send();
		s2.receive();
		System.out.println("Program Ends...");
	}
}

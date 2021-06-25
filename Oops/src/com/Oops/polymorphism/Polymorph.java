package com.Oops.polymorphism;

interface Bowler{
	public void profession(); 
	}
class Speed implements Bowler{
	@Override
	public void profession() {
		System.out.println("Speed Bowler in Cricket team");
	}
}

class Spin implements Bowler{
	@Override
	public void profession() {
		System.out.println("Spin Bowler in Cricket team");
	}
}
	
class Medium implements Bowler{
	@Override
	public void profession() {
		System.out.println("Medium speed Bowler in Cricket team");
	}
}
public class Polymorph {
	public static void main(String[] args) {
		Bowler b1=new Speed();
		b1.profession();
		System.out.println("----------------------------------------");
		Bowler b2=new Spin();
		b2.profession();	
		System.out.println("----------------------------------------");
		Bowler b3=new Medium();
		b3.profession();	
	}
}


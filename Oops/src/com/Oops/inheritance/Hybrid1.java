package com.Oops.inheritance;

class Parent{
	public void test() {
		System.out.println("This is test() of Sample class");
	}
}
interface Parent1{
	public void demo();
}
interface Parent2{
	public void demo();
}

class Parent3 extends Parent implements Parent1,Parent2{
	public void demo() {
		System.out.println("This is Demo() implementation class");
	}
	public void test3() {
		System.out.println("This is test3() of Sample3 class");
	}
}


public class Hybrid1 {

	public static void main(String[] args) {
		Parent3 s3=new Parent3();
		s3.demo();
		s3.test();
		s3.test3();
	}
}


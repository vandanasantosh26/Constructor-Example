package com.constructortest;

public class ConstructorTest {

	ConstructorTest()
	{
		System.out.println("Hello");
	}
	ConstructorTest(int age)
	{
		this();
		System.out.println(age);
	}
	ConstructorTest(String name,float salary)
	{
		this(35);
		System.out.println(name + " " + salary);
	}
}


package com.constructortest;

public class Check extends ConstructorTest
{
	Check()
	{
		super("Vandana",50.00f);
		System.out.println("Hello again");
	}
	public static void main(String[] args)
	{
		Check c= new Check();
	}
}


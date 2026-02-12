package calculator;

import java.util.Scanner;

class Calculator
{
private double num1;
private double num2;

public void setValues(double n1, double n2)
{
	this.num1 = n1;
	this.num2 = n2;
}
	public double getNum1()
	{
		return num1;
	}
	public double getNum2()
	{
		return num2;
	}
}
class MyCalculator extends Calculator
{
	public double add()
	{
		return getNum1() + getNum2();
	}
	public double sub()
	{
		return getNum1()  - getNum2();
	}
}
public class Main
{
	public static void main(String[] args)
	{
		Scanner sc = new Scanner( System.in);
		Calculator calc = new Calculator();
		System.out.println("---- simple calculator---");
		
		System.out.print("enter first number:");
		double n1 = sc.nextDouble();
		
		System.out.print("enter second number");
		double n2 = sc.nextDouble();
		
		calc.setValues(n1, n2);
		
		System.out.println("choose operation");
		System.out.println("1. add");
		System.out.println("1. sub");
		int choice = sc.nextInt();
		switch (choice)
		{
		case 1: 
			System.out.println("Result: " calc.add());
			break;
			
		case 2: 
			System.out.println("Result: " calc.sub());
			break;
			default:
				System.out.println("invalid choice");
		}
		ssc.close();
	}
}


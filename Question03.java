/*
Q> WAP to take two number divide with by using Exception handling mechanism through the keyword throw?
*/


import java.util.Scanner;
import java.io.*;
class Division {
	Scanner in = new Scanner(System.in);
	int a,b;
	void input() throws IOException
	{
		System.out.println("Enter any two number");
		a = in.nextInt();
		b = in.nextInt();
	}

	void div() throws ArithmeticException
	{
		int d = a/b;
		System.out.println("Quotient : = " + d);
		throw new ArithmeticException();
	}
}

class Question03 {
	public static void main(String[] args) {
		throws Exception {
			Division z = new Division();
			z.input();
			z.div();
		}
	}
}
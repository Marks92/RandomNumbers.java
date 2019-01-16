/*
 * Mark Schuberth
 * 
 * Playing around with the pseudorandom number generator in Java.
 * Oldy but a goody. I like playing with code.
 * 
 */

import java.util.Random;

public class RandomNumbers 
{
	public static void main(String[] args)
	{
		Random generator = new Random();
		int num1;
		float num2;
		
		num1 = generator.nextInt();
		System.out.println("A random integer: " + num1);
		
		num1 = generator.nextInt(10);
		System.out.println("A random integer between 0 and 9: " + num1);
		
		num1 = generator.nextInt(10) + 1;
		System.out.println("A random integer between 1 and 10: " + num1);
		
		num1 = generator.nextInt(15) + 20;
		System.out.println("A random integer between 20 and 34: " + num1);
		
		num1 = generator.nextInt(20) - 10;
		System.out.println("A random integer between -10 and 9: " + num1);
		
		num2 = generator.nextFloat();
		System.out.println("A random float value between 0-1: " + num2);
		
		num2 = generator.nextFloat() * 6; //random float value between 0 and 5.999999
		num1 = (int)num2 + 1;
		System.out.println("From 1 to 6: " + num1);
	}
}

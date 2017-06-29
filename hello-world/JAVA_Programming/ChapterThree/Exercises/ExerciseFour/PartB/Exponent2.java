// Exponent2.java
// Isaac Ussery
// 06/18/2017

import java.util.Scanner;

public class Exponent2
{
    public static void main(String[] args)
    {
	int value, temp;
	Scanner input = new Scanner(System.in);

	System.out.println("Enter a value: ");
	value = input.nextInt();

	temp = square(value);
	System.out.println("The square of " + value + " is " + temp);
	
	temp = cube(value);
	System.out.println("The cube of " + value + " is " + temp);
    }

    public static int square(int value)
    {
	return value * value;
    }

    public static int cube(int value)
    {
	return value * square(value);
    }
}

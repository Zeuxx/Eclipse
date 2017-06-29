// Eggs.java
// Isaac Ussery
// 06/18/2017

import java.util.Scanner;

public class Eggs
{
    public static void main(String[] args)
    {
	int eggs;
	Scanner input = new Scanner(System.in);
	System.out.println("Enter the number of single eggs: ");
	eggs = input.nextInt();
	dozenCount(eggs);	
    }

    public static void dozenCount(int eggs)
    {
	int doz, rem;
	rem = eggs % 12;
	doz = eggs / 12;
	System.out.println(eggs + " eggs is " + doz + " full dozen and " + rem + " remaining.");
    }
}

package ChapterTwo;

import java.util.Scanner;

public class Room
{
    public static void main(String[] args)
    {
	// Variable Declaration
	int length, width, area;
	Scanner inputInt = new Scanner(System.in);

	// Prompt user for input
	System.out.println("Enter the width of the room:");
	width = inputInt.nextInt();
	System.out.println("Enter the length of the room:");
	length = inputInt.nextInt();
	
	inputInt.close();

	// Calculate area
	area = width * length;

	// Display Solution
	System.out.println("The area of the room is " + area);
	
    }
}

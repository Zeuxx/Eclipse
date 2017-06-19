// RoomSwing
// Isaac Ussery
// 06/15/2017

import javax.swing.JOptionPane;

public class RoomSwing
{
    public static void main(String[] args)
    {
	// Variable Declaration
	int width, length, area;

	// Prompt user for input
	/* ****---- NOTE ----****
	   The command JOptionPane.showInputDialog saves the input as a String, therefore
	   to save a
	 */
	width = Integer.parseInt(JOptionPane.showInputDialog(null, "What is the width of the room?"));
	length = Integer.parseInt(JOptionPane.showInputDialog(null, "What is the length of the room?"));

	// Calculate area
	area = length * width;

	//Display Area
	JOptionPane.showMessageDialog(null, "The area of the room is " + area);
    }
}

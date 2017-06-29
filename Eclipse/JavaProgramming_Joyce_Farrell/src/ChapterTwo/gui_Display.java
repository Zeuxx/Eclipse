package ChapterTwo;

//gui_Display
//Isaac Ussery
//04/29/2017

import javax.swing.JOptionPane;

public class gui_Display {
 public static void main(String[] args) {
	int creditDays = 30;
	JOptionPane.showMessageDialog(null, "" + creditDays);
	JOptionPane.showMessageDialog(null, "Every bill is due in " + creditDays + " days");
 }
}

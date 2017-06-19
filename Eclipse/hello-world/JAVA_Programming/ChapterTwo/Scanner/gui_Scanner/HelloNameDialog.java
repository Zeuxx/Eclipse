// HelloNameDialog
// Isaac Ussery
// 04/29/2017

import javax.swing.JOptionPane;

public class HelloNameDialog {
    public static void main(String[] args) {
	String result;
	result = JOptionPane.showInputDialog(null, "What is your name?");
	JOptionPane.showMessageDialog(null, "Hello, " + result + "!");
    }
}

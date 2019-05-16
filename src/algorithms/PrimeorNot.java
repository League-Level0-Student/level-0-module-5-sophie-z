package algorithms;

import javax.swing.JOptionPane;

public class PrimeorNot {
public static void main(String[] args) {
	String x = JOptionPane.showInputDialog("Enter a positive number between one and one million.");
	int number = Integer.parseInt(x);
	boolean l = false;
	for(int i=2; i<number; i++) {
	if(number%i==0) {
		JOptionPane.showMessageDialog(null, "The number you entered is not a prime number.");
		l = true;
		break;
	}
	}
	if(l == false) {
		JOptionPane.showMessageDialog(null, "The number you entered is a prime number.");
	}
	}
	}



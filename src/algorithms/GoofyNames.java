package algorithms;
/*
 *    Copyright (c) The League of Amazing Programmers 2013-2017
 *    Level 0
 */

import javax.swing.JOptionPane;

public class GoofyNames {
	public static void main(String[] args) {
		String goofyName = "";

		// 1. Ask the user to enter their name
String username = JOptionPane.showInputDialog("What is your name?");
		// 2. Print upper case name to the console using .toUpperCase()
		//    Run your program to see that this works.
System.out.println(username.toUpperCase());
		// 3. Loop through each character of the name (steps 4 - 6).
		//    HINT: Use .length() to determine the number of characters in the String.
System.out.println(username.length());
int usernamelength = username.length();
			// 4. Create a String variable to store the next character of the name
			//    using .substring(start, end)
			//    HINT: replace 'start' and 'end' to get String with character at i 
username.substring(0, usernamelength);
			// 5. Use MODULO to set this variable to upper case for EVEN characters
			//    and lower case for ODD characters.
for(int i = 0; i<usernamelength; i++) {
if(i%2 == 0) {
System.out.println(username.substring(i, i+1).toUpperCase());
String n = username.substring(i, i+1).toUpperCase();
goofyName = goofyName + n;
}
else {
System.out.println(username.substring(i, i+1).toLowerCase());
String n = username.substring(i, i+1).toLowerCase();
goofyName = goofyName + n;
}
}
			
			// 6. ADD this String  (containing 1 char) to the goofyName String

		// 7. Use pop-up to show user their goofy name
	JOptionPane.showMessageDialog(null, goofyName + " is your goofy name!");
	}
}




package nested_loops;

import java.util.Random;

import javax.swing.JOptionPane;

public class SkillPractice {
public static void main(String[] args) {
	SkillPractice skills = new SkillPractice();
  	skills.skill1();
  	skills.skill2();
  	skills.skill3();
  	skills.skill4();
  	skills.skill5();
}

void skill1() {
//Use pop-ups for the following.
//Ask the user how many dimes they have
String dimes = JOptionPane.showInputDialog("How many dimes do you have?");
int d = Integer.parseInt(dimes);
JOptionPane.showMessageDialog(null, "You have " + d*10 + " cents.");
//Tell them how many cents they have (hint multiply by 10)
//Ask the user how tall they are (inches)
String height = JOptionPane.showInputDialog("How tall are you (in inches, no decimals)?");
int h = Integer.parseInt(height);
if(h<36) {
	JOptionPane.showMessageDialog(null, "EAT YOUR WHEATIES!");
}
else {
	JOptionPane.showMessageDialog(null, "Hmmm...not too short...");
}
}
//If they are shorter than 36 inches, tell them to eat their Wheaties
void skill2() { 
// Write a loop to print every third number between 1 and 30 to the console 
for(int i=2; i<30; i++) {
System.out.println(i);
}
}
void skill3() { // Get a random number that is less than 20 and print it to the console 
int r = new Random().nextInt(20);
System.out.println(r);
//Get another random number that is less than 10 and print it to the console 
int random = new Random().nextInt(10);
System.out.println(random);
int s = r-random;
JOptionPane.showMessageDialog(null, "The difference between the two random numbers is " + s);
//Using a pop-up, tell the user the difference between the numbers // Hint: use subtraction 
}

void skill4() { // In a pop-up, ask the user for the city they live in 
String city = JOptionPane.showInputDialog("What city do you live in?");
if(city.equals("San Diego")) {
JOptionPane.showMessageDialog(null, "Congratulations. You live in America's finest city!");
}
else {
JOptionPane.showMessageDialog(null, "Incorrect answer. MOVE TO SAN DIEGO!");
}
//If they answered "San Diego", tell them they live in America's Finest City 
//Otherwise, tell them to move to San Diego 
//Create a variable - cars - and initialize it to the number of cars your family has. // If there are 0 cars, use a pop-up to display, "I bet you use public transportation." 
String cars = null;
int c = Integer.parseInt(cars);
c = 3;
if(c==0) {
JOptionPane.showMessageDialog(null, "HA! I bet you use public transportation!");
}
if(c==1) {
JOptionPane.showMessageDialog(null, "White Acura");
}
if(c>1) {
JOptionPane.showMessageDialog(null, "12  wheels");
}
//If there is 1 car, use a pop-up to display the make/model of the car 
//If there is more than 1 car, use a pop-up to display how many wheels the // cars have between them. 
}

void skill5() { // In a pop-up, ask the user for the name of their school 
String school = JOptionPane.showInputDialog("What school do you go to?");
JOptionPane.showMessageDialog(null, school + " is a fantastic school.");
//In another pop-up, tell the user, that their school is a fantastic school. // You must include the name of the school in the message. 
}
}
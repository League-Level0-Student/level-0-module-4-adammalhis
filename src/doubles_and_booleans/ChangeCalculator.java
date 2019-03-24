package doubles_and_booleans;
//    Copyright (c) The League of Amazing Programmers 2013-2017
//    Level 0


import javax.swing.JOptionPane;

/*
 * I have a pocket full of change. I hate doing math. Make me a program that
 * will calculate how much money I have without me having to use my brain. Then
 * make me a sandwich.
 */
public class ChangeCalculator {

	public static void main(String[] args) {

		// Ask the user how many nickels they have
		String nickles = JOptionPane.showInputDialog(null, "how many nickles do you have?");
		
		// Convert their answer to an int using Integer.parseInt()
		int Nickles = Integer.parseInt(nickles);
		int TotalOfNickles = Nickles * 5;
		// Ask the user how many dimes they have, and convert their answer
		String dimes = JOptionPane.showInputDialog(null, "how many dimes do you have?");
	
		// Ask the user how many quarters they have, and convert their answer
		int Dimes = Integer.parseInt(dimes);
		int TotalOfDimes = Dimes * 10;
		
		
		
		String quarters = JOptionPane.showInputDialog(null, "how many quarters do you have");
		
		int Quarters = Integer.parseInt(quarters);
		int TotlaOfQuarters = Quarters * 25; 
		// Calculate how much money the user has and save it in a double variable 
		int total = TotalOfDimes + TotalOfNickles + TotalOfDimes; 
		// Tell the user how much money they have
		JOptionPane.showMessageDialog(null, total);
	}
}


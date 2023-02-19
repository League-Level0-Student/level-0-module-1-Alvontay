package _03_if_else._2_remarkable;
//    Copyright (c) The League of Amazing Programmers 2013-2019

//    Level 0

import javax.swing.JOptionPane;

public class Remarkable {
	public static void main(String[] args) {

		// 1. Save something remarkable about each person in a variable.
		String bed = "can be soft sometimes ig";
		String headphones = "can play nice music sometimes";
		String water = "keeps me alive so yay";
		String chair = "can be comfortable to sit in for 8 hours during school while im bored";
		String goldfish = "tasty.";
		// 2. Ask the user to enter a name. Store their answer in a variable.
		String thing = JOptionPane.showInputDialog("what is a thing?");
		// 3. In a pop-up, tell the user what is remarkable about that person.
		if (thing.equals("bed")) {
			JOptionPane.showMessageDialog(null,bed);
		} else if (thing .equals("headphones")) {
			JOptionPane.showMessageDialog(null, headphones);
		} else if (thing .equals("water")) {
			JOptionPane.showMessageDialog(null, water);
		} else if (thing .equals("chair")) {
			JOptionPane.showMessageDialog(null,chair);
		} else if (thing .equals("goldfish")) {
			JOptionPane.showMessageDialog(null, goldfish);
		}
	}
}

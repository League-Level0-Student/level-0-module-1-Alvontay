package _04_int._1_riddler;

import javax.swing.JOptionPane;

//    Copyright (c) The League of Amazing Programmers 2013-2019
//    Level 0



public class TheRiddler {

	public static void main(String[] args) {

		// 1. Make a variable to hold the score
		int score = 0;
		// 3. Ask the user a riddle. Here are some ideas: bit.ly/some-riddles
		String question = JOptionPane.showInputDialog("What can travel around the world while staying in a corner? ");
		// 4. If they got the answer right, pop up "correct!" and increase the score by one
		if(question .equals("A stamp")) {
			JOptionPane.showMessageDialog(null, "Correct!");
			score++;
		} else {
			JOptionPane.showMessageDialog(null, "Wrong, the answer is \"A Stamp\"");		
		}
		
		question = JOptionPane.showInputDialog("What has to be broken before you can use it?");
		
		if(question .equals("An egg")) {
			JOptionPane.showMessageDialog(null, "Correct!");
			score++;
		} else {
			JOptionPane.showMessageDialog(null, "Wrong, the answer is \" An Egg\"");
		}
		
		question = JOptionPane.showInputDialog("I have brances, but no friut, trunk, or leaves. what am I?");
		
		if(question .equals("A bank")) {
			JOptionPane.showMessageDialog(null, "Correct!");
			score++;
		} else {
			JOptionPane.showMessageDialog(null, "Wrong, the answer is \"A bank\"");
		}
		
		JOptionPane.showMessageDialog(null, score);
		

		
		// 5. Otherwise, say "wrong" and tell them the answer

		// 6. Add some more riddles

		// 2. Make a pop up to show the score.
		
	}
}


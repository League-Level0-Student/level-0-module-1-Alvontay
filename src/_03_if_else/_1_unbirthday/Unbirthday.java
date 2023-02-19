package _03_if_else._1_unbirthday;

import javax.swing.JOptionPane;

public class Unbirthday {
	public static void main(String[] args) {
		String birthday = JOptionPane.showInputDialog("what is your birthday");
		if (birthday .equals("2/18/2023")) {
			JOptionPane.showMessageDialog(null,"Happy Birthday!");
		} else {JOptionPane.showMessageDialog(null, "Merry Unbirthday");}
	}
}

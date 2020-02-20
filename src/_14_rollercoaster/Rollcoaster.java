package _14_rollercoaster;

import javax.swing.JOptionPane;

public class Rollcoaster{
	


public static void main(String[] args) {
	
	String height = JOptionPane.showInputDialog("How tall are you in inches?");
	
	int answer = Integer.parseInt(height);
	
	if(answer > 48) { 
	
	
	JOptionPane.showMessageDialog(null,"You can go on the rollcoaster!");
	}
	
	else {
		JOptionPane.showMessageDialog(null," You need to grow more");
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
}
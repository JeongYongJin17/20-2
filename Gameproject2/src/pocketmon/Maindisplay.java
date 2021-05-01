package pocketmon;
import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import java.util.*;

public class Maindisplay extends JFrame{

	public Maindisplay() {
		setTitle("pocketmonster");
		setSize(400,300);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setVisible(true);
		
		add(new Rpg());
	}
	public static void main(String[] args) {
		Maindisplay a= new Maindisplay();
		// TODO Auto-generated method stub

	}

}

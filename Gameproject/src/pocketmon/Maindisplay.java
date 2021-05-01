package pocketmon;

import java.awt.*;

import javax.imageio.ImageIO;
import javax.swing.*;
import java.awt.event.*;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.*;
import javazoom.jl.player.*;

public class Maindisplay extends JFrame {
	public Maindisplay() {
	}
	private JFrame frame;
	
	public Rpg rpg=null;
	public Battle battle = null;
	
	
	public void change(String panelName) {
		if(panelName.equals("battle")) {
			getContentPane().removeAll();//프레임에서 모두 제거
			getContentPane().add(battle);//battle 패널 추가
			revalidate();
			repaint();
		}else {
			getContentPane().removeAll();//프레임에서 모두 제거
			getContentPane().add(rpg);//rpg 패널 추가
			
			// rpg패널에서 다시 키보드로 동작할수 있게 해준다.
			rpg.requestFocus();
			rpg.setFocusable(true);
			repaint();
		}	 
	}
	


	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Maindisplay window = new Maindisplay();
					window.rpg=new Rpg(window);
					window.battle=new Battle(window);
					
					window.rpg.requestFocus();
					window.rpg.setFocusable(true);
					
					window.getContentPane().add(window.rpg);
					
					window.setSize(800,800);
					
					window.setVisible(true);
					window.setDefaultCloseOperation(EXIT_ON_CLOSE);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

}

package job_10;

import javax.swing.*;



public class MenuTest extends JFrame{
	public MenuTest() {
		setTitle("Menu Test");
		setSize(400,150);
		JMenuBar menuBar=new JMenuBar();
		JMenu menu=new JMenu("File");
		menu.add(new JMenuItem("Open"));
		menu.add(new JMenuItem("Save"));
		menu.add(new JMenuItem("Exit"));
		menuBar.add(menu);
		
		menuBar.add(new JMenu("Edit"));
		menuBar.add(new JMenu("View"));
		menuBar.add(new JMenu("Tools"));
		menuBar.add(new JMenu("Help"));
		
		setJMenuBar(menuBar);
		setVisible(true);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
	}

	public static void main(String[] args) {
		MenuTest f =new MenuTest();
	}
}

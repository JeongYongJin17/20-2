package pocketmon;
import javax.swing.*;
import java.awt.*;


public class Attack extends JPanel {

	Image img;
	/**
	 * Create the panel.
	 */
	public Attack() {	ImageIcon icon = new ImageIcon("D:\\javajpg\\act.jpg");
	img = icon.getImage();

}
	public void paintComponent(Graphics g) {
		super.paintComponent(g);
		g.drawImage(img, 0, 0,159,133,this);
	}
}

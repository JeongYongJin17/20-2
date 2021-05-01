package Exercise;
import java.awt.*;
import javax.swing.*;
import javax.swing.border.Border;

import job_10.RadioButtonFrame;

import java.awt.event.*;

public class Num3 extends JPanel implements ActionListener{
	static String birdString = "bird";
	static String catString = "cat";
	static String dogString = "dog";
	static String rabbitString = "rabbit";
	static String pigString = "pig";
	
	JLabel picture;
	
	public Num3() {
		super(new BorderLayout());
		
		JRadioButton birdButton = new JRadioButton(birdString);
		birdButton.setMnemonic(KeyEvent.VK_B);
		birdButton.setActionCommand(birdString);
		birdButton.setSelected(true);
		
		JRadioButton catButton=new JRadioButton(catString);
		catButton.setMnemonic(KeyEvent.VK_C);
		catButton.setActionCommand(catString);
		
		JRadioButton dogButton = new JRadioButton(dogString);
		dogButton.setMnemonic(KeyEvent.VK_D);
		dogButton.setActionCommand(dogString);
		
		JRadioButton rabbitButton = new JRadioButton(rabbitString);
		rabbitButton.setMnemonic(KeyEvent.VK_R);
		rabbitButton.setActionCommand(rabbitString);
		
		JRadioButton pigButton =new JRadioButton(pigString);
		pigButton.setMnemonic(KeyEvent.VK_P);
		pigButton.setActionCommand(pigString);
		
		ButtonGroup group = new ButtonGroup();
		group.add(birdButton);
		group.add(catButton);
		group.add(dogButton);
		group.add(rabbitButton);
		group.add(pigButton);
		
		birdButton.addActionListener(this);
		catButton.addActionListener(this);
		dogButton.addActionListener(this);
		rabbitButton.addActionListener(this);
		pigButton.addActionListener(this);
		
		picture = new JLabel(createImageIcon("D:\\javajpg\\"+ birdString+".jpg"));
		picture.setPreferredSize(new Dimension(177,122));
		
		JPanel radioPanel = new JPanel(new GridLayout(0,1));
		radioPanel.add(birdButton);
		radioPanel.add(catButton);
		radioPanel.add(dogButton);
		radioPanel.add(rabbitButton);
		radioPanel.add(pigButton);
		
		add(radioPanel, BorderLayout.LINE_START);
		add(picture, BorderLayout.CENTER);
		setBorder(BorderFactory.createEmptyBorder(20,20,20,20));
	}

	public void actionPerformed(ActionEvent e) {
		picture.setIcon(createImageIcon("D:\\javajpg\\"+e.getActionCommand()+ ".jpg"));
	}
	
	protected static ImageIcon createImageIcon(String path) {
		return new ImageIcon(path);
	}
	public static void main(String[] args) {
		JFrame frame = new JFrame("RadioButtonDemo");
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		JComponent newContentPane = new Num3();
		newContentPane.setOpaque(true);
		frame.setContentPane(newContentPane);
		frame.pack();
		frame.setVisible(true);

	}

}

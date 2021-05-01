package Exercise;
import java.awt.*;
import javax.swing.*;
import java.awt.event.*;

public class Num4 extends JFrame{
	private int randomNum;
	private JTextField inputField;
	private JLabel guideLabel;
	private JButton retryButton;
	private JButton exitButton;
	
	public Num4() {
		super("숫자게임");
		
		JLabel infoLabel = new JLabel("숫자를 추측하시오 : ");
		inputField = new JTextField(10);
		inputField.addActionListener(new TextFieldActionListener());
		
		JPanel topPanel = new JPanel();
		topPanel.add(infoLabel);
		topPanel.add(inputField);
		
		guideLabel = new JLabel("숫자를 입력하시오.");
		guideLabel.setBackground(Color.WHITE);
		guideLabel.setOpaque(true);
		
		JPanel middlePanel = new JPanel();
		middlePanel.add(guideLabel);
		
		retryButton = new JButton("새 게임");
		exitButton = new JButton("종료");
		retryButton.addActionListener(new ButtonActionListener());
		exitButton.addActionListener(new ButtonActionListener());
		
		JPanel lowPanel = new JPanel();
		lowPanel.add(retryButton);
		lowPanel.add(exitButton);
		
		JPanel mainPanel =new JPanel();
		mainPanel.setLayout(new BoxLayout(mainPanel, BoxLayout.Y_AXIS));
		mainPanel.add(topPanel);
		mainPanel.add(middlePanel);
		mainPanel.add(lowPanel);
		add(mainPanel);
		
		setRandomNum();
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		pack();
		setVisible(true);
	}
	
	private class TextFieldActionListener implements ActionListener{
		
		public void actionPerformed(ActionEvent e) {
			
			try {
				if(Integer.parseInt(inputField.getText()) < randomNum) {
					guideLabel.setText("너무 낮습니다.");
					guideLabel.setBackground(Color.RED);
				}
				else if (Integer.parseInt(inputField.getText()) > randomNum) {
					guideLabel.setText("너무 높습니다!");
					guideLabel.setBackground(Color.RED);
				}else {
					guideLabel.setText("정답입니다!");
					guideLabel.setBackground(Color.WHITE);
				}
			}
			catch(NumberFormatException ne) {
				guideLabel.setText("잘못된 입력입니다!");
				guideLabel.setBackground(Color.RED);
			}
			inputField.selectAll();
		}
	}
	
	private class ButtonActionListener implements ActionListener{
		public void actionPerformed(ActionEvent e) {
			if(e.getSource()==retryButton) {
				setRandomNum();
				guideLabel.setText("숫자를 입력하시오.");
				inputField.setText("");
			}
			else if(e.getSource()==exitButton) {
				System.exit(0);
			}
		}
	}
	
	public int getRandomNum() {return randomNum;}
	
	public void setRandomNum() {randomNum=(int)(Math.random()*100)+1;}

	public static void main(String[] args) {
		new Num4();
	}
}

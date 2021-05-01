package Exercise;
import java.awt.*;
import javax.swing.*;
import java.awt.event.*;

public class Num2 extends JFrame implements ActionListener{
	public static final int width =600;
	public static final int height =200;
	public static final int no_of_Lines = 50;
	public static final int chars_per_line = 20;
	
	private JTextArea lan1;
	private JTextArea lan2;

	public static void main(String[] args) {
		Num2 gui = new Num2();
		gui.setVisible(true);
	}

	public Num2() {
		super("English Translator");
		
		setSize(width,height);
		
		JPanel biggerPanel = new JPanel();
		biggerPanel.setLayout(new FlowLayout());
		biggerPanel.setBackground(Color.LIGHT_GRAY);
		
		lan1 = new JTextArea("Student", no_of_Lines,chars_per_line);
		lan1.setEditable(true);
		lan1.setLineWrap(true);
		biggerPanel.add(lan1);
		
		lan2 = new JTextArea("학생", no_of_Lines, chars_per_line);
		lan2.setEditable(true);
		lan2.setLineWrap(true);
		biggerPanel.add(lan2);
		
		add(biggerPanel, BorderLayout.CENTER);
		
		JPanel buttonPanel = new JPanel();
		buttonPanel.setLayout(new FlowLayout());
		buttonPanel.setBackground(Color.LIGHT_GRAY);
		
		JButton translate = new JButton("번역");
		translate.addActionListener(this);
		buttonPanel.add(translate);
		
		
		JButton clear = new JButton("취소");
		clear.addActionListener(this);
		buttonPanel.add(clear);
		
		add(buttonPanel, BorderLayout.SOUTH);
		
	}
public void actionPerformed(ActionEvent e) {
	String buttonText=e.getActionCommand();
	
	if(buttonText.equals("번역"))
		lan2.setText(lan2.getText());
	else if (buttonText.equals("취소")) {
		lan1.setText("");
		lan2.setText("");
	}
	else
		lan2.setText("eerror occured");
	}
}


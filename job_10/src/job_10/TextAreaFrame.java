package job_10;

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class TextAreaFrame extends JFrame implements ActionListener{
	protected JTextField textField;
	protected JTextArea textArea;
	
	public TextAreaFrame() {
		setTitle("Text Area test");
		
		textField = new JTextField(30);
		textField.addActionListener(this);
		
		textArea=new JTextArea(10,30);
		textArea.setEditable(false);
		
		add(textField, BorderLayout.NORTH);
		add(textArea, BorderLayout.CENTER);
		
		pack();
		setVisible(true);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}
	
	public void actionPerformed(ActionEvent evt) {
		String text =textField.getText();
		textArea.append(text + "\n");
		textField.selectAll();
		textArea.setCaretPosition(textArea.getDocument().getLength());
	}

	
	public static void main(String[] args) {
		new TextAreaFrame();
	}
}

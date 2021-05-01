package job_10;
import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class LoginWindow extends JFrame{
	public LoginWindow() {
		setTitle("login window");
		setSize(280,150);
		
		JPanel panel =new JPanel();
		add(panel);
		
		panel.add(new JLabel("id   "));
		panel.add(new JTextField(20));
		panel.add(new JLabel("pass  "));
		panel.add(new JPasswordField(20));
		
		JButton login = new JButton("login");
		panel.add(login);
		
		JButton cancel = new JButton("cancel");
		panel.add(cancel);
		
		setVisible(true);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}
	

	public static void main(String[] args) {
		new LoginWindow();
		// TODO Auto-generated method stub

	}

}

package Exercise;
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class Num72nd implements ActionListener{
	JFrame guiframe;
	JPanel buttonpanel;
	JTextField numbercalc;
	int calcoperation =0;
	int currentcalc;
	
	public static void main(String[] args) {
		new Num72nd();

	}
	
	public Num72nd() {
		guiframe =new JFrame();
		
		guiframe.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		guiframe.setTitle("Java Calculator");
		guiframe.setSize(400,150);
		
		guiframe.setLocationRelativeTo(null);
		
		numbercalc = new JTextField();
		numbercalc.setHorizontalAlignment(JTextField.RIGHT);
		numbercalc.setEditable(false);
		
		guiframe.add(numbercalc,BorderLayout.NORTH);
		buttonpanel = new JPanel();
		
		buttonpanel.setLayout(new GridLayout(0,4,2,2));
		guiframe.add(buttonpanel, BorderLayout.CENTER);
		
		for(int i=1; i<10; i++) {
			addButton(buttonpanel, String.valueOf(i));
		}
		
		JButton addButton = new JButton("+");
		addButton.setActionCommand("+");
		
		OperatorAction subAction = new OperatorAction(1);
		addButton.addActionListener(subAction);
		
		JButton subButton = new JButton("-");
		subButton.setActionCommand("-");
		
		OperatorAction addAction = new OperatorAction(2);
		subButton.addActionListener(addAction);
		
		JButton equalsButton = new JButton("=");
		equalsButton.setActionCommand("=");
		equalsButton.addActionListener(new ActionListener()
				{
			
			public void actionPerformed(ActionEvent event) {
				if(!numbercalc.getText().isEmpty()) {
					int number = Integer.parseInt(numbercalc.getText());
					if (calcoperation==1) {
						int calculate = currentcalc + number;
						numbercalc.setText(Integer.toString(calculate));
					}else if (calcoperation==2) {
						int calculate = currentcalc - number;
						numbercalc.setText(Integer.toString(calculate));
					}
				}
			}
				});
		
		
		buttonpanel.add(addButton);
		buttonpanel.add(subButton);
		buttonpanel.add(new JButton("*"));
		buttonpanel.add(new JButton("/"));
		buttonpanel.add(new JButton("c"));
		buttonpanel.add(equalsButton);
		guiframe.setVisible(true);
	}
	
	private void addButton(Container parent, String name) {
		JButton but = new JButton(name);
		but.setActionCommand(name);
		but.addActionListener(this);
		parent.add(but);
	}
	
	public void actionPerformed(ActionEvent event) {
		String action = event.getActionCommand();
		numbercalc.setText(action);
	}
	
	private class OperatorAction implements ActionListener{
		private int operator;
		
		public OperatorAction(int operation) {
			operator = operation;
		}
		
		public void actionPerformed(ActionEvent event) {
			currentcalc = Integer.parseInt(numbercalc.getText());
			calcoperation = operator;
		}
	}

}

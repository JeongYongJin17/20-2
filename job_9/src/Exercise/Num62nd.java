package Exercise;
import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class Num62nd extends JFrame implements ActionListener{
	private JButton bt[];
	
	public Num62nd(){
		setTitle("puzzle");
		setSize(400,400);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		makeUI();
		setVisible(true);
		
	}

private void makeUI() {
	
	bt = new JButton[9];
	setLayout(new GridLayout(3,3));
	for(int i=0; i<9; i++) {
		add(bt[i] = new JButton(String.valueOf(i)));
		bt[i].setEnabled(true);
		bt[i].addActionListener(this);
	}
	bt[8].setText("");
	bt[8].setEnabled(false); 
}
private int [] nb = new int[4];	
private void findNeighbor(int id) {
	//up
	nb[0] = id -3;
	
	nb[1] = id +3;
	if(nb[1]>=9)
		nb[1] = -1;
	
	nb[2] = id -1;
	if(nb[2] < 0 || nb[2] %3==2)
		nb[2]=-1;
	
	nb[3] = id +1;
	if(nb[3] %3==0)
		nb[3] = -1;
}

public void actionPerformed(ActionEvent e) {
	JButton b = (JButton)e.getSource();
	int id;
	for(id =0;id<9;id++)
		if(b==bt[id])
			break;
	
	findNeighbor(id);
	for(int i=0; i<4;i++)
		if(nb[i]>=0&& ! bt[nb[i]].isEnabled()) {
			JButton act, inact;
			act = bt[id];
			inact =bt[nb[i]];
			inact.setText(act.getText());
			act.setText("");
			inact.setEnabled(true);
			act.setEnabled(false);
			break;
		}
			
	
	
}
	public static void main(String[] args) {
		Num62nd f = new Num62nd();

	}

}

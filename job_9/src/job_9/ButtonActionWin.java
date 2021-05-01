package job_9;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JButton;
import javax.swing.JLabel;

import java.awt.BorderLayout;
import java.awt.GridLayout;



public class ButtonActionWin extends JFrame implements ActionListener{
	private static final long serialVersionUID =1L;
	
	JButton btnOK = new JButton("OK");
	JButton btnCancel =new JButton("Cancel");
	JLabel dLb = new JLabel("클릭한버튼의 제목이 보입니다.");
	

	public ButtonActionWin() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setSize(300, 130);
		
		makeButtonAndEventHandle();
		setVisible(true);
	}
		
		public void makeButtonAndEventHandle(){
			JPanel p = new JPanel (new GridLayout(0,2));
			p.add(btnOK);
			p.add(btnCancel);
			add(p,BorderLayout.CENTER);
			add(dLb, BorderLayout.SOUTH);
			
			btnOK.addActionListener(this);
			btnCancel.addActionListener(this);
			
			
		}
		
		public void actionPerformed(ActionEvent evt){
			String strCmd = evt.getActionCommand();
			if(strCmd.equals("OK")) {
				dLb.setText("OK BUTTON");
			}
			else if (strCmd.equals("Cancel")){
				dLb.setText("Cancel Button");
			}
		}
	
		public static void main(String[] args) {
			ButtonActionWin mywin= new ButtonActionWin();
			mywin.setTitle("버튼을 뭐시기");
		}
		
		
	}


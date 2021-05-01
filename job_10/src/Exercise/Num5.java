package Exercise;
import java.awt.*;
import javax.swing.*;
import java.awt.event.*;

public class Num5 extends JPanel implements ItemListener{
	JCheckBox[] buttons = new JCheckBox[4];
	String[] fruits = { "엔진오일 교환", "자동변속기오일교환", "에어콘 필터 교환", "타이어교환"};
	int[] prices = {45000,80000,30000,100000};
	int money=0;
	JLabel label;
	
	public Num5() {
		super();
		
		for(int i=0; i<4; i++) {
			buttons[i]=new JCheckBox(fruits[i]);
			buttons[i].addItemListener(this);
		}
		for(int i=0;i<4;i++)
			add(buttons[i]);
			label=new JLabel("현재까지의 가경은"+money+"입니다.");
			label.setFont(new Font("Serif",Font.BOLD | Font.ITALIC, 30));
			add(label);
		}
		
		public void itemStateChanged(ItemEvent e) {
			Object source = e.getItemSelectable();
			for(int i=0; i<4;i++) {
				if(source == buttons[i]) {
				if(e.getStateChange()==ItemEvent.DESELECTED)
					money-=prices[i];
				else
					money+=prices[i];
				label.setText("현재까지의 가경은"+money+"입니다.");
			}
		}
	}

	public static void main(String[] args) {
		JFrame frame = new JFrame("CheckBoxDemo");
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		JComponent newContentPane = new Num5();
		newContentPane.setOpaque(true);
		frame.setContentPane(newContentPane);
		frame.setSize(500,200);
		frame.setVisible(true);
	}
}

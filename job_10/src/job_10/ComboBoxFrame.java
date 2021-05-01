package job_10;
import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class ComboBoxFrame extends JFrame implements ActionListener{
	JLabel label;
	public ComboBoxFrame() {
		setTitle("콤보 박스");
		setSize(400,200);
		
		String[] animals = {"dog", "cat", "bird"};
		JComboBox animallist =new JComboBox(animals);
		animallist.setSelectedIndex(0);
		animallist.addActionListener(this);
		
		label=new JLabel();
		label.setHorizontalAlignment(JLabel.CENTER);
		
		changePicture(animals[animallist.getSelectedIndex()]);
		add(animallist,BorderLayout.NORTH);
		add(label, BorderLayout.CENTER);
		setVisible(true);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}
	
	public void actionPerformed(ActionEvent e) {
		JComboBox cb= (JComboBox) e.getSource();
		String name =(String) cb.getSelectedItem();
		changePicture(name);
	}
	
	protected void changePicture(String name) {
		ImageIcon icon = new ImageIcon("d:\\javajpg\\"+name+".jpg");
		label.setIcon(icon);
		if (icon!=null) {
			label.setText(null);
			
		}else {
			label.setText("이미지가 발견되지 않았습니다.");
		}
	}
	public static void main(String[] args) {
		ComboBoxFrame frame = new ComboBoxFrame();

	}

}

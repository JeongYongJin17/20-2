package report;

import javax.swing.*;
import java.awt.event.*;
import java.util.*;
import java.awt.*;

public class CE2 extends JFrame{
	double Av;
	double Ie;
	double Rintot;
	double Ve;

	
	private JButton button;
	private JTextField ToAv, ToIe, ToRintot, ToVe;//Textfield Of 
	private JTextField ToR1,ToR2,ToRe,ToRc;
	
	
	
	Image img;//회로 사진 가져오기
public CE2() {
	ImageIcon icon = new ImageIcon("D:\\javajpg\\CE.png");//회로사진 가져오기
	img =icon.getImage();
	
	setTitle("CE증폭기");
	setSize(1000,400);
	setVisible(true);
	setDefaultCloseOperation(EXIT_ON_CLOSE);
	setLayout(new BorderLayout());
	
	Dpanel dp=new Dpanel();//Down panel
	Rpanel rp=new Rpanel();//Right panel
	Cpanel cp=new Cpanel();//Center panel
	add(cp,BorderLayout.CENTER);
	add(dp,BorderLayout.SOUTH);
	add(rp,BorderLayout.EAST);
	

	
	
	
	
	
	
	
	
	
	
}
	
//========================가운데 사진 넣기=================	
class Cpanel extends JPanel{
	public void paintComponent(Graphics g) {
		super.paintComponent(g);
		g.drawImage(img, 0,0,600,300,this);
	}
}
//==================================================



//===========================아래에 저항값 출력=============
class Dpanel extends JPanel{
	public Dpanel() {
	
		
		JLabel LoR1 = new JLabel("R1의 값");//Label Of R1
		add(LoR1);
		ToR1 = new JTextField(15);//Textfield Of R1을 만들고
		ToR1.setEditable(false);//사용자가 편집 불가능하게 만들었다.
		add(ToR1);
		
		JLabel LoR2 = new JLabel("R2의 값");//Label Of R2
		add(LoR2);
		ToR2 = new JTextField(15);//Textfield Of R2을 만들고
		ToR2.setEditable(false);//사용자가 편집 불가능하게 만들었다.
		add(ToR2);
		
		JLabel LoRc = new JLabel("Rc의 값");//Larbel Of Rc
		add(LoRc);
		ToRc = new JTextField(15);//Textfield Of Rc을 만들고
		ToRc.setEditable(false);//사용자가 편집 불가능하게 만들었다.
		add(ToRc);
		
		JLabel LoRe = new JLabel("Re의 값");//Larbel Of Re
		add(LoRe);
		ToRe = new JTextField(15);//Textfield Of Re을 만들고
		ToRe.setEditable(false);//사용자가 편집 불가능하게 만들었다.
		add(ToRe);
		
		
	
	}
}
//=========================================================




//===============버튼을 누르면 작동==============================
	private class ButtonListener implements ActionListener{
		public void actionPerformed(ActionEvent e) {
			if(e.getSource()==button) {//버튼이 눌리면 이벤트
				String SoAv=ToAv.getText();//String Of Av에 TextField Of Av에 입력된 문자열 가져오기
				Av=Double.parseDouble(SoAv);//Double 형으로 변환하여 Av에 대입
				ToAv.setFocusable(true);
				
				String SoIe=ToIe.getText();//String Of Ie에 TextField Of Ie에 입력된 문자열 가져오기
				Ie=Double.parseDouble(SoIe);//Double 형으로 변환하여 Ie에 대입
		
				
				String SoRintot=ToRintot.getText();//String Of Rintot에 TextField Of Rintot에 입력된 문자열 가져오기
				Rintot=Double.parseDouble(SoRintot);//Double 형으로 변환하여 Rintot에 대입
			
				
				String SoVe=ToVe.getText();//String Of Ve에 TextField Of Ve에 입력된 문자열 가져오기
				Ve=Double.parseDouble(SoVe);//Double 형으로 변환하여 Ve에 대입
				
				
				
				double Re=Ve/Ie;
				double Re1=Re/2;
				double Re2=Re/2;
				
				
				
				double R2=(1-(Ve+0.7)/(Ve-9.3))*(
						1/(
						(1/Rintot)-(
								1/(175*(25/Ie+Re1))
								)
						)
						);
				double R1=((10-(Ve+0.7))*R2)/(Ve+0.7);
				
				
				double Rc=(
						Av*(600*47000*Re1+47000*Rintot*Re1)
						/(47000*Rintot -Av*(600*Re1+Rintot*Re1))
						);
				
				
				ToR1.setText(""+R1);
				ToR2.setText(""+R2);
				ToRe.setText(""+Re);
				ToRc.setText(""+Rc);
				
				
			}
		}
	}
//==================================================================	

//=================오른쪽에 값 입력 받기=============================
	class Rpanel extends JPanel{
		public Rpanel() {
			ButtonListener listener = new ButtonListener();
			setLayout(new GridLayout(0,2,5,50));
			
			JLabel LoAv=new JLabel("원하는 Av값");
			add(LoAv);
			ToAv=new JTextField(15);
			add(ToAv);
			
			JLabel LoIe=new JLabel("원하는 Ie값(mA)");
			add(LoIe);
			ToIe=new JTextField(15);
			add(ToIe);
			
			JLabel LoRintot=new JLabel("원하는 Rin(tot)값(ohm)");
			add(LoRintot);
			ToRintot=new JTextField(15);
			add(ToRintot);
			
			JLabel LoVe=new JLabel("원하는 Ve값(v)");
			add(LoVe);
			ToVe=new JTextField(15);
			add(ToVe);
			
			
			button = new JButton("계산");
			button.addActionListener(listener);
			add(button);
			
		}
	}
//==============================================================
	
	public static void main(String[] args) {
		CE2 f =new CE2();
		
		
	}

}

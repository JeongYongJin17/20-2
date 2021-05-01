package report;

import java.awt.*;
import javax.swing.*;
import java.awt.event.*;


public class CE extends JFrame{
double R1, R2,Rs, Rc;
	double Vcc,Vbe, betaDC,betaAC;
	
	double Va;
	
	
	
	private JButton button;
	private JTextField ToR1,ToR2, ToRs, ToRc, ToVcc, ToVbe, TobetaDC, TobetaAC,ToVa;
	private JTextField ToRin, ToRout;
//========================================================
	public CE() {
		setLayout(new GridLayout(1,2));
		setSize(400,800);
		setVisible(true);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		add(new Lpanel());
		add(new Rpanel());
		
	}//public ce
//=============================================================	
	class Rpanel extends JPanel{
		public Rpanel() {
			JLabel LoRin = new JLabel("�Է�����");
			add(LoRin);
			ToRin = new JTextField(15);
			ToRin.setEditable(false);
			add(ToRin);
			
			JLabel LoRout = new JLabel("�������");
			add(LoRout);
			ToRout = new JTextField(15);
			ToRout.setEditable(false);
			add(ToRout);
		}
	}
//===========================================================
	 class Lpanel extends JPanel{
		 public Lpanel() {
			 ButtonListener listener = new ButtonListener();
			 
		JLabel LoR1=new JLabel("R1���� �Է��Ͻÿ�");
		add(LoR1);
		ToR1=new JTextField(15);
		add(ToR1);
		
		JLabel LoR2=new JLabel("R2���� �Է��Ͻÿ�");
		add(LoR2);
		ToR2=new JTextField(15);
		add(ToR2);
		
		
		JLabel LoRs=new JLabel("Rs���� �Է��Ͻÿ�");
		add(LoRs);
		ToRs=new JTextField(15);
		add(ToRs);
		
		JLabel LoRc=new JLabel("Rc���� �Է��Ͻÿ�");
		add(LoRc);
		ToRc=new JTextField(15);
		add(ToRc);
		
		JLabel LoVcc=new JLabel("Vcc���� �Է��Ͻÿ�");
		add(LoVcc);
		ToVcc=new JTextField(15);
		add(ToVcc);
		
		JLabel LoVbe=new JLabel("Vbe���� �Է��Ͻÿ�");
		add(LoVbe);
		ToVbe=new JTextField(15);
		add(ToVbe);
		
		JLabel LobetaDC=new JLabel("��dc���� �Է��Ͻÿ�");
		add(LobetaDC);
		TobetaDC=new JTextField(15);
		add(TobetaDC);
		
		JLabel LobetaAC=new JLabel("��ac���� �Է��Ͻÿ�");
		add(LobetaAC);
		TobetaAC=new JTextField(15);
		add(TobetaAC);
		
		JLabel LoVa=new JLabel("Va���� �Է��Ͻÿ�");
		add(LoVa);
		ToVa=new JTextField(15);
		add(ToVa);
		
		
		
		button = new JButton("���");
		button.addActionListener(listener);
		add(button);
		 }
	}//�г�
//========================================================
	private class ButtonListener implements ActionListener{
		public void actionPerformed(ActionEvent e) {
			if(e.getSource()==button){
				
				
				
				
				
				
				
				String SoR1=ToR1.getText();
				R1=Double.parseDouble(SoR1);//R1�� �ҷ��ͼ� ����
				ToR1.setFocusable(true);
				
				String SoR2=ToR2.getText();
				
				
				R2=Double.parseDouble(SoR2);
				String SoRs=ToRs.getText();
				Rs=Double.parseDouble(SoRs);
				String SoRc=ToRc.getText();
				Rc=Double.parseDouble(SoRc);
				String SoVcc=ToVcc.getText();
				Vcc=Double.parseDouble(SoVcc);
				String SoVbe=ToVbe.getText();
				Vbe=Double.parseDouble(SoVbe);
				String SobetaDC=TobetaDC.getText();
				 betaDC=Double.parseDouble(SobetaDC);
				String SobetaAC=TobetaAC.getText();
				 betaAC=Double.parseDouble(SobetaAC);
				String SoVa=ToVa.getText();
				 Va=Double.parseDouble(SoVa);
				
				
				
				
				
				 double Rp=1/((1/R1)+(1/R2));
				 double Vt=26;
					double Icq=betaDC*
							(
									(
											(
													Vcc*
													(R2/(R1+R2))
													)-Vbe)/Rp);
					double gm=Icq/Vt;
					double rpie = betaAC/(gm*1000);//A/V�� mA�� �����ֱ� ���ؼ� 10��3���� gm�� ���ߴ�.
					double ro = Va/Icq;
					double Rin=1/(
							(1/R1)
							+(1/R2)
							+(1/rpie));
					double Rout=1/(
							(1/ro)
							+(1/Rc)
							);
				
				
				
				
				ToRin.setText(" "+Rin);
				ToRout.setText(""+Rout);
			}//if��
		}//�̺�Ʈ e
	}//������
	
	public static void main(String[] args) {
		new CE();
		// TODO Auto-generated method stub

	}//static void
}//publicclass ce


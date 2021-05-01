package pocketmon;
import java.awt.*;
import javax.swing.*;
import java.awt.event.*;

public class Battle extends JPanel implements Runnable{
	int turn=0;//Ai와 사용자의 차례를 구분하기 위함
	
	//프레임이 있는 클래스와 연동
	private Maindisplay window;
	//쓰레드 선언
	Thread tr = new Thread(this);
//포켓몬들의 hp와 방어력
	int hp1=1000,hp2=5000,shield=0;
	//각각 수치와 메세지를 출력핳 텍스트 필드
	private JTextField textField;
	private JTextField textField_1;
	private JTextField textField_2;
	//패널을 이용해서 따로 만들었다.
	PikachuP pp = new PikachuP();//피카츄 기본사진
	ArceusP ap = new ArceusP();//아르세우스 기본 사진
	MballP bp = new MballP();//마스터볼 사진
	Readyform rf = new Readyform();//기모으는 사진
	Tenvolt tv=new Tenvolt();//10만볼트 사진
	Attack at = new Attack();//심판의 뭉치 사진
	Shield sh = new Shield();//방어 사진
	//arceus status & pikachu status
	int astat=0, pstat=0;
	
	
	/**
	 * Create the panel.
	 */
	public void doit() {
		try {	
			Thread.sleep(350);//화면에 출력되는 속도를 조절하기 위해서
		} catch (InterruptedException e) {}
		
		textField_2 = new JTextField();
			setLayout(null);
			//최초 1회에만 출력할 메세지
			if(turn==0)
				textField_2.setText("아르세우스가 나타났다!!!");
			
			//10만 볼트 버튼
			JButton btnNewButton = new JButton("10만볼트");
			btnNewButton.setBounds(24, 290, 114, 49);
			add(btnNewButton);
			
			//방어버튼
			JButton btnNewButton_1 = new JButton("방어");
			btnNewButton_1.setBounds(184, 290, 135, 49);
			add(btnNewButton_1);
			
			//마스터볼 버튼
			JButton btnNewButton_2 = new JButton("마스터볼");
			btnNewButton_2.setBounds(379, 290, 129, 49);
			add(btnNewButton_2);
			
			//돌아가는 버튼
			JButton btnNewButton_3 = new JButton("돌아간다.");
			btnNewButton_3.setBounds(560, 290, 135, 49);
			add(btnNewButton_3);
			
			//hp라벨 생성
			JLabel lblNewLabel_1 = new JLabel("hp");
			lblNewLabel_1.setBounds(12, 10, 50, 15);
			add(lblNewLabel_1);
			JLabel lblNewLabel_2 = new JLabel();
			lblNewLabel_2.setText("hp");
			lblNewLabel_2.setBounds(560, 10, 50, 15);
			add(lblNewLabel_2);
			
			
			textField_2.setEditable(false);
			textField_2.setBounds(0, 214, 718, 49);
			add(textField_2);
			textField_2.setColumns(10);
			
			
			textField_1 = new JTextField();
			textField_1.setEditable(false);
			textField_1.setBounds(46, 7, 50, 21);
			if(turn==0)
				textField_1.setText(""+hp1);
			add(textField_1);
			textField_1.setColumns(10);	

			//10만볼트 버튼을 누를때
			btnNewButton.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e) {
					hp2-=50;//아르세우스의 hp감소
					
					switch(turn%4) {//내차례에만 작동시키기 위해서
					//메세지 및 아르세우스 hp수치 변경
					case 0: {
					textField_2.setText("피카츄는 10만볼트를 썼다.");
					textField.setText(""+hp2);
					System.out.println(""+hp2);
					pstat=1;//피카츄의 이미지의 상태를 바꾼다.
					turn++;//다음 턴으로 돌린다.
					break;
					}
					case 2: {
					textField_2.setText("피카츄는 10만볼트를 썼다.");
					textField.setText(""+hp2);
					System.out.println(""+hp2);
					pstat=1;
					turn++;
					break;
					}
					}
				}
			});
			
			//방어버튼을 눌렀을때 메세지및 이미지변경
			btnNewButton_1.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e) {
					shield=100;//아르세우스의 공격을 무효화 시킬수 있는 방어
					textField_2.setText("피카츄가 방어를 사용했다.");
					pstat=2;//피카츄의 이미지 상태 변경
					turn++;//턴 증가
				}
				});
			
			//마스터볼 버튼을 눌렀을때 메세지 및 이미지 변경
			btnNewButton_2.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e) {
					textField_2.setText("포획에 성공했다!");
					astat=3;//아르세우스의 이미지 변경
					//돌아가기 이외의 버튼들을 비활성화
					btnNewButton.setEnabled(false);
					btnNewButton_1.setEnabled(false);
					btnNewButton_2.setEnabled(false);
				}
			});
			
			//돌아가기 버튼을 눌렀을때 동작
			btnNewButton_3.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e) {
					window.change("rpg");
				}
			});
			
			
		//hp수치를 출력할 텍스트필드
			textField = new JTextField();
			textField.setBounds(606, 7, 50, 21);
			textField.setEditable(false);
			//처음에만 처음 수치 그대로 출력
			if(turn==0)
				textField.setText(""+hp2);
			add(textField);
			textField.setColumns(10);
		
			//피카츄 hp의 원래 수치
			JLabel label = new JLabel("/1000");
			label.setBounds(110, 10, 50, 15);
			add(label);
			//아르세우스 hp원래 수치
			JLabel label_1 = new JLabel("/50000");
			label_1.setBounds(668, 10, 50, 15);
			add(label_1);
			
			
			System.out.println("턴은"+turn);
			
		//배틀에서 이기거나 비겼을때
			if(hp2==0) {
				try {
					Thread.sleep(350);//화면에 출력되는 속도를 조절하기 위해서
				} catch (InterruptedException e1) {}
				textField_2.setText("아르세우스와의 배틀에서 이겼다.");
				btnNewButton.setEnabled(false);
				btnNewButton_1.setEnabled(false);
				btnNewButton_2.setEnabled(false);
			}else if(hp1==0) {
				try {
					Thread.sleep(350);
				} catch (InterruptedException e1) {}
				textField_2.setText("아르세우스와의 배틀에서 패배했다.");
			btnNewButton.setEnabled(false);
			btnNewButton_1.setEnabled(false);
			btnNewButton_2.setEnabled(false);
			}
			pikachuaction();
			message();
			arceusaction();
	}
	
//아르세우스 차례일때의 동작
	public void message() {
		try {	
			Thread.sleep(350);//화면에 출력되는 속도를 조절하기 위해서
		} catch (InterruptedException e) {}
		switch(turn%4) {
		case 1: {
			textField_2.setText("아르세우스가 기를 모은다.");
			astat=1;//이미지를 바꾼다
			turn++;
			break;
		}
		case 3: {
			
			textField_2.setText("아르세우스의 심판의 뭉치!!");
			hp1=hp1-100+shield;//피카츄의 hp감소
			textField_1.setText(""+hp1);
			shield =0;//방어 초기화
			astat=2;//이미지를 바꾼다.
			turn++;
			break;
		}
	}
	}
	
	//==============피카츄 이미지======================
	public void pikachuaction() {
		try {	
			Thread.sleep(350);//화면에 출력되는 속도를 조절하기 위해서
		} catch (InterruptedException e) {}
		
		switch(pstat) {
		case 0: 
			pp.setVisible(true);
			tv.setVisible(false);
			sh.setVisible(false);
			break;
		case 1:
			pp.setVisible(false);
			tv.setVisible(true);
			sh.setVisible(false);
			pstat=0;
			break;
		case 2:
			pp.setVisible(false);
			tv.setVisible(false);
			sh.setVisible(true);
			pstat=0;
			break;
		}

	}
	//==========피카츄 이미지==========================		
	
	
	//=============아르세우스 이미지 =======================
	public void arceusaction() {
		try {	
			Thread.sleep(350);//화면에 출력되는 속도를 조절하기 위해서
		} catch (InterruptedException e) {}

		switch(astat) {
		case 0:
			ap.setVisible(true);
			bp.setVisible(false);
			rf.setVisible(false);
			at.setVisible(false);
			break;
		
		case 1:
			ap.setVisible(false);
			rf.setVisible(true);
		break;
		
		case 2:
			ap.setVisible(false);
			rf.setVisible(false);
			at.setVisible(true);
			astat=0;
			break;
		case 3:
			ap.setVisible(false);
			bp.setVisible(true);
			rf.setVisible(false);
			at.setVisible(false);
			break;
		}
	}
	//=================아르세우스 이미지======================
	
	
	
	public Battle(Maindisplay window) {
		this.window=window;
		
		tr.start();//쓰레드시작
		setVisible(true);
	}


	@Override
	public void run() {
		
		//피카츄 기본 이미지
		pp.setLocation(12, 59);
		pp.setSize(148, 150);
		add(pp);
		
		//아르세우스 기본 이미지
		ap.setLocation(559, 59);
		ap.setSize(159, 139);
		add(ap);
		
		//마스터볼 이미지
		bp.setLocation(559, 59);
		bp.setSize(159, 139);
		bp.setVisible(false);
		add(bp);
		
		//아르세우스 기모으는 이미지
		rf.setLocation(559, 59);
		rf.setSize(159, 139);
		rf.setVisible(false);
		add(rf);
		
		//피카츄 10만볼트 이미지
		tv.setLocation(12, 59);
		tv.setSize(148, 150);
		tv.setVisible(false);
		add(tv);
		
		//아르세우스 심판의 뭉치 이미지
		at.setLocation(559, 59);
		at.setSize(159, 139);
		at.setVisible(false);
		add(at);
		
		//피카츄 방어 이미지
		sh.setLocation(12, 59);
		sh.setSize(148, 150);
		sh.setVisible(false);
		add(sh);

		
		 
		while(true) {
			doit();
			try {	
				Thread.sleep(10);
			} catch (InterruptedException e) {}
		}
	}
}


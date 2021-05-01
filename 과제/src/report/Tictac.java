package report;
import java.awt.*;
import javax.swing.*;
import java.awt.event.*;


public class Tictac extends JFrame{
	//버튼을 9개 생성해내기 위해 배열 사용
	JButton[] bt = new JButton[9];
	//차례를 구분하는 목적과 버튼에 새길 기호
	char turn ='x';
	public Tictac() {
		
		for(int i=0;i<9;i++) {
			//버튼 생성
			bt[i]=new JButton();
			//버튼에 기능추가
			bt[i].addActionListener(new list());
			//버튼의 클씨체를 설정
			bt[i].setFont(new Font("Arial",Font.BOLD, 55));
			add(bt[i]);//버튼 추가
		}
		
		
		//컨테이너의 크기 설정
		setSize(400,400);
		setTitle("Tic Tac Toe");//제목 설정
		//배치 관리자를 GridLayout사용
		setLayout(new GridLayout(3,3,3,3));
		//눈에 보이게 창을 화면에 출력한다.
		setVisible(true);	
	}
//기능을 설정해준다
	class list implements ActionListener{
		public void actionPerformed(ActionEvent e) {
			for(int j=0;j<9;j++) {
				//버튼이 클릭 되면 
				//그 버튼이 어떤 버튼인지 인식
				//빈칸인지를 판단
			if(e.getSource()==bt[j] &&bt[j].getText().equals("")==true) {
				if(turn=='x') {//X차례이면
					//클릭된 버튼에 X를 넣는다.
					bt[j].setText("x");
					//차례를 O으로 바꾼다.
					turn='o';
					
				}//turn x if end
				else { //버튼이 클릭되면 버튼에 O를 넣는다.
					bt[j].setText("0");
					//차례를 X로 넘긴다.
					turn='x';
					
				}//turn o if end
			}
			}
			
		}
	}
	
	
	
	
	public static void main(String[] args) {
		Tictac t =new Tictac();//실행한다.
		

	}

}

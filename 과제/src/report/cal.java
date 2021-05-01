package report;
import javax.swing.*;
import java.awt.*;

public class cal extends JFrame{
	public cal() {
		
		setTitle("계산기");//JFrame의 제목
		//창을 닫으면 프로그램 종료
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE );
		//뒤 배경을 하얀색으로
		setBackground(Color.white);
		//컨테이너 선언
		Container c = getContentPane();
		//컨테이너 배치 관리자를 BorderLayout으로 설정
		c.setLayout(new BorderLayout());
		
		//northpanel을 위에 넣기
		NorthPanel np = new NorthPanel();
		c.add(np,BorderLayout.NORTH);
		
		//centerpanel을 가운데에 넣기
		CenterPanel cp=new CenterPanel();
		c.add(cp,BorderLayout.CENTER);
		//크기 설정
		setSize(600,300);
		//창이 보이도록
		setVisible(true);
	}

	
	

//centerpanel클래스에 대한 내용
 class CenterPanel extends JPanel{
	public CenterPanel(){
		//버튼을 배열로 받는 다. 이때 글자의 색상을 정할때 편의를 위해 
		//bt[0]건너뛸예정이다.
		JButton[] bt= new JButton[26];
	//그리드레이웃을 쓴다. 각 버튼의 간격은 3이다.
	GridLayout grid = new GridLayout(5,5,3,3);
	//밑에서 글자의 색을 정할떄
	//5로 나누었을 때의 나머지를 쉽게 이용하기위해서 배열을 1부터 받았다.
		bt[1]=new JButton("Backspace");
		bt[2]=new JButton("");
		bt[3]=new JButton("");
		bt[4]=new JButton("CE");
		bt[5]=new JButton("C");
		bt[6]=new JButton("7");
		bt[7]=new JButton("8");
		bt[8]=new JButton("9");
		bt[9]=new JButton("/");
		bt[10]=new JButton("sqrt");
		bt[11]=new JButton("4");
		bt[12]=new JButton("5");
		bt[13]=new JButton("6");
		bt[14]=new JButton("*");
		bt[15]=new JButton("%");
		bt[16]=new JButton("1");
		bt[17]=new JButton("2");
		bt[18]=new JButton("3");
		bt[19]=new JButton("-");
		bt[20]=new JButton("1/X");
		bt[21]=new JButton("0");
		bt[22]=new JButton("+/-");
		bt[23]=new JButton(".");
		bt[24]=new JButton("+");
		bt[25]=new JButton("=");
															
		
		setLayout(grid);
	
	//버튼의 색을 노란색으로
		for(int i=1;i<26;i++) {
			bt[i].setBackground(Color.yellow);
			
//각 줄의 마지막 버튼과 마지막에서 두번쨰 버튼의 글자만 빨강으로
			if(i%5 ==4 || i%5==0) {
				bt[i].setForeground(Color.red);	
			}
			//나머지버튼의 글자는 파란색으로
			else bt[i].setForeground(Color.blue);
			//버튼을 추가
			add(bt[i]);
		}
	}
 }
	
//northpanel을 클래스에 대한 내용
 class NorthPanel extends JPanel{
	
		public NorthPanel(){
	//testfield를 크기를 틀에 맞추기 위해서
		setLayout(new GridLayout(0,1));
		add(new JTextField(" "));

	}
	}

 public static void main(String[] args) {
		cal t= new cal();
		

	}
 }


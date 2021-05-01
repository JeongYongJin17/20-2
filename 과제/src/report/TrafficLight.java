package report;
import java.awt.*;
import javax.swing.*;
import java.awt.event.*;
import java.util.*;

public class TrafficLight extends JFrame {
	public TrafficLight() {
		setSize(500,200);	//프레임의 크기지정
		setVisible(true);	//창을 띠운다
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);//창을 닫으면 종료한다.
		
		add(new MyPanel());//MyPanel을 추가한다.
	}
		
		
		
	class MyPanel extends JPanel implements ActionListener{//패널로 만들며 맥션리스너로 이벤트발생
		int light_number=0;//0일 경우 빨간불, 1일경우 노란불, 3일경우 파란불
		public MyPanel() {
			setLayout(new BorderLayout());//버튼을 밑으로 보내기위해서
			JButton b = new JButton("신호 변경");
			b.addActionListener(this);//버튼에 기능추가
			add(b,BorderLayout.SOUTH);//버튼을 밑으로
		}
		@Override
		protected void paintComponent(Graphics g){//신호등 그림
			super.paintComponent(g);
			if(light_number==0) {//빨간불
				g.setColor(Color.RED);//색은 빨간색
			g.fillOval(100,0,100,100);//속이 채워진 원
			g.setColor(Color.BLACK);//다시 색을 검정색
			g.drawOval(200, 0, 100, 100);//속이 뚤린 원
			g.drawOval(300, 0, 100, 100);
			
		}
			else if(light_number==1) {//노란불
				g.setColor(Color.BLACK);//검정색
			g.drawOval(100,0,100,100);//속이 뚤린 원
			g.setColor(Color.YELLOW);//색은 노란색
			g.fillOval(200, 0, 100, 100);//속이 채워진 원
			g.setColor(Color.BLACK);//색은 검정색
			g.drawOval(300, 0, 100, 100);//속이 뚤린 원
			
		}
			
			else{//파란불
				g.setColor(Color.BLACK);//색은 검정색
			g.drawOval(100,0,100,100);//속이 뚤린 원
			g.drawOval(200, 0, 100, 100);
			g.setColor(Color.GREEN);//색은 녹색
			g.fillOval(300, 0, 100, 100);}//속이 채워진 원
			}
			
		
		@Override
		public void actionPerformed(ActionEvent arg0) {//버튼을 누르면 실행
			
			light_number++;//litght_number의 값을 1증가시킨다
			repaint();//증가된 값을 가지고 다시 그린다.
			
			if (light_number>=3)//신호등은 빨노초 세가지 색이므로 3을 넘어가지 않게 해준다. 
				light_number =0;
			repaint();
		}
	}
		
		
	public static void main(String[] args) {
		TrafficLight f =new TrafficLight();//실행한다.
	}

}
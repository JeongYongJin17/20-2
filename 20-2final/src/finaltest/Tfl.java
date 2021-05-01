package finaltest;
import javax.swing.*;
import javax.swing.border.EmptyBorder;

import java.awt.*;
//import java.awt.event.*;


public class Tfl extends JFrame implements Runnable{

	private JPanel contentPane;
	int s;//status(상태)를 구분하기 위함
	Thread tr = new Thread(this);//쓰레드를 사용하기 위함
	
	//신호등 1번
	Red r=new Red();//적신호
	Green g = new Green();//청신호
	Yellow y = new Yellow();//황신호
	Left l =new Left();//좌회전신호
	
	//신호등 2번
	Red r1=new Red();
	Green g1 = new Green();
	Yellow y1 = new Yellow();
	Left l1 =new Left();

	//신호등 3번
	Red r2=new Red();
	Green g2 = new Green();
	Yellow y2 = new Yellow();
	Left l2=new Left();
	
	//신호등 4번
	Red r3=new Red();
	Green g3 = new Green();
	Yellow y3 = new Yellow();
	Left l3 =new Left();
	
	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Tfl frame = new Tfl();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 */
	public Tfl() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 670, 586);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		
		
		tr.start();
	}
	
	
	public void stat() {//1번 신호등의 상태
		switch(s%8) {//총 8가지의 경우가 존재한다.
		//1. 청신호
		case 0: r.setVisible(false);
		y.setVisible(false);
		g.setVisible(true);
		l.setVisible(false);
		break;
		//2. 황신호
		case 1: r.setVisible(false);
		y.setVisible(true);
		g.setVisible(false);
		l.setVisible(false);
		break;
		//3. 좌회전 신호
		case 2: r.setVisible(false);
		y.setVisible(false);
		g.setVisible(false);
		l.setVisible(true);
		break;
		//4. 황신호
		case 3: r.setVisible(false);
		y.setVisible(true);
		g.setVisible(false);
		l.setVisible(false);
		break;
		//5. 적신호
		case 4: r.setVisible(true);
		y.setVisible(false);
		g.setVisible(false);
		l.setVisible(false);
		break;
		//6. 적신호유지
		case 5: r.setVisible(true);
		y.setVisible(false);
		g.setVisible(false);
		l.setVisible(false);
		break;
		//7. 적신호유지
		case 6: r.setVisible(true);
		y.setVisible(false);
		g.setVisible(false);
		l.setVisible(false);
		break;
		//8. 황신호
		case 7:r.setVisible(false);
		y.setVisible(true);
		g.setVisible(false);
		l.setVisible(false);
		break;
		}
	}
	
	public void stat1() {// 2번 신호등의 상태
		switch(s%8) {//총 8가지 경우가 존재한다.
		//1. 적신호
		case 0: r1.setVisible(true);
		y1.setVisible(false);
		g1.setVisible(false);
		l1.setVisible(false);
		break;
		//2. 적신호 유지
		case 1: r1.setVisible(true);
		y1.setVisible(false);
		g1.setVisible(false);
		l1.setVisible(false);
		break;
		// 3.적신호 유지
		case 2: r1.setVisible(true);
		y1.setVisible(false);
		g1.setVisible(false);
		l1.setVisible(false);
		break;
		//4. 황신호
		case 3: r1.setVisible(false);
		y1.setVisible(true);
		g1.setVisible(false);
		l1.setVisible(false);
		break;
		//5. 청신호
		case 4: r1.setVisible(false);
		y1.setVisible(false);
		g1.setVisible(true);
		l1.setVisible(false);
		break;
		//6. 황신호
		case 5: r1.setVisible(false);
		y1.setVisible(true);
		g1.setVisible(false);
		l1.setVisible(false);
		break;
		//7. 좌회전 신호
		case 6: r1.setVisible(false);
		y1.setVisible(false);
		g1.setVisible(false);
		l1.setVisible(true);
		break;
		//8. 황신호
		case 7: r1.setVisible(false);
		y1.setVisible(true);
		g1.setVisible(false);
		l1.setVisible(false);
		break;
		}
	}
	
	public void stat2() {//신호등 3번의 상태는 신호등 2번과 동일하다.
		switch(s%8) {
		case 0: r2.setVisible(true);
		y2.setVisible(false);
		g2.setVisible(false);
		l2.setVisible(false);
		break;
		case 1: r2.setVisible(true);
		y2.setVisible(false);
		g2.setVisible(false);
		l2.setVisible(false);
		break;
		case 2: r2.setVisible(true);
		y2.setVisible(false);
		g2.setVisible(false);
		l2.setVisible(false);
		break;
		case 3: r2.setVisible(false);
		y2.setVisible(true);
		g2.setVisible(false);
		l2.setVisible(false);
		break;
		case 4: r2.setVisible(false);
		y2.setVisible(false);
		g2.setVisible(true);
		l2.setVisible(false);
		break;
		case 5: r2.setVisible(false);
		y2.setVisible(true);
		g2.setVisible(false);
		l2.setVisible(false);
		break;
		case 6: r2.setVisible(false);
		y2.setVisible(false);
		g2.setVisible(false);
		l2.setVisible(true);
		break;
		case 7: r2.setVisible(false);
		y2.setVisible(true);
		g2.setVisible(false);
		l2.setVisible(false);
		break;
		}
	}
	
	public void stat3() {//4번신호등은 1번 신호등과 상태가 동일하다.
		switch(s%8) {
		case 0: r3.setVisible(false);
		y3.setVisible(false);
		g3.setVisible(true);
		l3.setVisible(false);
		break;
		case 1: r3.setVisible(false);
		y3.setVisible(true);
		g3.setVisible(false);
		l3.setVisible(false);
		break;
		case 2: r3.setVisible(false);
		y3.setVisible(false);
		g3.setVisible(false);
		l3.setVisible(true);
		break;
		case 3: r3.setVisible(false);
		y3.setVisible(true);
		g3.setVisible(false);
		l3.setVisible(false);
		break;
		case 4: r3.setVisible(true);
		y3.setVisible(false);
		g3.setVisible(false);
		l3.setVisible(false);
		break;
		case 5: r3.setVisible(true);
		y3.setVisible(false);
		g3.setVisible(false);
		l3.setVisible(false);
		break;
		case 6: r3.setVisible(true);
		y3.setVisible(false);
		g3.setVisible(false);
		l3.setVisible(false);
		break;
		case 7: r3.setVisible(false);
		y3.setVisible(true);
		g3.setVisible(false);
		l3.setVisible(false);
		break;
		}
	}

	@Override
	public void run() {
		r.setBounds(205, 306, 201, 58);
		contentPane.add(r);
		g.setBounds(205, 306, 201, 58);
		contentPane.add(g);
		y.setBounds(205, 306, 201, 58);
		contentPane.add(y);
		l.setBounds(205, 306, 201, 58);
		contentPane.add(l);
		r1.setBounds(12, 152, 201, 58);
		contentPane.add(r1);
		
		g1.setBounds(12, 152, 201, 58);
		contentPane.add(g1);
		y1.setBounds(12, 152, 201, 58);
		contentPane.add(y1);
		l1.setBounds(12, 152, 201, 58);
		contentPane.add(l1);
		r2.setBounds(455, 152, 201, 58);
		contentPane.add(r2);
		
		g2.setBounds(455, 152, 201, 58);
		contentPane.add(g2);
		y2.setBounds(455, 152, 201, 58);
		contentPane.add(y2);
		l2.setBounds(455, 152, 201, 58);
		contentPane.add(l2);
		
		r3.setBounds(174, 31, 201, 58);
		contentPane.add(r3);
	
		y3.setBounds(174, 31, 201, 58);
		contentPane.add(y3);
		g3.setBounds(174, 31, 201, 58);
		contentPane.add(g3);
		l3.setBounds(174, 31, 201, 58);
		contentPane.add(l3);
		
		
		
		
		
		
		while(true) {
			
		stat();
		stat1();
		stat2();
		stat3();
		s++;
		try {	
			Thread.sleep(1000);
		} catch (InterruptedException e) {}
		
		}
	}



	

}

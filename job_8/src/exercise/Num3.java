package exercise;
import java.awt.*;
import javax.swing.*;

public class Num3 extends JFrame{
	public Num3() {
		setSize(400,200);
		setTitle("My Frame");
	

	
	JPanel jp1=new JPanel();
	JPanel jp2=new JPanel();
	JPanel jp3=new JPanel();
	
	
	JLabel jl=new JLabel("자바 호텔에 오신 것을 환영 합니다. 숙박일수를 입력하세요.");
	JButton bt1= new JButton("1일");
	JButton bt2= new JButton("2일");
	JButton bt3= new JButton("3일");
	JButton bt4= new JButton("4일");
	JButton bt5= new JButton("5일");
	
	
	jp1.add(jl);
	
	jp2.add(bt1);
	jp2.add(bt2);
	jp2.add(bt3);
	jp2.add(bt4);
	jp2.add(bt5);
	
	
	jp3.add(jp1);
	jp3.add(jp2);
	jp3.setLayout(new FlowLayout());
	
	add(jp3);
	
	setVisible(true);
	}
	public static void main(String[] args) {
		Num3 t =new Num3();
		// TODO Auto-generated method stub

	}
	
}

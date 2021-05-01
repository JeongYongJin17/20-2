package report;
import javax.swing.*;
import java.awt.event.*;
import java.awt.*;

public class Pizza extends JFrame{
	public Pizza() {
		setSize(400,200);//크기 지정
		setTitle("피자 주문");//제목 지정
		//welcome 클래스를 패널로써 위에 배치
		JPanel Welcome=new Welcome();
		add(Welcome,BorderLayout.NORTH);
		//Type 클래스를 패널로써 왼쪽에 배치
		JPanel Type =new Type();
		add(Type,BorderLayout.WEST);
		//Toping 클래스를 패널로써 가운데 배치
		JPanel Topping = new Topping();
		add(Topping,BorderLayout.CENTER);
		//Size 클래스를 패널로써 오른쪽에 배치
		JPanel Size=new Size();
		add(Size,BorderLayout.EAST);
		//Order클래스를 패널로써 밑에 배치
		JPanel Order=new Order();
		add(Order,BorderLayout.SOUTH);
		
		setVisible(true);//눈에 보이게 화면을 창을 띠운다.
		//창을 닫드면 프로그램을 종료
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}
//==========Welcome 클래스 작성======================
	class  Welcome extends JPanel{
		private JLabel m;//헤이블 선언
		public Welcome() {
			//레이블에 내용 대입
			m=new JLabel("자바 피자에 오신것을 환영합니다..");
			//레이블을 패널에 추가.
			add(m);
		}
	}
//=========Type클래스  작성===========================
	class Type extends JPanel{
		//라디오 버튼들을 선언
		private JRadioButton combo,potato,bulgogi;
		public Type() {
			//배치관리자를 GridLayout으로
			setLayout(new GridLayout(3,1));
			//라디오 버튼들을 제작
			combo = new JRadioButton("콤보",true);
			potato = new JRadioButton("포테이토");
			bulgogi = new JRadioButton("불고기");
			//라디오버튼을 넣을 버튼그룹 생성
			ButtonGroup bg = new ButtonGroup();
			//위에서 만든 라디오 버튼들을 그룹 안에 넣는다.
			bg.add(combo);
			bg.add(potato);
			bg.add(bulgogi);
			//그룹의 이름을 지정한다.
			setBorder(BorderFactory.createTitledBorder("종류"));
			add(combo);
			add(potato);
			add(bulgogi);
		}
	}
//===========Toping 클래스====================
	class Topping extends JPanel{
		//라디오 버튼을 선언한다.
		private JRadioButton pimang,cheeze,pepe,bacon;
		public Topping() {
			//배치관리자를 GridLayout으로 설정
			setLayout(new GridLayout(4,1));
			//라디오 버튼들을 만들어 준다.
			pimang = new JRadioButton("피망",true);
			cheeze=new JRadioButton("치즈");
			pepe=new JRadioButton("페페로니");
			bacon=new JRadioButton("베이컨");
			//버튼 그룹을 만든다.
			ButtonGroup bg =new ButtonGroup();
			//버튼들을 그룹에 추가한다.
			bg.add(pimang);
			bg.add(cheeze);
			bg.add(pepe);
			bg.add(bacon);
			setBorder(BorderFactory.createTitledBorder("쿠가토핑"));
			add(pimang);
			add(cheeze);
			add(pepe);
			add(bacon);
		}
	}
//==============Size클래스를 생성=========================
	class Size extends JPanel{
		//라디오 버튼 선언
		private JRadioButton small,medium,large;
		public Size() {
			//배치 관리자를 GridLayout으로 설정
			setLayout(new GridLayout(3,1));
			//라딛오 버튼을 생성한다.
			small = new JRadioButton("Small",true);
			medium=new JRadioButton("Medium");
			large = new JRadioButton("large");
			//버튼 그룹을 생성
			ButtonGroup bg=new ButtonGroup();
			//버튼 그룹에 버튼들을 추가한다.
			bg.add(small);
			bg.add(medium);
			bg.add(large);
			setBorder(BorderFactory.createTitledBorder("크기"));
			add(small);
			add(medium);
			add(large);
		}
	}
//===========Order 클래스 생성========================
	class Order extends JPanel{
		public Order() {
			//버튼들을 생성
			JButton b1=new JButton("주문");
			JButton b2=new JButton("취소");
			JTextField tf=new JTextField("20000");
			//텍스트필드를 건드릴수 없게 하였다.
			tf.setEditable(false);
			//버튼과 텍스트필드를 추가한다.
			add(b1);
			add(b2);
			add(tf);
		}
	}
	public static void main(String[] args) {
		Pizza f = new Pizza();//실행한다.
	}

}

package report;
import java.awt.*;
import javax.swing.*;
import javax.swing.Timer;

import java.awt.event.*;
import java.util.*;

class speed {//그림들의 속도를 정해준다.
	int xspeed,yspeed;
	public speed(int xspeed, int yspeed) {
		this.xspeed=xspeed;
		this.yspeed=yspeed;
	}
	
}//class speed


/*class talk{
	int tx;
	int ty;
	public talk(int tx,int ty) {
		this.tx=tx;
		this.ty=ty;
	}
}*/

class Monster{//몬스터 클래스생성
	int x,y,hp;
	Image img;// 몬스턴 이미지 파일	
	Monster(int x, int y, int hp){
		this.x=x;//x좌표
		this.y=y;//y좌표
		this.hp=hp;	
	}
}







//======================================================================================
public class Monster4 extends JFrame implements ActionListener{
	
	int x,y;
	Image img;
	Image pose;
	//몬스터들의 값을 arraylist에 넣는다.
	ArrayList<Monster> list = new ArrayList<>();
	//몬스터에게 각자 속도를 지정해 주기 위해서
	ArrayList<speed> speed=new ArrayList<>();
	//몬스터들이 처음 소환되는 위치를 랜덤으로 만들기 위해서 
	Random random =new Random();
	//창의 크기
	private static final int width = 520;
	private static final int height=520;
	
	class Mypanel extends JPanel implements MouseListener{
		public Mypanel() {
			addMouseListener(this);
		for(int i=0;i<10;i++) {
			//0부터 520까지 중의 정수중에서
			//랜덤하게 좌표를 지정해준다.
				int x=random.nextInt(520);
				int y=random.nextInt(520);
				int hp=1;
		//x축으로 이동하는 속도
				int xspeed=5;
		//y축으로 이동하는 속도
				int yspeed=3;
		//speed배열에 각각xspeed와 yxpeed를 넣는다
				speed.add(new speed(xspeed,yspeed));
					list.add(new Monster(x,y,hp));
		} 
	}

	
		public void paintComponent(Graphics g) {
			super.paintComponent(g);//사진을 그린다.
			for(Monster m:list) {
	//불러온 사진을 세로가로 크기를 80으로 monster 좌표에 그린다.
			g.drawImage(img, m.x, m.y,80,80,this);
			}
	//모든 몬스터를 잡으면 승리를 출력한다.
			if(list.size()==0) {
				//폰트의 설정
				Font font =new Font("궁서체",Font.BOLD,50);
				setLayout(null);
				JLabel win=new JLabel("승민 내가 이겼다!!!!!!!");
				win.setFont(font);
				win.setLocation(80,150);
				win.setSize(600,50);
				add(win);
				//승리 포즈를 그린다.
				g.drawImage(pose, 110, 200, 300, 300,this);
				
			}
		}

		@Override
		public void mouseClicked(MouseEvent e) {
		}
		@Override
		public void mouseEntered(MouseEvent arg0) {
		}
		@Override
		public void mouseExited(MouseEvent arg0) {		
		}
//마우스르 누르면 발동
		@Override
		public void mousePressed(MouseEvent e) {
			for(int i=0;i<=list.size()-1;i++) {
		//Monster클래스에 list에서 값을 불러와서 대입한다.
				Monster m =list.get(i);
		//speed클래스에 speed배열에서 값들을 가져와서 대입한다.
				speed s = speed.get(i);
		//마우스가 눌린 곳의 좌표들을 불러온다.
				int cx=e.getX();
				int cy=e.getY();
		//마우스가 눌린 좌표와 몬스터의 위치와 같으면 각 배열에서 제거한다.
		//몬스터의 좌표에서 그림의 크기만큼을 범위로 지정해줘야
		//이미지를 클릭한걸로 인식이 된다.
				if(m.x<=cx&&m.x+80>=cx) {
					if(m.y<=cy&&m.y+80>=cy) {
						list.remove(i);
						speed.remove(i);
					}
				}
		}
	}
		@Override
		public void mouseReleased(MouseEvent arg0) {
		}	
	}//mypanel
		
//=====================================================		
	public void update() {
	//남아있는 몬스터의 수만큼 반복한다.
		for(int i=0; i<=list.size()-1;i++) {
	//Monster클래스에 list배열의 값들을 불러와서 대입한다
			Monster m = list.get(i);
	//speed클래스에 speep배열의 값들을 불러와서 대입한다.
			speed s= speed.get(i);
		//몬스터의 x좌표를 x축의 속도만큼 증가 시킨다.
			m.x +=s.xspeed;
		//몬스터의 y좌표를 y축의 속도만큼 증가 시킨다.
			m.y+=s.yspeed;
		//몬스터들의 좌표가 창을 넘어가지 않도록 만들어 준다.
			if(m.x>width||m.x<0)
				s.xspeed=-s.xspeed;
			if(m.y>height||m.y<0)
				s.yspeed=-s.yspeed;
		}
	}
	
	public Monster4(){
		//몬스터사진을 불러온다.
		ImageIcon icon =new ImageIcon("D:\\Monster.jpg");
		img = icon.getImage();
		//승리포즈 사진을 가져온다.
		ImageIcon vic =new ImageIcon("D:\\Victory.jpg");
		pose = vic.getImage();
		//창의 크기를 설정한다.
		setSize(600,600);
		//창의 제목을 설정
		setTitle("Monster Catch Game");
		setVisible(true);//눈에 보이게 프로그램 창을 띠운다.
		//창을 닫으면 프로그램을 종료한다.
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		//MyPanel을 추가한다.
		add(new Mypanel());
		//타이머를 설정한다.
		Timer timer = new Timer(10,this);
		//타이머를 시작한다.
		timer.start();
	}
		
	
	public static void main(String[] args) {
		Monster4 f = new Monster4();//실행한다.
		
		

}

//타이머가 시작되면 실행
	@Override
	public void actionPerformed(ActionEvent arg0) {
		update();//몬스터의 좌표를 갱신
		repaint();//다시 그린다.
		}		
	}
	


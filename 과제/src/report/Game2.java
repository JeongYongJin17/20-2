package report;
import java.awt.*;
import javax.swing.*;
import java.awt.event.*;

public class Game2 {
public static void main(String[] ar){
Game_frame rg = new Game_frame();
}
}



//=========================Game_frame클래스======================
class Game_frame extends JFrame implements Runnable, KeyListener{

	boolean keyUp = false;
	boolean keyDown = false;
	boolean keyLeft = false;
	boolean keyRight = false;
	boolean playerMove = false;

	Toolkit tk = Toolkit.getDefaultToolkit();

	Image img = new ImageIcon("D:\\20-2\\자바용\\sw개발\\AjFP5.png").getImage();
	//위에 이미지 이름이 바로 rpg.png입니다. 이미지를 불러옵니다
	Image buffimg;// 더블버퍼링용 입니다.
	Graphics gc;
	Thread th;

	int x, y; // 케릭터의 현재 좌표를 받을 변수
	int cnt; //무한 루프를 카운터 하기 위한 변수
	int moveStatus; //케릭터가 어디를 바라보는지 방향을 받을 변수


	Game_frame(){
		setTitle("테스트");
		setSize(800, 600);
		init();
		start();
 
		Dimension screen = tk.getScreenSize();

		int xpos = (int)(screen.getWidth() / 2 - getWidth() / 2);
		int ypos = (int)(screen.getHeight() / 2 - getHeight() / 2);
		setLocation(xpos, ypos);
		setResizable(false);
		setVisible(true);
}


	public void init(){
		x = 100;
		y = 100;
		moveStatus = 0;
//케릭터가 시작할때 바라보는 방향은 아래쪽입니다.
// 0 : 아래쪽, 1 : 왼쪽, 2 : 오른쪽, 3 : 위쪽
}

	public void start(){ // 기본적인 명령처리
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.addKeyListener(this);
		th = new Thread(this);
		th.start();
}

	public void run(){ // 스레드 메소드, 무한 루프
		while(true){
			try{
				keyProcess();
				repaint();
				Thread.sleep(20);
				cnt++;
			}catch(Exception e){}
		}
}

	
	
	public void paint(Graphics g){ //더블버퍼링을 사용합니다.
		buffimg = createImage(800, 600);
		gc = buffimg.getGraphics();
		update(g);
}

	
	public void update(Graphics g){
//더블 버퍼링을 이용해 버퍼에 그려진것을 가져옵니다.
		DrawImg();
		g.drawImage(buffimg, 0, 0, this);
}

	
	public void DrawImg(){
		gc.setFont(new Font("Default", Font.BOLD, 20));
		gc.drawString(Integer.toString(cnt), 50, 50);
		gc.drawString(Integer.toString((playerMove)?1:0),200, 50);
//위는 단순히 무한루프 적용여부와 케릭터 방향 체크를 위해
//눈으로 보면서 테스트할 용도로 쓰이는 텍스트 표출입니다.

		MoveImage(img, x, y, 64, 64);
//케릭터를 걸어가게 만들기 위해 추가로 만든 메소드 입니다.
}

	
	public void MoveImage(Image img, int x, int y, int width, int height){
//케릭터 이미지, 케릭터 위치, 케릭터 크기를 받습니다.
//받은 값을 이용해서 위의 이미지칩셋에서 케릭터를 잘라내
//표출하도록 계산하는 메소드 입니다.

		gc.setClip(x  , y, width, height);
//현재 좌표에서 케릭터의 크기 만큼 이미지를 잘라 그립니다.

		if( playerMove ){ // 케릭터의 움직임 여부를 판단합니다.
			if ( cnt / 10 % 4 == 0 ){
				gc.drawImage(img, x - ( width * 0 ), y - ( height * moveStatus ), this);
			}else  if(cnt/10%4 == 1){ 
				gc.drawImage(img, x - ( width * 1 ), y - ( height * moveStatus ), this);
			}else if(cnt/10%4 == 2){
				gc.drawImage(img, x - ( width * 2 ), y - ( height * moveStatus ), this);
			}else  if(cnt/10%4 == 3){
				gc.drawImage(img, x - ( width * 1 ), y - ( height * moveStatus ), this);
}
//케릭터의 방향에 따라 걸어가는 모션을 취하는 
//케릭터 이미지를 시간차를 이용해 순차적으로 그립니다.

		}else { gc.drawImage(img, x - ( width * 2 ), y - ( height * moveStatus ), this);
//케릭터가 움직이지 않으면 정지한 케릭터를 그립니다.
		}
}


	public void keyProcess(){
//여기서는 단순 케릭터가 이동하는 좌표 말고도
//케릭터의 움직임 여부및 방향을 체크 합니다.
		playerMove = false;

		if ( keyUp ){
			playerMove = true;
			y -= 8;
			moveStatus = 3;
		}

		if ( keyDown){
			y += 8;
			moveStatus = 0;
			playerMove = true;
		}

		if ( keyLeft){
			x -= 8;
			moveStatus = 1;
			playerMove = true;
		}

		if ( keyRight){
			x += 8;
			moveStatus = 2;
			playerMove = true;
		}
}

	
	public void keyPressed(KeyEvent e) {

		switch(e.getKeyCode()){
		case KeyEvent.VK_LEFT :
			keyLeft = true;
			break;
		case KeyEvent.VK_RIGHT :
			keyRight = true;
			break;
		case KeyEvent.VK_UP :
			keyUp = true;
			break;
		case KeyEvent.VK_DOWN :
			keyDown = true;
			break;
		}
}


	public void keyReleased(KeyEvent e) {
		switch(e.getKeyCode()){
		case KeyEvent.VK_LEFT :
			keyLeft = false;
			break;
		case KeyEvent.VK_RIGHT :
			keyRight = false;
			break;
		case KeyEvent.VK_UP :
			keyUp = false;
			break;
		case KeyEvent.VK_DOWN :
			keyDown = false;
			break;
		}
}


	public void keyTyped(KeyEvent e) {}

}//Game_frame클래스 끝
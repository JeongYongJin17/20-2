package Exercise;
import javax.swing.*;
import java.awt.event.*;
import java.awt. *; 
import java.awt. geom.*;

class MyPanel10 extends JPanel {
	public MyPanel10()
	{
		super();
		setBackground (Color.yellow );
		setSize( 400, 400);
	}
	public void paintComponent( Graphics g){
		super.paintComponent(g);
		int xPoints[] = { 55, 67, 109, 73, 83, 55, 27, 37, 1, 43 };
		int yPoints[] = { 0, 36, 36, 54, 96, 72, 96, 54, 36, 36 };
		
		Graphics2D g2d = ( Graphics2D) g;

			GeneralPath star = new GeneralPath();
			
			star.moveTo( xPoints[ 0], yPoints[0]);
			
			for (int k = 1; k < xPoints.length; k++ )
				star.lineTo(xPoints[k ], yPoints[k ] );
			
			star.closePath();
			
			g2d.translate( 100, 10);
			
			for (int j = 1; j <= 5; j++)
			{
				g2d.rotate (Math.PI / 30.0);
				g2d.setColor(new Color( ( int ) ( Math.random() * 256 ), (int) ( Math.random() * 256 ), 
						(int) (Math.random() * 256 ) ) ); 
				g2d.fill( star );
			}
	}
	}
	public class Num10 extends JFrame{ 
		public Num10() {
			setSize(600, 200); 
			setTitle("MyFrame"); 
			setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); 
			add(new MyPanel10()); 
			setVisible(true);
		}
		public static void main(String[] arge)
		{
			Num10 F=new Num10();
		}
	}
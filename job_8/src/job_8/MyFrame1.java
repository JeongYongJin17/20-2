package job_8;
import javax.swing.*;
import java.awt.FlowLayout;

public class MyFrame1 extends JFrame {
       public MyFrame1() {
             setSize(300, 200);
             setTitle("MyFrame");

             setLayout(new FlowLayout());		// (1)
             JButton button = new JButton("¹öÆ°");	// (2)
             add(button);				// (3)
             setVisible(true);
       }
       public static void main(String[] args) {
             MyFrame1 f = new MyFrame1();
       }
}
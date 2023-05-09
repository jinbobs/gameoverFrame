import java.awt.Color;
import java.awt.Font;
import java.awt.Graphics;
import java.awt.Image;

import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class GameOverFrame extends JFrame {
	private static final int FRAME_WIDTH = 690;
	private static final int FRAME_HEIGHT = 650;
	Operator o= null;
	ImageIcon i = new ImageIcon("gameoverImage.png");
    Image im=i.getImage();

	GameOverFrame(Operator _o){
		Database b=new Database();
		b.Score(Database.id);
		o=_o;
		
		MyPanel panel=new MyPanel();
		JLabel s= new JLabel();
		
		s.setForeground(Color.ORANGE);
		s.setText("Score: "+Database.id+"▶"+pacman.count+" 초");
		s.setBounds(200, 150, 300, 300);
		Font myFont1 = new Font("돋움", Font.BOLD, 25);
		s.setFont(myFont1);

		
		add(panel);
		panel.setLayout(null);
		panel.add (s);
		
		setTitle("PacmanGame");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setSize(FRAME_WIDTH, FRAME_HEIGHT);
		setVisible(false);
		
		
		
		
		
	}
	class MyPanel extends JPanel{
		
		public void paintComponent(Graphics g){
			super.paintComponent(g);
			g.drawImage(im,0,0,getWidth(),getHeight(),this);
		}
	}
	
	

}

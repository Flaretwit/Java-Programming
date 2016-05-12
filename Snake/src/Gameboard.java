import java.awt.BorderLayout;
import java.awt.Container;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
public class Gameboard {
	//contains all outside of game functions, help, 
	Container east = new Container();
	
	JFrame frame = new JFrame("Snake (Slither.io)");
	Run run = new Run();
	public Gameboard() {
		frame.setSize(1000,800);
		frame.setLayout(new BorderLayout());
		frame.add(run, BorderLayout.CENTER);
		
		east.setLayout(new BorderLayout());
		east.setSize(800,200);
		
		frame.add(east, BorderLayout.EAST);
		
		frame.setVisible(true);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.repaint();
		frame.setResizable(false);
		
		
		
	
	}
	
	public static void main(String[] args) {
		new Gameboard();
	}
	
}

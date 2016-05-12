import java.awt.Graphics;
import javax.swing.JPanel;
import java.awt.Color;

public class Run extends JPanel {
	//this will contain the gameboard and track what each grid is
	final int BLANK = 0;
	final int FOOD = 1;
	final int OCCUPIED = 2;
	
	
	int[][] field = new int[40][40]; //20 pixels per grid for now
	
	
	public Run() {
		super();
	}
	
	public void paintComponent(Graphics g) {
		super.paintComponent(g);
		g.setColor(Color.BLACK);
		g.fillRect(0, 0, getWidth(), getHeight());
		g.setColor(Color.RED);
		g.fillRect(800, 0, getWidth(), getHeight());
		
	}
}

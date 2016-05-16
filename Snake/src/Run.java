import java.awt.Graphics;
import javax.swing.JPanel;
import java.awt.Color;

public class Run extends JPanel {
	// this will contain the gameboard and track what each grid is
	final int BLANK = 0;
	final int FOOD = 1;
	final int OCCUPIED = 2;
	final int HEIGHT = 800;
	final int WIDTH = 800;
	final int PIXELS_PER_GRID = 40;
	Snake_Section snake = new Snake_Section();
	final int GRIDWIDTH = HEIGHT/PIXELS_PER_GRID; 

	int[][] field = new int[GRIDWIDTH][GRIDWIDTH]; // 40 pixels per grid for now

	public Run() {
		super();
	}

	public void paintComponent(Graphics g) {
		super.paintComponent(g);
		g.setColor(Color.BLACK);
		g.fillRect(0, 0, getWidth(), getHeight());
		g.setColor(Color.RED);
		g.fillRect(800, 0, getWidth(), getHeight());
		// paints columns lines
		for (int i = 0; i < WIDTH; i +=  PIXELS_PER_GRID) {
			g.setColor(Color.RED);
			g.drawLine(i, 0, i, 800);
		}
		// paints row lines for the grid
		for (int j = 0; j < HEIGHT; j += PIXELS_PER_GRID) {
			g.drawLine(0, j, 800, j);
		}

	}

	public void step() {
		moveSnake(snake.getDir());

	}

	public void moveSnake(int direction) {
		if (checkDeath() == true) {
			// do something that quits the game
		} else {

			if (direction == 0) {
				for (int i = 0; i < snake.length; i++) {
					snake.getPoint(i).setY(snake.getPoint(i).getY() + 1);
				}
			}
			if (direction == 1) {
				for (int i = 0; i < snake.length; i++) {
					snake.getPoint(i).setX(snake.getPoint(i).getX() + 1);
				}
			}
			if (direction == 2) {
				for (int i = 0; i < snake.length; i++) {
					snake.getPoint(i).setY(snake.getPoint(i).getY() - 1);
				}
			}
			if (direction == 1) {
				for (int i = 0; i < snake.length; i++) {
					snake.getPoint(i).setX(snake.getPoint(i).getX() - 1);
				}
			}
		}
	}
	
	
	//need to include this in checkDeath()
	public boolean collide() {
		for(int i = 0; i < length; i++) {
			if(snakeloc.get(i).getX() == head.getX() ||
					snakeloc.get(i).getX() == head.getY()) {
				return true;
			}
		}
		
		return false;
	}
	// checks for snake death by either 
	public boolean checkDeath() {
		
		for(int i = 0; i < snake.length; i++) {
			//if(snake.getPoint(i).getX() >= GRIDWIDTH) {
		}
	}

}

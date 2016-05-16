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
	final int PIXELS_PER_SQUARE = 40;
	Snake_Section snake = new Snake_Section();
	final int SQUAREWIDTH = HEIGHT / PIXELS_PER_SQUARE;

	int[][] field = new int[SQUAREWIDTH][SQUAREWIDTH]; // 40 pixels per grid for
														// now

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
		for (int i = 0; i < WIDTH; i += PIXELS_PER_SQUARE) {
			g.setColor(Color.RED);
			g.drawLine(i, 0, i, 800);
		}
		// paints row lines for the grid
		for (int j = 0; j < HEIGHT; j += PIXELS_PER_SQUARE) {
			g.drawLine(0, j, 800, j);
		}

	}

	public void step() {
		if (!checkDeath()) {
			moveSnake(snake.getDir());
			
		} else {
			// quits the game running to false
		}

	}
	//moves the snake body
	public void moveSnake(int direction) {
		if (direction == 0) {
			snake.head.setY(snake.head.getY() + 1);
		}
		if (direction == 1) {
			snake.head.setX(snake.head.getX() + 1);
		}
		if (direction == 2) {
			snake.head.setY(snake.head.getY() - 1);
		}
		if (direction == 3) {
			snake.head.setX(snake.head.getX() - 1);
		}
		//sets the coordinates of each snake_section to the 
		//coordinates of the one previous to it
		for(int i = 1; i < snake.length; i++) {
			snake.getPoint(i).setX(snake.getPoint(i-1).getX());
			snake.getPoint(i).setY(snake.getPoint(i-1).getY());
		}
	}

	// need to include this in checkDeath()

	// checks for snake death by either
	public boolean checkDeath() {
		for(int i = 0; i < snake.length; i++) {
			if(snake.getPoint(i).getX() == snake.head.getX() ||
					snake.snakeloc.get(i).getX() == snake.head.getY()) {
				return true;
			}
		}
		
		for(int i = 0; i < snake.length; i++) {
			if(snake.getPoint(i).getX() >= SQUAREWIDTH) {
		}
	}

}
}

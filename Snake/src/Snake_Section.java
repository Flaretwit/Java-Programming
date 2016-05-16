import java.awt.geom.Point2D;
import java.util.ArrayList;

public class Snake_Section  {
	//0 is facing up, 1 is facing east, 2 is facing south, 3 is facing west
	//(randomly chosen upon snake spawn)
	int direction;
	ArrayList<Point> snakeloc = new ArrayList<Point>();
	int length = snakeloc.size();
	Point head = snakeloc.get(0);
	
	
	public int getDir() {
		return direction;
	}
	public void setDir(int dir) {
		direction = dir;
	}
	
	public void setPoint(int x, int y) {
		Point tail = new Point();
		tail.setX(x);
		tail.setY(y);
		snakeloc.add(tail);
	}
	public Point getPoint(int i) {
		return snakeloc.get(i);
	}
	
}

class Point {
	int x;
	int y;
	//this.x refers to the class variable	
	public void setX(int x) {
		this.x = x;
	}
	
	public int getX() {
		return x;
	}
	
	public void setY(int y) {
		this.y = y;
	}
	public int getY() {
		return y;
	}
	
}

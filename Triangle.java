import java.awt.Color;
import java.awt.Graphics2D;
import java.awt.Shape;


public class Triangle 
{
	private int side;
	Graphics2D ga;
	
	public Triangle(int side, Graphics2D ga)
	{
		this.side = side;
		this.ga = ga;
	}
	
	public void display(int x, int y)
	{
		ga.setPaint(Color.red);
	    int center = side/2;
	    int[] xCoords = {0, center, side};
	    int bottomY = (int)Math.sqrt((center * center) + (side*side));
	    int[] yCoords = {bottomY, y, bottomY};
	    ga.drawPolyline(xCoords, yCoords, 3);
	}
}


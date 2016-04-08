import java.awt.Color;
import java.awt.Graphics2D;


public class Square 
{
	private int side;
	Graphics2D ga;
	
	public Square(int side, Graphics2D ga)
	{
		this.side = side;
		this.ga = ga;
	}
	
	public void display(int x, int y)
	{
		ga.setPaint(Color.red);
	    ga.drawRect(x, y, this.side, this.side);
	}
}

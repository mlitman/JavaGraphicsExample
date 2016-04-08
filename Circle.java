import java.awt.Color;
import java.awt.Graphics2D;


public class Circle 
{
	private int diameter;
	Graphics2D ga;
	
	public Circle(int diameter, Graphics2D ga)
	{
		this.diameter = diameter;
		this.ga = ga;
	}
	
	public void display(int x, int y)
	{
		ga.setPaint(Color.red);
	    ga.drawOval(x,y,this.diameter,this.diameter);
	}
}

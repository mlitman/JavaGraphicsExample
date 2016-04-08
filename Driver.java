import java.lang.*;
import java.util.*;
import java.util.List;
import java.io.*;
import java.awt.*;
import java.awt.event.*;
import java.awt.geom.*;

public class Driver extends Frame
{
	public static void main(String[] args)
	{
		Driver frame = new Driver();       
	    frame.addWindowListener(
	      new WindowAdapter()
	      {
	         public void windowClosing(WindowEvent we)
	         {
	            System.exit(0);
	         }
	      }
	      );
	            
	      frame.setSize(400, 400);
	      frame.setVisible(true);
	}
	
	public void paint(Graphics g) 
	{
	     Graphics2D ga = (Graphics2D)g;
	     Circle c = new Circle(100, ga);
	     Square s = new Square(70, ga);
	     Triangle t = new Triangle(35, ga);
	     c.display(10, 30);
	     s.display(30, 40);
	     t.display(150, 150);
	}
}

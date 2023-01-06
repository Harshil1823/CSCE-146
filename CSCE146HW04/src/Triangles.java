import java.awt.*;
import javax.swing.*;
/*
 * Harshil shah
 */
public class Triangles extends Canvas {
	
	public static final int SIZE = 900;
	
	public static void main(String[] args) {

		JFrame frame = new JFrame("Triangle");
		frame.setSize(SIZE,SIZE);
		Triangles sp = new Triangles();//creates a instance of class Triangles which is canvas
		frame.add(sp);
		frame.setVisible(true);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); //turns off the execution of program when closing the GUI window
		
	}//main

	public void paint(Graphics g)
	{
		drawTriangles(g);
	}
	public void drawTriangles(Graphics g){
		int tri = (int)Math.round(SIZE*Math.sqrt(3.0 / 2.0));
		Point p1 = new Point(0, tri);
		Point p2 = new Point(SIZE /2, 0);
		Point p3 = new Point(SIZE, tri);
		drawShape(7, p1, p2, p3, g);//change the first number to see how big you want your triangles (1 is cool).
	}
	
	public static void drawShape(int level, Point p1, Point p2, Point p3, Graphics g )
	{
		if(level == 1)
		{
			Polygon p = new Polygon();
			p.addPoint(p1.x, p1.y);
			p.addPoint(p2.x, p2.y);
			p.addPoint(p3.x, p3.y);
			g.fillPolygon(p);
		}
		else
		{
			//split into 3 triagnle
			Point p4 = midPoint(p1,p2);
			Point p5 = midPoint(p2,p3);
			Point p6 = midPoint(p1,p3);
			
			drawShape(level - 1, p1, p4, p6, g);
			drawShape(level - 1, p4, p2, p5, g);
			drawShape(level - 1, p6, p5, p3, g);

		}
	}
	
	public static Point midPoint(Point p1, Point p2)
	{
        return new Point((p1.x + p2.x) / 2, (p1.y + p2.y) / 2);
	}
}


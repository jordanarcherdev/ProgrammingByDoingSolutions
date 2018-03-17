import java.awt.*;
import java.awt.Polygon;
import javax.swing.JFrame;

public class DrawingABoringTriangle extends Canvas
{
    public void paint(Graphics g)
    {
        Polygon tri = new Polygon();
        tri.addPoint(300,300);
        tri.addPoint(200,600);
        tri.addPoint(400,600);
        
        g.setColor(Color.blue);
        g.fillPolygon(tri);
        
    }
    
    public static void main(String[] args)
    {
        JFrame win = new JFrame("Drawing a boring triangle");
        win.setSize(800,800);
        win.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        win.add(new DrawingABoringTriangle());
        win.setVisible(true);
    }
}

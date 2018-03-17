import java.awt.*;
import java.awt.Polygon;
import javax.swing.JFrame;
import java.util.Random;

public class DrawingRandomTriangles extends Canvas
{
    public void paint(Graphics g)
    {
        Random r = new Random();
        
        
        for (int i = 0; i <= 500; i++)
        {
            Polygon tri = new Polygon();
            tri.addPoint(1+r.nextInt(1000),1+r.nextInt(1000));
            tri.addPoint(1+r.nextInt(1000),1+r.nextInt(1000));
            tri.addPoint(1+r.nextInt(1000),1+r.nextInt(1000));
            
            Color rColors = new Color(1+r.nextInt(256),1+r.nextInt(256),1+r.nextInt(256));
            g.setColor(rColors);
            g.fillPolygon(tri);
        }
    }
        
        public static void main(String[] args)
        {
            JFrame win = new JFrame("Drawing random triangles");
            win.setSize(1000,1000);
            win.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
            win.add(new DrawingRandomTriangles());
            win.setVisible(true);
        }
            
}

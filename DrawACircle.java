import java.awt.*;
import javax.swing.JFrame;

public class DrawACircle extends Canvas
{
    public void paint(Graphics g)
    {
        g.setColor(Color.green);
        g.fillOval(200,150,300,300);
    }
    
    public static void main(String[] args)
    {
        JFrame win = new JFrame("Drawing a circle");
        win.setSize(800,600);
        win.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        DrawACircle canvas = new DrawACircle();
        win.add(canvas);
        win.setVisible(true);
    }
}

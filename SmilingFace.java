import java.awt.*;
import javax.swing.JFrame;

public class SmilingFace extends Canvas
{
    public void paint(Graphics g)
    {
        g.setColor(Color.yellow);
        g.fillOval(200,150,300,300);
        
        g.setColor(Color.blue);
        g.fillOval(400,250,50,50);
        g.fillOval(250,250,50,50);
        
        g.setColor(Color.red);
        g.drawArc(250,150,200,250,200,140);
        
        
    }
    
    public static void main(String[] args)
    {
        JFrame win = new JFrame("Smiling face");
        win.setSize(800,600);
        win.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        SmilingFace canvas = new SmilingFace();
        win.add(canvas);
        win.setVisible(true);
    }
}

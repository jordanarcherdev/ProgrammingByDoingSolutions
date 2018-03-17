import java.awt.*;
import javax.swing.JFrame;

public class ClockFace extends Canvas
{
    public void paint(Graphics g)
    {
        g.setColor(Color.black);
        g.drawOval(200,150,300,300);
        g.setFont(new Font("Calibri", Font.PLAIN, 36));
        g.drawString("12", 333,180);
        g.drawString("3", 480,310);
        g.drawString("6", 340,445);
        g.drawString("9",205,310);
        g.drawLine(350,300,440,300);
        g.drawLine(350,300,350,200);
        
        
        

}

public static void main(String[] args)
{
    JFrame win = new JFrame("Clock face");
    win.setSize(800,600);
    win.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    ClockFace canvas = new ClockFace();
    win.add(canvas);
    win.setVisible(true);
}
}

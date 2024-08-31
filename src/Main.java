import java.awt.*;
import javax.swing.*;
public class Main extends Canvas  {

    public void paint(Graphics g){
        g.setColor(Color.green);
        g.setColor(Color.ORANGE);
        g.drawLine(20,20,400,400);

        g.setColor(Color.BLUE);
        g.draw3DRect(50,50,200,100,true);

        g.setColor(Color.RED);
        g.draw3DRect(100,100,150,75,false);

        g.setColor(Color.black);
    }
    public static void main(String[] args) {
        JFrame jf = new JFrame("canvas");
        Main m = new Main();

        jf.setSize(600,400);
        jf.setVisible(true);
        jf.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        jf.add(m);
    }

}
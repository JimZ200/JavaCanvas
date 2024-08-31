import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.awt.image.BufferedImage;

public class myPanel extends JPanel implements ActionListener {
    final int PANEL_WIDTH = 500;
    final int PANEL_HEIGHT = 500;

    Image background;
    Image image;

    Timer timer;
    int xVel = 1;
    int yVel = 1;
    int x = 0;
    int y = 0;
    myPanel(){
        this.setPreferredSize(new Dimension(PANEL_WIDTH, PANEL_HEIGHT));
        this.setBackground(Color.black);

        image = new ImageIcon("si.png").getImage();

        timer = new Timer(1000,this);
        timer.start();
    }

    public void paint(Graphics g){
        super.paint(g);
        Graphics2D g2D = (Graphics2D) g;
        g2D.drawImage(image, x, y, 100,100,this);
    }
    @Override
    public void actionPerformed(ActionEvent e){

    }
}

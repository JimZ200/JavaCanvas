import javax.swing.*;
import java.awt.*;
public class myFrame extends JFrame {
    myPanel panel;
    myFrame(){
        panel = new myPanel();
        this.add(panel);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.pack();
        this.setLocationRelativeTo(null);
        this.setVisible(true);
    }
}

import javax.swing.*;
import java.awt.*;

public class FrameWithPanel {

    public static void main(String[] args) {
        Frame myFrame = new Frame();
        myFrame.setDefaultCloseOperation( JFrame.EXIT_ON_CLOSE );
        myFrame.setVisible(true); 
    }

    static class Frame extends JFrame {

        public Frame() {
            setTitle("This is a frame!");
            setSize(300, 200);
            setLocation(100, 200);

            Panel myPanel = new Panel();
            Container cp = getContentPane();
            cp.add(myPanel);
        }

    } 

    static class Panel extends JPanel {

        public void paintComponent( Graphics g ) {
            super.paintComponent( g );
            g.drawString("Hi", 75, 100);
        }

    }
}
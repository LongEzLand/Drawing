/**
 * Created by Lazarus on 5.01.2017.
 */

import java.awt.Canvas;
import java.awt.Graphics;
import javax.swing.JFrame;
import java.awt.Color;

public class Drawing extends Canvas {
    public static void main(String[]args){
        JFrame frame = new JFrame("My Drawing");
        Color crimson = new Color(128, 0, 0);
        Canvas canvas = new Drawing();
        canvas.setSize(640, 480);
        canvas.setBackground(crimson);
        frame.add(canvas);
        frame.pack();
        frame.setVisible(true);




    }
    public void paint(Graphics g){
        g.fillOval(160,80,320,320);

    }
}

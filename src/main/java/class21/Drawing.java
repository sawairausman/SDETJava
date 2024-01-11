package class21;

import javax.swing.*;
import java.awt.*;

public class Drawing {

    public static void main(String[] args) {
        JFrame jFrame = new JFrame();
        jFrame.setSize(2000,2000);//set the dimension of the frame

        MyDrawing m= new MyDrawing();
        jFrame.add(m);
        jFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        jFrame.setVisible(true);

    }
}
//created my own child class and extented to Canvas class..we can write override method
class MyDrawing extends Canvas {

    @Override
    public void paint(Graphics g){
        g.setColor(Color.PINK);
        for(int i=100; i<600; i=i+50){
            g.fillOval(i, 200, 500, 500);
        }

    }

}

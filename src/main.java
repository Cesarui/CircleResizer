//Cesar Pimentel

import javax.swing.*;

public class main {
    public static void main(String[] args) {


        JFrame frame = new JFrame("Resizable Circle");
        TestResizableCircle panel = new TestResizableCircle();

        frame.add(panel);
        frame.setSize(600,400);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        frame.setVisible(true);

    }
}
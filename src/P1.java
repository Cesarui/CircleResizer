//Cesar Pimentel

import javax.swing.*;

/**
 * Main class to run the ResizableCircle GUI application.
 * Creates and displays a window with an interactive resizable circle.
 */
public class P1 {
    public static void main(String[] args) {


        JFrame frame = new JFrame("Resizable Circle");
        TestResizableCircle panel = new TestResizableCircle();

        frame.add(panel);
        frame.setSize(600,400);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        frame.setVisible(true);

    }
}
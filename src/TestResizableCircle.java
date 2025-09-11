import javax.swing.*;
import java.awt.*;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

public class TestResizableCircle extends JPanel {
    ResizableCircle circle1 = new ResizableCircle(50);

    Point circle1Center = new Point(300,200);

    public TestResizableCircle() {
        addMouseListener(new MouseAdapter() {
            @Override
            public void mousePressed(MouseEvent press) {
                /* When left mouse button is clicked, the resize method gets called and increases the circles radius
                   by whatever percentage you set it as.
                */
                if (press.getButton() == MouseEvent.BUTTON1) {
                    circle1.setRadius(circle1.resize(1.3));
                    repaint();
                }
                /*
                    Here the opposite happens, when right mouse button is clicked, the circle gets multiplied by
                    an amount less than 1 so the radius decreases.
                 */
                else if (press.getButton() == MouseEvent.BUTTON3) {
                    circle1.setRadius(circle1.resize(0.8));
                    repaint();
                }
            }
        });
    }
    /* This method is in charge of actually painting the circle.
     */
    protected void paintComponent(Graphics graphics) {
        super.paintComponent(graphics);

        graphics.setColor(Color.BLUE);
        graphics.fillOval(circle1Center.x - (int)circle1.getRadius(),
                circle1Center.y - (int)circle1.getRadius(),
                (int)circle1.getRadius() * 2,
                (int)circle1.getRadius() * 2);
    }
}

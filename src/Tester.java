//Cesar Pimentel

import org.junit.Test;
import javax.swing.*;

/**
 * The tester class, to make sure GUI and all logic are working correctly.
 */
public class Tester {
    @Test
    public void test() {

        ResizableCircle circle1 = new ResizableCircle(5.0);
        ResizableCircle circle2 = new ResizableCircle(5.0);
        System.out.println(circle1.equals(circle2));
        String text = "blah blah";

        System.out.println(circle1.equals(text));
    }
}

//Cesar Pimentel

/**
 * Abstract Circle class that implements the GeometricShape interface, with its default
 * constructor in case of no input, and the other one for creating a circle with your own radius.
 *
 *
 *
 */

public abstract class Circle implements  GeometricShape{
    protected double radius;
    protected static final double PI = Math.PI;

    public Circle() {
        this.radius = 1.0;
    }
    public Circle(double radius) {
        this.radius = radius;
    }

    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }

    @Override
    public double getPerimeter() {
        return 2 * PI * radius;
    }

    @Override
    public double getArea() {
        return PI * radius * radius;
    }

    @Override
    public String toString() {
        return "Circle[radius=" + radius + "]";
    }
}

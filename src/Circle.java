//Cesar Pimentel

/**
 * Abstract base class representing a geometric circle.
 * This class implements the GeometricShape interface.
 */
public abstract class Circle implements  GeometricShape{
    protected double radius;
    protected static final double PI = Math.PI;

    /**
     * Creates a circle with the default radius value of 1.0
     */
    public Circle() {
        this.radius = 1.0;
    }

    /**
     * Creates a circle with the specified radius.
     *
     * @param radius the radius of the circle (should be positive)
     */
    public Circle(double radius) {
        this.radius = radius;
    }

    /**
     * Returns the radius of the circle.
     *
     * @return the current radius value
     */
    public double getRadius() {
        return radius;
    }

    /**
     * Sets the radius of the circle.
     *
     * @param radius the new radius value (should be positive)
     */
    public void setRadius(double radius) {
        this.radius = radius;
    }

    /**
     * Calculates and returns the perimeter of the circle.
     * Uses the formula: 2 * PI * radius
     *
     * @return the perimeter of the circle
     */
    @Override
    public double getPerimeter() {
        return 2 * PI * radius;
    }

    /**
     * Calculates the area of the circle.
     * Uses the formula: PI * radius * radius
     *
     * @return area of the circle
     */
    @Override
    public double getArea() {
        return PI * radius * radius;
    }

    /**
     * Returns a string representation of the circle.
     *
     * @return a string in the format "Circle[radius=value]"
     */
    @Override
    public String toString() {
        return "Circle[radius=" + radius + "]";
    }
}

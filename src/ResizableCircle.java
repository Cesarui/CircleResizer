//Cesar Pimentel

/**
 * A circle that can be resized by a percentage factor.
 * Extends the Circle class and implements the Resizable interface.
 */
public class ResizableCircle extends Circle implements Resizable {

    /**
     * Creates a ResizableCircle with default radius of 1.0.
     */
    public ResizableCircle(){
        super();
    }

    /**
     * Creates a ResizableCircle with the specified radius.
     *
     * @param radius the radius of the circle
     */
    public ResizableCircle(double radius) {
        super(radius);
    }

    /**
     * Resizes the circle by the given percentage.
     *
     * @param percent the scaling factor (1.0 = no change, 2.0 = double size)
     * @return the new radius after resizing
     */
    @Override
    public double resize(double percent) {
        return (int) (radius = radius * percent);
    }

    /**
     * Returns a string representation of this ResizableCircle.
     *
     * @return string in format "ResizableCircle[radius=value]"
     */
    @Override
    public String toString() {
        return "ResizableCircle[radius=" + radius + "]";
    }

    /**
     * Compares this ResizableCircle with another object for equality.
     * Two ResizableCircles are equal if they have the same radius.
     *
     * @param obj the object to compare with
     * @return true if the objects are equal, false otherwise
     */
    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null) return false;
        if (!(obj instanceof ResizableCircle other)) return false;

        return Double.compare(this.radius, other.radius) == 0;
    }
}
//Cesar Pimentel

/**
 * This interface is for resizable objects.
 * <li>Use values greater than 1.0 to make bigger.</li>
 * <li>Use values less than 1.0 to make smaller.</li>
 */
public interface Resizable {
    /**
     * Resizes the object by the specified percentage factor.
     *
     * @param percent the scaling factor (1.0 = no change, 2.0 = double size, 0.5 = half size)
     */
    double resize(double percent);
}

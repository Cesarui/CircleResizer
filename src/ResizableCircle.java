public class ResizableCircle extends Circle implements Rezisable{

    public ResizableCircle(){
        super();
    }

    public ResizableCircle(double radius) {
        super(radius);
    }


    @Override
    public double resize(double percent) {
        return (int) (radius = radius * percent);
    }

    @Override
    public String toString() {
        return "ResizableCircle[radius=" + radius + "]";
    }
}

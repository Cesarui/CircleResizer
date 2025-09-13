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

    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null) return false;
        if (!(obj instanceof ResizableCircle other)) return false;

        return Double.compare(this.radius, other.radius) == 0;
    }
}

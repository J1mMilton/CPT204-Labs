package lab3;

public class ComparableCircle extends Circle implements Comparable<Circle> {

    public ComparableCircle() {
    }

    public ComparableCircle(double rad) {
        super(rad);
    }

    @Override
    public String toString() {
        return "The bigger radius is " + getRadius();
    }
    @Override
    public int compareTo(Circle o) {
        if (this.getRadius() == o.getRadius()) {
            return 0;
        }
        else if (this.getRadius() > o.getRadius()) {
            return 1;
        }
        return -1;
    }
}

package lab2;

public class MyPoint {
    private double x;
    private double y;

    public MyPoint() {
        x = 0.0;
        y = 0.0;
    }

    public MyPoint(double x, double y) {
        this.x = x;
        this.y = y;
    }

    public double distance(MyPoint point) {
        return Math.sqrt((x-point.getX())*(x-point.getX()) + (y-point.getY())*(y-point.getY()));
    }

    public static double distance(MyPoint a, MyPoint b) {
        //System.out.println(a.getX()-b.getX());
        //System.out.println(a.getY()-b.getY());
        return Math.sqrt((a.getX()-b.getX())*(a.getX()-b.getX()) + (a.getY()-b.getY())*(a.getY()-b.getY()));
    }

    public double getX() {
        return x;
    }

    public double getY() {
        return y;
    }


}

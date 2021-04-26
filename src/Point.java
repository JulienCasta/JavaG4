public class Point {
    private final static double DFL_X = 0;
    private final static double DFL_Y = 0;
    private double x, y;

    Point(double x, double y) {
        this.x = x;
        this.y = y;
    }

    Point() {
        this(DFL_X, DFL_Y);
    }

    public void setX(double x) {
        this.x = x;
    }

    public double getX() {
        return x;
    }

    public void setY(double y) {
        this.y = y;
    }

    public double getY() {
        return y;
    }

    public void move(double x, double y) {
        this.x = x;
        this.y = y;
    }

    public double getDistance(double x, double y) {
        return Math.sqrt(Math.pow(this.x - x, 2)) + Math.pow((this.y - y), 2));
    }

    @Override
    public String toString() {
        return "("+x+","+y+")";
    }
}

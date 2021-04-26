public class Circle {
    private Point center;
    private double radius;

    Circle(Point center, double radius) {
        this.center = center;
        this.radius = radius;
    }

    public void setCenter(Point center) {
        this.center = center;
    }

    public Point getCenter() {
        return center;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }

    public double getY() {
        return radius;
    }

    public double getArea() {
        return Math.PI * radius * radius;
    }

    public double getPerimeter() {
        return 2 * Math.PI * radius;
    }

    public boolean isPointInside(Point p) {
        if(p.getDistance(center.getX(), center.getY()) == radius){
            return true;
        }
        return false;
    }

    @Override
    public String toString() {
        return "("+center.getX()+","+center.getY()+","+radius+")";
    }
}

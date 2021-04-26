public class Circle {

    private double radius;
    private Point center;

    public Circle(Point x, int radius){
        this.center = x;
        this.radius = radius;
    }

    public double perimetre() {

        return 2*Math.PI*radius;
    }

    public double getArea(){
        return Math.PI*radius*radius;
    }

    public double getRadius() {
        return radius;
    }

    public Point getCenter() {
        return center;
    }

    public void setCenter(Point center) {
        this.center = center;
    }

    public void setRadius(int radius) {
        this.radius = radius;
    }
}

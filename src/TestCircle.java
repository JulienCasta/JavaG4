public class TestCircle {
    public static void main(String[] args) {
        Point point = new Point(5,5);
        Circle circle = new Circle(point, 2);

        System.out.println(circle.getPerimeter());
        System.out.println(circle.getArea());
    }
}

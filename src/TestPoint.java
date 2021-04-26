public class TestPoint {
    public static void main(String[] args) {
        Point p = new Point(4,5);
        Point p1 = new Point();
        Point p2 = new Point();

        System.out.println(p);
        System.out.println(p1);
        System.out.println(p2);

        p.move(4, 5);
        p1.move(1,2);
        p2.move(3,7);

        System.out.println("Point 1 :"+p);
        System.out.println("Point 2 :"+p1);
        System.out.println("Point 3 :"+p2);



    }
}
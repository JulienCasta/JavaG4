public class Point {
    public final static float DFL_X=0;
    public final static float DFL_Y=0;
    private float x, y;

    public float getX() {
        return x;
    }

    public void setX(float x) {
        this.x = x;
    }

    public float getY() {
        return y;
    }

    public void setY(float y) {
        this.y = y;
    }

    public Point(float x, float y) {
        this.x = x;
        this.y = y;
    }

    public Point() {
        this(DFL_X,DFL_Y);
    }

    public void move(double x, double y){
        this.x += x;
        this.y += y;
    }

    @Override
    public String toString() {
        return "Point{" +
                "x=" + x +
                ", y=" + y +
                '}';
    }
}
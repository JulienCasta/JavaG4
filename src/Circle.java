public class Circle {

    int rayon;

    public Circle(Point x, int rayon){
        this.rayon = rayon;
    }

    public double perimetre() {
        return 2*Math.PI*rayon;
    }

}

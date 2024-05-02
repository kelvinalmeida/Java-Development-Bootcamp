package shape;
public class Sphere extends Shape {

    public Sphere(double radius) {
        super(radius);
    }

    public double getArea() {
        return (4/3) * PI * Math.pow(super.getRadius(), 3);
    }

    public double getVolume() {
        return 4 * PI * Math.pow(super.getRadius(), 2);
    }

}
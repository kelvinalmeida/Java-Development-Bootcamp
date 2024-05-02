package shape;

public abstract class Shape {

    public static final double PI = 3.14;
    
    private double radius;

    public Shape(double radius) {
        this.radius = radius;
    }

    public double getRadius() {
        return this.radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }

    public abstract double getArea();
    public abstract double getVolume();
}
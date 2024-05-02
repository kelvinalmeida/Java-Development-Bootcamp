package shape;

public class Cylinder extends Shape {

    private double height;

    public Cylinder(double radios, double height) {
        super(radios);
        this.height = height;
    }

    public double getHeight() {
        return this.height;
    }

    public void setHeight(double height) {
        this.height = height;
    }
  
}
  
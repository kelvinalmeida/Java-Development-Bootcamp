package shape;
import java.math.*;

public class Cylinder extends Shape {

    private double height;

    public Cylinder(double radius, double height) {
        super(radius);
        this.height = height;
    }

    public double getHeight() {
        return this.height;
    }

    public void setHeight(double height) {
        this.height = height;
    }

    public double getArea() {
        return PI * Math.pow(super.getRadius(), 2)  + this.height;
    }


    public double getVolume() {
        return 2 *  PI * Math.pow(super.getRadius(), 2) + 2 * PI * super.getRadius() * this.height; 
    }
  
}
  
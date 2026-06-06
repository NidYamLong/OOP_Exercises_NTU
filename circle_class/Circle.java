package circle_class;

/**
 *  @Author Leonardo Marques - 06/06/2026
*/

public class Circle {

    private double radius = 1.0;

    public Circle(double radius) {
        setRadius(radius);
    }

    public Circle(){}

    public double getRadius() {
        return this.radius;
    }

    public final void setRadius(double radius) {
        this.radius = radius;
    }
    
    public double getArea() {
        return Math.PI * Math.pow(getRadius(), 2);
    }

    public double getCircumference() {
        return 2 * Math.PI * getRadius();
    }

    @Override
    public String toString() {
        return "Circle[radius=" + getRadius() + "]";
    }
}

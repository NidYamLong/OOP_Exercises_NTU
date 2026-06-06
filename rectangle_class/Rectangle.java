package rectangle_class;

/**
 *  @Author Leonardo Marques - 06/06/2026
*/

public class Rectangle {
    private float length = 1.0f;
    private float width = 1.0f;

    public Rectangle(float length, float width) {
        setLength(length);
        setWidth(width);
    }

    public Rectangle() {}

    public float getLength() {
        return this.length;
    }

    public final void setLength(float length) {
        this.length = length;
    }

    public float getWidth() {
        return this.width;
    }

    public final void setWidth(float width) {
        this.width = width;
    }

    public double getArea() {
        return getLength() * getWidth();
    }

    public double getPerimeter() {
        return 2 * (getLength() + getWidth());
    }

    @Override
    public String toString() {
        return "Rectangle[length=" + getLength() +
            "width=" + getWidth() + "]";
    }
}
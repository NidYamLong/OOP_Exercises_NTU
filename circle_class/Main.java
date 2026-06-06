package circle_class;
/* 
    The expected output is:

    Circle[radius=1.1]
    Circle[radius=1.0]
    Circle[radius=2.2]
    radius is: 2.2
    area is: 15.21
    circumference is: 13.82
*/

public class Main {
   public static void main(String[] args) {
      // Test Constructors and toString()
      Circle c1 = new Circle(1.1);
      System.out.println(c1);   // toString()
      Circle c2 = new Circle(); // default constructor
      System.out.println(c2);

      // Test setter and getter
      c1.setRadius(2.2);
      System.out.println(c1);      // toString()
      System.out.println("radius is: " + c1.getRadius());

      // Test getArea() and getCircumference()
      System.out.printf("area is: %.2f%n", c1.getArea());
      System.out.printf("circumference is: %.2f%n", c1.getCircumference());
   }
}

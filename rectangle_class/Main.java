package rectangle_class;

/*
    The expected output is:

    Rectangle[length=1.2,width=3.4]
    Rectangle[length=1.0,width=1.0]
    Rectangle[length=5.6,width=7.8]
    length is: 5.6
    width is: 7.8
    area is: 43.68
    perimeter is: 26.80
*/

public class Main {
     public static void main(String[] args) {
      // Test constructors and toString()
      // You need to append a 'f' or 'F' to a float literal
      Rectangle r1 = new Rectangle(1.2f, 3.4f);
      System.out.println(r1);  // toString()
      Rectangle r2 = new Rectangle();  // default constructor
      System.out.println(r2);

      // Test setters and getters
      r1.setLength(5.6f);
      r1.setWidth(7.8f);
      System.out.println(r1);  // toString()
      System.out.println("length is: " + r1.getLength());
      System.out.println("width is: " + r1.getWidth());

      // Test getArea() and getPerimeter()
      System.out.printf("area is: %.2f%n", r1.getArea());
      System.out.printf("perimeter is: %.2f%n", r1.getPerimeter());
   }
}

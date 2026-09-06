package ball_class;

/*
    The expected output is:

    Ball[(1.1,2.2),speed=(3.3,4.4)]
    Ball[(80.0,35.0),speed=(4.0,6.0)]
    x is: 80.0
    y is: 35.0
    radius is: 5
    xDelta is: 4.0
    yDelta is: 6.0
    Ball[(84.0,41.0),speed=(4.0,6.0)]
    Ball[(88.0,47.0),speed=(4.0,6.0)]
    Ball[(92.0,41.0),speed=(4.0,-6.0)]
    Ball[(96.0,35.0),speed=(4.0,-6.0)]
    Ball[(92.0,29.0),speed=(-4.0,-6.0)]
    Ball[(88.0,23.0),speed=(-4.0,-6.0)]
    Ball[(84.0,17.0),speed=(-4.0,-6.0)]
    Ball[(80.0,11.0),speed=(-4.0,-6.0)]
    Ball[(76.0,5.0),speed=(-4.0,-6.0)]
    Ball[(72.0,-1.0),speed=(-4.0,-6.0)]
    Ball[(68.0,5.0),speed=(-4.0,6.0)]
    Ball[(64.0,11.0),speed=(-4.0,6.0)]
    Ball[(60.0,17.0),speed=(-4.0,6.0)]
    Ball[(56.0,23.0),speed=(-4.0,6.0)]
    Ball[(52.0,29.0),speed=(-4.0,6.0)]
*/

public class Main {
    public static void main(String[] args) {
      // Test constructor and toString()
      Ball ball = new Ball(1.1f, 2.2f, 10, 3.3f, 4.4f);
      System.out.println(ball);  // toString()

      // Test Setters and Getters
      ball.setX(80.0f);
      ball.setY(35.0f);
      ball.setRadius(5);
      ball.setXDelta(4.0f);
      ball.setYDelta(6.0f);
      System.out.println(ball);  // toString()
      System.out.println("x is: " + ball.getX());
      System.out.println("y is: " + ball.getY());
      System.out.println("radius is: " + ball.getRadius());
      System.out.println("xDelta is: " + ball.getXDelta());
      System.out.println("yDelta is: " + ball.getYDelta());

      // Bounce the ball within the boundary
      float xMin = 0.0f;
      float xMax = 100.0f;
      float yMin = 0.0f;
      float yMax = 50.0f;
      for (int i = 0; i < 15; i++) {
         ball.move();
         System.out.println(ball);
         float xNew = ball.getX();
         float yNew = ball.getY();
         int radius = ball.getRadius();
         // Check boundary value to bounce back
         if ((xNew + radius) > xMax || (xNew - radius) < xMin) {
            ball.reflectHorizontal();
         }
         if ((yNew + radius) > yMax || (yNew - radius) < yMin) {
            ball.reflectVertical();
         }
      }
   }
}
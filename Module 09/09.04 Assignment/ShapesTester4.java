
/**
 * This class demonstrates classes that override
 * the toString method. This program helps me get
 * a better understanding of overriding methods
 * and using subclasses
 *
 * @author Eli DeWitt
 * @version 3/8/22
 * 
 * @PMR This assigment was relatively simple. Everything about subclasses and sharing 
 * attributes and methods makes a lot of sense and accurately represents how we see
 * real world objects
 */
import java.util.*;
public class ShapesTester4 {

    public static void main(String[] args) {
      ArrayList<Rectangle4> shapes = new ArrayList<Rectangle4>();
  
      shapes.add(new Rectangle4(5, 20));
      shapes.add(new Rectangle4(50, 2));
      shapes.add(new Rectangle4(5, 100));
      shapes.add(new Rectangle4(4580, 58));
      shapes.add(new Rectangle4(557, 20747));
      shapes.add(new Box4(4, 10, 5));
      shapes.add(new Box4(2, 10, 5));
      shapes.add(new Box4(10, 10, 1));
      shapes.add(new Box4(45, 100, 10));
  
      shapes.add(new Cube4(4));
      shapes.add(new Cube4(5));
  
      shapes.add(new Cube4(400));
      shapes.add(new ParallelogramPrism4(5, 15, 58));
      shapes.add(new ParallelogramPrism4(78, 12, 5545));
      shapes.add(new ParallelogramPrism4(245, 24, 24));
  
      shapes.add(new KitePrism4( 5, 5, 4)); 
      shapes.add(new KitePrism4( 540, 571, 40)); 
      shapes.add(new KitePrism4( 100, 1, 1)); 
  
  
      System.out.println("My Shapes: \n");
      for (Rectangle4 rect : shapes) {
        showEffectBoth(rect);
      }
      System.out.println("\n");
  
      equalityTest(shapes.get(0), shapes);
    }
  
    public static void showEffectBoth(Rectangle4 r) {
      System.out.println(r);
    }
  
    public static void equalityTest(Rectangle4 rect, ArrayList<Rectangle4> shapes) {
      System.out.println("Testing " + rect + " for equality\n");
      for (Rectangle4 shape : shapes) {
        if (rect != shape) {
          if (rect.equals() == shape.equals()) { 
            System.out.println(shape + " IS the same size as " + rect);
          } else {
            System.out.println(shape + " is NOT the same size as " + rect);
          }
        }
      }

    }
  }
/**
 * 
 * 
 * 
 * @author Eli DeWitt
 * @version 03/07/22
 * 
 * @PMR I like how this relates very well to real world objects. The
 * methods, loops, and arraylists make it simple to understand what the
 * code is accomplishing.
 */

import java.util.ArrayList;
public class CircleTester {
    public static void main(String [] args) {
        ArrayList<Circle2> circles = new ArrayList<Circle2>();
        circles.add(new Circle2(5, 6, 7));
        circles.add(new Cylinder2(7, 7, 8, 16));
        circles.add(new Oval2(1, 42, 58, 75));
        circles.add(new OvalCylinder2(2, 2, 3, 5, 5));

        for (Circle2 circle : circles) showCenter(circle);
    }

    public static void showCenter(Circle2 c) {
        System.out.println("For this " + c.getName() + " the center is at " + c.getCenter());
    }
}

public class KitePrism4 extends Box4 {

    // Constructor for objects of class Box
    public KitePrism4(int l, int w, int h) {
      // call superclass
      super(l, w, h);
    }
  
    public String toString() {
      return (
        "Kite Prism - " +
        getLength() +
        " X " +
        getWidth() +
        " X " +
        getHeight()
      );
    }
  }
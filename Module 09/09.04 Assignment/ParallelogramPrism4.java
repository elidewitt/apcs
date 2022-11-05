public class ParallelogramPrism4 extends Box4 {
    public ParallelogramPrism4(int l, int w, int h) {
        super(l, w, h);
    }
    public String toString() {
        return (
          "Parallelogram Prism - " +
          getLength() +
          " X " +
          getWidth() +
          " X " +
          getHeight()
        );
      }
}

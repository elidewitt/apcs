public class Cube4 extends Box4 {
    public Cube4 (int l) {
        super(l, l, l);
    }

    public String toString() {
        return "Cube - " + getLength() + " X " + getWidth() + " X " + getHeight();
    }
}

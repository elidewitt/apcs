public class Catapult {

    private double speed;
    private double angle;
    static final double g = 9.8;

    Catapult(double _speed, double _angle) {
        speed = _speed;
        angle = _angle;
    }

    public double calcDistance() {
        return (speed * speed * Math.sin(2 * Math.toRadians(angle)))/g;
    }
}

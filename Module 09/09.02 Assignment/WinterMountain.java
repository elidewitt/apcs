public class WinterMountain extends Mountain {
    private double temp;
    public WinterMountain(int l, int w, int m, double t) {
        super(l, w, m);
        temp = t;
    }
    public String getWinterMountainInfo() {
        return "Winter " + getMountains() + " and a temperature of " + temp + " degrees";
    }
}

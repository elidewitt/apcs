public class Mountain extends Terrain {
    private int count;
    public Mountain(int l, int w, int m) {
        super(l, w);
        count = m;
    }
    
    public String getMountains() {
        return "Mountain " + getTerrainSize() + " and has " + count + " mountains";
    }
}

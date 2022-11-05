public class Desert extends Terrain{
    private int cactusCount;
    public Desert(int l, int w, int c) {
        super(l, w);
        cactusCount = c;
    }
    public String getDesertInfo() {
        return "Desert " + getTerrainSize() + " and has " + cactusCount + " Cacti";
    }
}

public class Forest extends Terrain{
    private int treeCount;
    public Forest(int l, int w, int t) {
        super(l, w);
        treeCount = t;
    }

    public String getTrees() {
        return "Forest " + getTerrainSize() + " and has " + treeCount + " trees";
    }
}

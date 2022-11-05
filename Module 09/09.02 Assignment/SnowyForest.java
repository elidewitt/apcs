public class SnowyForest extends Forest {
    private int snow;
    public SnowyForest(int l, int w, int t, int s) {
        super(l, w, t);
        snow = s;
    }

    public String getSnowyForestInfo() {
        return "Snowy " + getTrees() + " and has " + snow + " inches of snow";
    }
}

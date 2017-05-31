package flowers;

/**
 * Created by white on 13.05.2017.
 */
public enum Freshness  {
    FULL (15), MIDDLE (10), OLD (5);
    Freshness(int cost) {
        this.cost = cost;
    }

    private int cost;

    public int getCost() {
        return cost;
    }
}

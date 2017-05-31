package flowers;

/**
 * Created by white on 20.05.2017.
 */
public enum FlowersTypes {
    ROSE(0), VIOLET(1), TULIP(2), HYDRANGEA(3), CARNATION(4);
    FlowersTypes(int number) {
        this.number = number;
    }

    private int number;

    public int getNumber() {
        return number;
    }
}

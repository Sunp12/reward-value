public class RewardValue {
    private double cashValue;
    private int miles;

    public RewardValue(double cashValue) {
        this.cashValue=cashValue;
    }
    public RewardValue(int miles) {
        this.miles=miles;
    }

    public double getCashValue() {
        return this.cashValue;
    }


    public int getMilesValue() {
        return this.miles;
    }
}

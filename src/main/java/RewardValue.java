public class RewardValue {
    private double cashValue;
    private int milesValue;
    private static final double MILES_TO_CASHRATE=0.0035;

    public RewardValue(double cashValue) {
        this.cashValue=cashValue;
        this.milesValue= (int)( cashValue/MILES_TO_CASHRATE);
    }
    public RewardValue(int milesValue) {
        this.milesValue=milesValue;
        this.cashValue=milesValue*MILES_TO_CASHRATE;
    }

    public double getCashValue() {
        return this.cashValue;
    }


    public int getMilesValue() {
        return this.milesValue;
    }
}

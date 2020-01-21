package tax;

public class FeatureToggle {
    // Need to update this. Static = one everywhere. Issues
    public boolean FEATURE_FOUR_SECOND_TAX_PAYMENTS;
    public boolean FEATURE_FIVE_EXPENSIVE_TAX_PAYMENTS;


    public FeatureToggle() {

    }

    public void setFEATURE_FOUR_SECOND_TAX_PAYMENTS(boolean FEATURE_FOUR_SECOND_TAX_PAYMENTS) {
        this.FEATURE_FOUR_SECOND_TAX_PAYMENTS = FEATURE_FOUR_SECOND_TAX_PAYMENTS;
    }

    public void setFEATURE_FIVE_EXPENSIVE_TAX_PAYMENTS(boolean FEATURE_FIVE_EXPENSIVE_TAX_PAYMENTS) {
        this.FEATURE_FIVE_EXPENSIVE_TAX_PAYMENTS = FEATURE_FIVE_EXPENSIVE_TAX_PAYMENTS;
    }
}

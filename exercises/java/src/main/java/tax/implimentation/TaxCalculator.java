package tax.implimentation;

import tax.FeatureToggle;
import tax.model.Vehicle;

import java.time.LocalDate;

public abstract class TaxCalculator{
    private final int year;
    public FeatureToggle featureToggle;
    public abstract int calculateTax(Vehicle vehicle);


    public TaxCalculator(FeatureToggle featureToggle) {
        this(LocalDate.now().getYear());
        this.featureToggle = featureToggle;
    }

    TaxCalculator(){
        this(LocalDate.now().getYear());
    }

    TaxCalculator(int year){
        this.year = year;
    }

    int getYear() {
        return year;
    }

    public FeatureToggle getFeatureToggle() {
        return featureToggle;
    }

}

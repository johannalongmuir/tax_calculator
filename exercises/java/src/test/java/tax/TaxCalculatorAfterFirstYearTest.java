package tax;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import java.time.LocalDate;
import static java.time.Month.APRIL;
import static org.assertj.core.api.Assertions.assertThat;
import static tax.FuelType.*;

public class TaxCalculatorAfterFirstYearTest {

    private static final LocalDate FIRST_OF_APRIL_2017 = LocalDate.of(2017, APRIL, 1);
    private TaxCalculator taxCalculator;

    @Before
    public void setUp() {
        taxCalculator = new DefaultTaxCalculator();
        taxCalculator.getFeatureToggle().setFEATURE_FOUR_SECOND_TAX_PAYMENTS(true);
    }


//    @After
//    public void reset(){
//        FeatureToggle.FEATURE_FOUR_SECOND_TAX_PAYMENTS = false;
//    }

    @Test
    public void subsequentYearsTaxForPetrol() {
        Vehicle vehicle = new Vehicle(206, PETROL, FIRST_OF_APRIL_2017, 20000);
        assertThat(taxCalculator.calculateTax(vehicle)).isEqualTo(140);
    }

    @Test
    public void subsequentYearsTaxForElectric() {
        Vehicle vehicle = new Vehicle(206, ELECTRIC, FIRST_OF_APRIL_2017, 20000);
        assertThat(taxCalculator.calculateTax(vehicle)).isEqualTo(0);
    }

    @Test
    public void subsequentYearsTaxForAlternativeFuel() {
        Vehicle vehicle = new Vehicle(206, ALTERNATIVE_FUEL, FIRST_OF_APRIL_2017, 20000);
        assertThat(taxCalculator.calculateTax(vehicle)).isEqualTo(130);
    }

    @Test
    public void subsequentYearsTaxForDiesel() {
        Vehicle vehicle = new Vehicle(206, DIESEL, FIRST_OF_APRIL_2017, 20000);
        assertThat(taxCalculator.calculateTax(vehicle)).isEqualTo(140);
    }

    @Test
    public void subsequentYearsTaxForExpensiveVehicle() {
        Vehicle vehicle = new Vehicle(206, DIESEL, FIRST_OF_APRIL_2017, 50000);
        assertThat(taxCalculator.calculateTax(vehicle)).isEqualTo(140);
    }

}

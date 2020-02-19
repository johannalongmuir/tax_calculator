package tax.model.taxbrackets;

import tax.model.FuelType;

import java.util.HashMap;

public class TaxForExpensiveVehicles {
    private HashMap<FuelType, Integer> taxForExpensiveVehicles = new HashMap<>();

    public TaxForExpensiveVehicles() {

        taxForExpensiveVehicles.put(FuelType.PETROL, 450);
        taxForExpensiveVehicles.put(FuelType.DIESEL, 450);
        taxForExpensiveVehicles.put(FuelType.ELECTRIC, 310);
        taxForExpensiveVehicles.put(FuelType.ALTERNATIVE_FUEL, 440);
    }

    public HashMap<FuelType, Integer> getTaxForExpensiveVehicles() {
        return taxForExpensiveVehicles;
    }

}

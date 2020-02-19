package tax.model.taxbrackets;

import java.util.HashMap;

public class PetrolFirstYearTaxAmount {
    private HashMap<String, Integer> petrolFirstYearTax = new HashMap<>();

    public PetrolFirstYearTaxAmount() {
        petrolFirstYearTax.put("0-0", 0);
        petrolFirstYearTax.put("1-50", 10);
        petrolFirstYearTax.put("51-75", 25);
        petrolFirstYearTax.put("76-90", 105);
        petrolFirstYearTax.put("91-100", 125);
        petrolFirstYearTax.put("101-110", 145);
        petrolFirstYearTax.put("111-130", 165);
        petrolFirstYearTax.put("131-150", 205);
        petrolFirstYearTax.put("151-170", 515);
        petrolFirstYearTax.put("171-190", 830);
        petrolFirstYearTax.put("191-225", 1240);
        petrolFirstYearTax.put("226-255", 1760);
        petrolFirstYearTax.put("255+", 2070);

    }

    public HashMap<String, Integer> getPetrolFirstYearTax() {
        return petrolFirstYearTax;
    }

}

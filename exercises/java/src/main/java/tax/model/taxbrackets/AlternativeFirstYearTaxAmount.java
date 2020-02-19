package tax.model.taxbrackets;

import java.util.HashMap;

public class AlternativeFirstYearTaxAmount {
    private HashMap<String, Integer> alternativeFirstYearTax = new HashMap<>();

    public AlternativeFirstYearTaxAmount() {
        alternativeFirstYearTax.put("0-0", 0);
        alternativeFirstYearTax.put("1-50", 0);
        alternativeFirstYearTax.put("51-75", 15);
        alternativeFirstYearTax.put("76-90", 95);
        alternativeFirstYearTax.put("91-100", 115);
        alternativeFirstYearTax.put("101-110", 135);
        alternativeFirstYearTax.put("111-130", 155);
        alternativeFirstYearTax.put("131-150", 195);
        alternativeFirstYearTax.put("151-170", 505);
        alternativeFirstYearTax.put("171-190", 820);
        alternativeFirstYearTax.put("191-225", 1230);
        alternativeFirstYearTax.put("226-255", 1750);
        alternativeFirstYearTax.put("255+", 2060);
    }

    public HashMap<String, Integer> getAlternativeFirstYearTax() {
        return alternativeFirstYearTax;
    }
}

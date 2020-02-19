package tax.model.taxbrackets;

import java.util.ArrayList;

public class TaxBand {
    private Integer minValue;
    private Integer maxValue;
    private String taxBracket;

    public TaxBand(Integer minValue, Integer maxValue, String taxBracket) {
        this.minValue = minValue;
        this.maxValue = maxValue;
        this.taxBracket = taxBracket;
    }

    public Integer getMinValue() {
        return minValue;
    }

    public Integer getMaxValue() {
        return maxValue;
    }

    public String getTaxBracket() {
        return taxBracket;
    }


}

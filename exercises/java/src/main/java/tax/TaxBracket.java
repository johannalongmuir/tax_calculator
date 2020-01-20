package tax;

import java.util.ArrayList;

public class TaxBracket {
    private Integer minValue;
    private Integer maxValue;
    private String taxBracket;

    public TaxBracket(Integer minValue, Integer maxValue, String taxBracket) {
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

package tax;

import java.util.ArrayList;

public class FirstYearTaxBand {
    private static ArrayList<TaxBracket> allTaxBracket = new ArrayList<>();
    static {
        allTaxBracket.add(new TaxBracket(Integer.MIN_VALUE, -1, "INVALID"));
        allTaxBracket.add(new TaxBracket(0, 0, "0-0"));
        allTaxBracket.add(new TaxBracket(1, 50, "1-50"));
        allTaxBracket.add(new TaxBracket(51, 75, "51-75"));
        allTaxBracket.add(new TaxBracket(76, 90, "76-90"));
        allTaxBracket.add(new TaxBracket(91, 100, "91-100"));
        allTaxBracket.add(new TaxBracket(101, 110, "101-110"));
        allTaxBracket.add(new TaxBracket(111, 130,"111-130"));
        allTaxBracket.add(new TaxBracket(131, 150, "131-150"));
        allTaxBracket.add(new TaxBracket(151, 170,"151-170"));
        allTaxBracket.add(new TaxBracket(171, 190,"171-190"));
        allTaxBracket.add(new TaxBracket(191, 225,"191-225"));
        allTaxBracket.add(new TaxBracket(226, 255,"226-255"));
        allTaxBracket.add(new TaxBracket(255, Integer.MAX_VALUE,"255+"));
    }

    public static ArrayList<TaxBracket> getFirstYearTaxBand() {
        return allTaxBracket;
    }
}

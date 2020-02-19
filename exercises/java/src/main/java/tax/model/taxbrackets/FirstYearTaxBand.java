package tax.model.taxbrackets;

import java.util.ArrayList;

public class FirstYearTaxBand {
    private static ArrayList<TaxBand> allTaxBands = new ArrayList<>();
    static {
        allTaxBands.add(new TaxBand(Integer.MIN_VALUE, -1, "INVALID"));
        allTaxBands.add(new TaxBand(0, 0, "0-0"));
        allTaxBands.add(new TaxBand(1, 50, "1-50"));
        allTaxBands.add(new TaxBand(51, 75, "51-75"));
        allTaxBands.add(new TaxBand(76, 90, "76-90"));
        allTaxBands.add(new TaxBand(91, 100, "91-100"));
        allTaxBands.add(new TaxBand(101, 110, "101-110"));
        allTaxBands.add(new TaxBand(111, 130,"111-130"));
        allTaxBands.add(new TaxBand(131, 150, "131-150"));
        allTaxBands.add(new TaxBand(151, 170,"151-170"));
        allTaxBands.add(new TaxBand(171, 190,"171-190"));
        allTaxBands.add(new TaxBand(191, 225,"191-225"));
        allTaxBands.add(new TaxBand(226, 255,"226-255"));
        allTaxBands.add(new TaxBand(255, Integer.MAX_VALUE,"255+"));
    }

    public static ArrayList<TaxBand> getFirstYearTaxBand() {
        return allTaxBands;
    }
}

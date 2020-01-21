package tax;

public class DefaultTaxCalculator extends TaxCalculator {

    private static final int CURRENT_YEAR = 2019;

    @Override
    int calculateTax(Vehicle vehicle) {
        if (CURRENT_YEAR == vehicle.getDateOfFirstRegistration().getYear()) {
            String taxBracket = getTaxBand(vehicle);
            if (vehicle.getFuelType().equals(FuelType.PETROL)) {
                return calculatePetrolVehicleTaxWithTaxBracket(taxBracket);
            } else if (vehicle.getFuelType().equals(FuelType.DIESEL)) {
                return calculateDieselVehicleTax(vehicle);
            } else if (vehicle.getFuelType().equals(FuelType.ALTERNATIVE_FUEL)) {
                return calculateAlternativeVehicleTaxWithTaxBracket(taxBracket);
            } else if (vehicle.getFuelType().equals(FuelType.ELECTRIC)) {
                return calculateAlternativeVehicleTaxWithTaxBracket(taxBracket);
            }
        } else if (CURRENT_YEAR > vehicle.getDateOfFirstRegistration().getYear()){
            if (FeatureToggle.FEATURE_FOUR_SECOND_TAX_PAYMENTS){
                return calculateTaxAfterFirstYear(vehicle);
            }
        }
        return -1;
    }

    private int calculateTaxAfterFirstYear(Vehicle vehicle) {
        if (vehicle.getFuelType().equals(FuelType.PETROL)){
            return 140;
        } else if (vehicle.getFuelType().equals(FuelType.ELECTRIC)){
            return 0;
        } else if (vehicle.getFuelType().equals(FuelType.ALTERNATIVE_FUEL)){
            return 130;
        } else {
            return -1;
        }
    }


    private String getTaxBand(Vehicle vehicle) {
        for (int i = 0; i < FirstYearTaxBand.getFirstYearTaxBand().size(); i++) {
            if(vehicle.getCo2Emissions() >= FirstYearTaxBand.getFirstYearTaxBand().get(i).getMinValue()) {
                if (vehicle.getCo2Emissions() <= FirstYearTaxBand.getFirstYearTaxBand().get(i).getMaxValue()) {
                    return FirstYearTaxBand.getFirstYearTaxBand().get(i).getTaxBracket();
                }
            }
        }
        return "Error";
    }


    private int calculatePetrolVehicleTaxWithTaxBracket(String taxBracket) {
        PetrolFirstYearTax petrolFirstYearTax = new PetrolFirstYearTax();
        return petrolFirstYearTax.getPetrolFirstYearTax().get(taxBracket);
    }

    private int calculateAlternativeVehicleTaxWithTaxBracket(String taxBracket) {
        AlternativeFirstYearTax alternativeFirstYearTax = new AlternativeFirstYearTax();
        return alternativeFirstYearTax.getAlternativeFirstYearTax().get(taxBracket);
    }


    private int calculateDieselVehicleTax(Vehicle vehicle) {

        if (vehicle.getCo2Emissions() > 255) {
            return 2070;
        }
        if (vehicle.getCo2Emissions() >= 226) {
            return 2070;
        }
        if (vehicle.getCo2Emissions() >= 191) {
            return 1760;
        }
        if (vehicle.getCo2Emissions() >= 171) {
            return 1240;
        }
        if (vehicle.getCo2Emissions() >= 151) {
            return 830;
        }
        if (vehicle.getCo2Emissions() >= 131) {
            return 515;
        }
        if (vehicle.getCo2Emissions() >= 111) {
            return 205;
        }
        if (vehicle.getCo2Emissions() >= 101) {
            return 165;
        }
        if (vehicle.getCo2Emissions() >= 91) {
            return 145;
        }
        if (vehicle.getCo2Emissions() >= 76) {
            return 125;
        }
        if (vehicle.getCo2Emissions() >= 51) {
            return 105;
        }
        if (vehicle.getCo2Emissions() >= 1) {
            return 25;
        }
        return 0;
    }
}

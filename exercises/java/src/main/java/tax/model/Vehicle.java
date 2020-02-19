package tax.model;

import java.time.LocalDate;

public class Vehicle {
    private final int co2Emissions;
    private final FuelType fuelType;
    private final LocalDate dateOfFirstRegistration;
    private final int listPrice;
    private boolean RDE2;

    public Vehicle(int co2Emissions, FuelType fuelType, LocalDate dateOfFirstRegistration, int listPrice) {
        this.co2Emissions = co2Emissions;
        this.fuelType = fuelType;
        this.dateOfFirstRegistration = dateOfFirstRegistration;
        this.listPrice = listPrice;
        this.RDE2 = false;
    }

    public int getCo2Emissions() {
        return co2Emissions;
    }

    public FuelType getFuelType() {
        return fuelType;
    }

    public LocalDate getDateOfFirstRegistration() {
        return dateOfFirstRegistration;
    }

    int getListPrice() {
        return listPrice;
    }

    private void setRDE2(boolean RD2) {
        this.RDE2 = RD2;
    }


    public void withRDE2(){
        setRDE2(true);
    }


    public boolean isRDE2() {
        return RDE2;
    }
}

package domain;

import java.time.LocalDate;

public class Helicopter extends Vehicle {
    private int numOfScrew;
    private int loadCapacity;
    private int screwPower;


    public Helicopter(String name, int serialNumber, double length, double width, int numOfPlaces, LocalDate dateOfManufacture) {
        super(name, serialNumber, length, width, numOfPlaces, dateOfManufacture);
    }

    public int getNumOfScrew() {
        return numOfScrew;
    }

    public void setNumOfScrew(int numOfScrew) {

        this.numOfScrew = numOfScrew;
    }

    public int getLoadCapacity() {
        return loadCapacity;
    }

    public void setLoadCapacity(int loadCapacity) {
        this.loadCapacity = loadCapacity;
    }

    public int getScrewPower() {
        return screwPower;
    }

    public void setScrewPower(int screwPower) {
        this.screwPower = screwPower;
    }
//    @Override
//    public String getDescription() {
//        return "Helicopter with " + numOfScrew + "screw(s)";
//    }
//    @Override
//    public String toString() {
//        return "Helicopter{" + "numOfScrew= " + numOfScrew + "}";
//    }
}



package domain;

import java.time.LocalDate;

public class Airplane extends Vehicle {
    private int numOfEngines;
    private String automaticAvionicExisting;
    private int takeOffLength;

    public Airplane(String name, int serialNumber, double length, double width, int numOfPlaces, LocalDate dateOfManufacture) {
        super(name, serialNumber, length, width, numOfPlaces, dateOfManufacture);
    }

    public int getNumOfEngines() {
        return numOfEngines;
    }

    public void setNumOfEngines(int numOfEngines) {
        this.numOfEngines = numOfEngines;
    }

    public String getAutomaticAvionicExisting() {
        return automaticAvionicExisting;
    }

    public void setAutomaticAvionicExisting(String automaticAvionicExisting) {
        this.automaticAvionicExisting = automaticAvionicExisting;
    }

    public int getTakeOffLength() {
        return takeOffLength;
    }

    public void setTakeOffLength(int takeOffLength) {
        this.takeOffLength = takeOffLength;
    }
    //    @Override
//    public String getDescription() {
//        return "Airplanes with " + takeOffLength +"length";
//    }
//
//    @Override
//    public String toString() {
//        return "Airplane{" + "takeOffLength= " + takeOffLength + "}";
//    }
}

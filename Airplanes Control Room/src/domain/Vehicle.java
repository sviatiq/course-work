package domain;

import java.time.LocalDate;

public abstract class Vehicle {
    private String name;
    private int serialNumber;
    private double length;
    private double width;
    private String numOfPlaces;
    private LocalDate dateOfManufacture;

    //public abstract String getDescription();


    public Vehicle(String name, int serialNumber, double length, double width, String numOfPlaces, LocalDate dateOfManufacture) {
        this.name = name;
        this.serialNumber = serialNumber;
        this.length = length;
        this.width = width;
        this.numOfPlaces = numOfPlaces;
        this.dateOfManufacture = dateOfManufacture;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getLength() {
        return length;
    }

    public void setLength(double length) {
        this.length = length;
    }

    public double getWidth() {
        return width;
    }

    public void setWidth(double width) {
        this.width = width;
    }

    public String getNumOfPlaces() {
        return numOfPlaces;
    }

    public void setNumOfPlaces(String numOfPlaces) {
        this.numOfPlaces = numOfPlaces;
    }

    public int getSerialNumber() {
        return serialNumber;
    }

    public void setSerialNumber(int serialNumber) {
        this.serialNumber = serialNumber;
    }

    public LocalDate getDateOfManufacture() {
        return dateOfManufacture;
    }

    public void setDateOfManufacture(LocalDate dateOfManufacture) {
        this.dateOfManufacture = dateOfManufacture;
    }
}

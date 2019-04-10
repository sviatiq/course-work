package domain;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;

public class FlightPermit {
    private int FlightPermitId;
    private FlightPermitStatus flightPermitStatus;
    private LocalDateTime flightPermitDate;
    private Airplane passengerAirplane;
    private Airplane cargoAirplane;
    private List<Helicopter> helicopters;
    private String flightNumber;
    private Runway runwayLine;
    private LocalDateTime flightTime ;

    public String getFlightNumber() {
        return flightNumber;
    }

    public void setFlightNumber(String flightNumber) {
        this.flightNumber = flightNumber;
    }

    public Runway getRunwayLine() {
        return runwayLine;
    }

    public void setRunwayLine(Runway runwayLine) {
        this.runwayLine = runwayLine;
    }

    public LocalDateTime getFlightTime() {
        return flightTime;
    }

    public void setFlightTime(LocalDateTime flightTime) {
        this.flightTime = flightTime;
    }

    public int getFlightPermitId() {
        return FlightPermitId;
    }

    public void setFlightPermitId(int flightPermitId) {
        FlightPermitId = flightPermitId;
    }

    public FlightPermitStatus getFlightPermitStatus() {
        return flightPermitStatus;
    }

    public void setFlightPermitStatus(FlightPermitStatus flightPermitStatus) {
        this.flightPermitStatus = flightPermitStatus;
    }

    public LocalDateTime getFlightPermitDate() {
        return flightPermitDate;
    }

    public void setFlightPermitDate(LocalDateTime flightPermitDate) {
        this.flightPermitDate = flightPermitDate;
    }

    public Airplane getPassengerAirplane() {
        return passengerAirplane;
    }

    public void setPassengerAirplane(Airplane passengerAirplane) {
        this.passengerAirplane = passengerAirplane;
    }

    public Airplane getCargoAirplane() {
        return cargoAirplane;
    }

    public void setCargoAirplane(Airplane cargoAirplane) {
        this.cargoAirplane = cargoAirplane;
    }

    public List<Helicopter> getHelicopters() {
        return helicopters;
    }

    public void addHelicopters(Helicopter helicopter) {
        if(helicopter == null){
            helicopters = new ArrayList<Helicopter>(2);
        }
    }
}
